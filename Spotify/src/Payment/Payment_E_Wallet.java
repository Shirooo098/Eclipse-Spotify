package Payment;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.*;

public class Payment_E_Wallet extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;
    private JTextField textField_1;
    pmAction pmAct = new pmAction();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Payment_E_Wallet frame = new Payment_E_Wallet();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Payment_E_Wallet() {
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1113, 801);
        container = new JPanel();
        container.setBackground(new Color(14, 10, 26));
        container.setBorder(new EmptyBorder(5, 5, 5, 5));

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        setContentPane(container);

        JPanel logoPanel = new JPanel(new BorderLayout());
        logoPanel.setBackground(new Color(14, 10, 26));
        container.setLayout(new BorderLayout());
        container.add(logoPanel, BorderLayout.NORTH);

        JLabel logoLabel = new JLabel("");
        logoPanel.add(logoLabel, BorderLayout.SOUTH);

        // Main content
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(35, 26, 66));
        container.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(null);

        JLabel lblChooseYourPlan = new JLabel("PAY VIA G-CASH");
        lblChooseYourPlan.setBounds(211, 83, 667, 35);
        lblChooseYourPlan.setForeground(new Color(255, 255, 255));
        lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
        lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
        lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
        mainPanel.add(lblChooseYourPlan);

        JPanel panel = new JPanel();
        panel.setBounds(242, 334, 600, 233);
        mainPanel.add(panel);
        panel.setLayout(null);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        textField_1.setBounds(35, 60, 536, 45);
        panel.add(textField_1);
        textField_1.setColumns(10);

        ((AbstractDocument) textField_1.getDocument()).setDocumentFilter(new DocumentFilter() {
            
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + string;
                if (newStr.matches("\\d{0,11}")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newStr.matches("\\d{0,11}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        JLabel lblNewLabel = new JLabel("Enter your Mobile Number");
        lblNewLabel.setBounds(25, 24, 207, 26);
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(0, 0, 0));

        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnSubmit.setBounds(245, 162, 104, 35);
        panel.add(btnSubmit);

        final JCheckBox chckbxNewCheckBox = new JCheckBox("I agree that all my information is correct.");
        chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        chckbxNewCheckBox.setBounds(35, 123, 305, 21);
        panel.add(chckbxNewCheckBox);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(7, 125, 250));
        panel_1.setLayout(null);
        panel_1.setBounds(242, 139, 600, 185);
        mainPanel.add(panel_1);

        JLabel lblOrderConfirmation = new JLabel("Order Confirmation:");
        lblOrderConfirmation.setForeground(new Color(255, 255, 255));
        lblOrderConfirmation.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblOrderConfirmation.setBounds(25, 24, 207, 26);
        panel_1.add(lblOrderConfirmation);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(35, 60, 537, 79);
        panel_1.add(panel_1_1);
        
                final JComboBox<String> comboBox = new JComboBox<String>(pmAct.getSubscriptions());
                comboBox.setBounds(0, 0, 537, 79);
                panel_1_1.add(comboBox);
                comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> combo = (JComboBox<String>) e.getSource();
                String selectedSub = (String) combo.getSelectedItem();

                switch (selectedSub) {
                    case "149.00":
                        LocalDate currentDate = LocalDate.now();
                        LocalDate subscriptionEndDate = currentDate.plusDays(60);
                        String messageStandard = "Payment Confirmed!\n\n" +
                                "Subscription Type: Standard Plan\n" +
                                "Subscription Start: " + currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                "Subscription End: " + subscriptionEndDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                "Payment Method: GCASH";
                        JOptionPane.showMessageDialog(container, messageStandard);
                        break;
                    case "499.00":
                        LocalDate currentDatePremium = LocalDate.now();
                        LocalDate subscriptionEndDatePremium = currentDatePremium.plusDays(92);
                        String messagePremium = "Payment Confirmed!\n\n" +
                                "Subscription Type: Premium Plan\n" +
                                "Subscription Start: " + currentDatePremium.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                "Subscription End: " + subscriptionEndDatePremium.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                "Payment Method: Premium Payment";
                        JOptionPane.showMessageDialog(container, messagePremium);
                        break;
                }
            }
        });

        JLabel lblNewLabel_1 = new JLabel("SMALLLOGO");
        lblNewLabel_1.setBounds(30, 20, 162, 38);
        mainPanel.add(lblNewLabel_1);
        ImageIcon smologo = new ImageIcon(this.getClass().getResource("/small logo.png"));
        lblNewLabel_1.setIcon(smologo);

        JLabel lblNewLabel_2 = new JLabel("< BACK");
        lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblNewLabel_2.setForeground(new Color(255, 255, 255));
        lblNewLabel_2.setBounds(30, 703, 87, 24);
        mainPanel.add(lblNewLabel_2);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (textField_1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(container, "Please enter your mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!chckbxNewCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(container, "Please confirm your mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Get the subscription type
                	//JOHN DAVID ETO PROBLEMA NAMIN!!!!!!
                    String subscriptionType = comboBox.getSelectedItem().toString();
                    LocalDate startDate = LocalDate.now();
                    LocalDate endDate = startDate.plusDays(30);
                    
                    String message = "Payment Confirmed!\n\n" +
                            "Order: " + subscriptionType + "\nPayment Method: GCASH\n" +
                            "Subscription Start: " + startDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                            "Subscription End: " + endDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                    JOptionPane.showMessageDialog(container, message);
                }
            }
        });




    }
}
