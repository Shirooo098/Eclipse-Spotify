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
    private JTextField mobileField;
    pmAction pmAct = new pmAction();
	static final String DB_URL = "jdbc:mysql://localhost:3306/spotify";
	static final String USER = "root";
	static final String PASS = "Arslansenki00";
	private JTextField uNameField;
	private JTextField amountField;
	String selectedSub = "";
    
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
        panel.setBounds(242, 334, 600, 337);
        mainPanel.add(panel);
        panel.setLayout(null);

        mobileField = new JTextField();
        mobileField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        mobileField.setBounds(35, 48, 536, 45);
        panel.add(mobileField);
        mobileField.setColumns(10);

        ((AbstractDocument) mobileField.getDocument()).setDocumentFilter(new DocumentFilter() {
     
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newStr.matches("\\d{0,11}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

        JLabel lblNewLabel = new JLabel("Enter your Mobile Number");
        lblNewLabel.setBounds(25, 11, 207, 26);
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(0, 0, 0));

        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnSubmit.setBounds(246, 291, 104, 35);
        panel.add(btnSubmit);

        final JCheckBox chckbxNewCheckBox = new JCheckBox("I agree that all my information is correct.");
        chckbxNewCheckBox.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        chckbxNewCheckBox.setBounds(35, 263, 305, 21);
        panel.add(chckbxNewCheckBox);
        
        uNameField = new JTextField();
        uNameField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        uNameField.setColumns(10);
        uNameField.setBounds(35, 129, 536, 45);
        panel.add(uNameField);
        
        JLabel lblEnterYourName = new JLabel("Enter your Name");
        lblEnterYourName.setForeground(Color.BLACK);
        lblEnterYourName.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblEnterYourName.setBounds(25, 99, 207, 26);
        panel.add(lblEnterYourName);
        
        JLabel lblEnterAmount = new JLabel("Enter Amount");
        lblEnterAmount.setForeground(Color.BLACK);
        lblEnterAmount.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblEnterAmount.setBounds(25, 174, 207, 26);
        panel.add(lblEnterAmount);
        
        amountField = new JTextField();
        amountField.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        amountField.setColumns(10);
        amountField.setBounds(35, 211, 536, 45);
        panel.add(amountField);
        
        ((AbstractDocument) amountField.getDocument()).setDocumentFilter(new DocumentFilter() {
            
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newStr = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newStr.matches("\\d{0,11}")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });

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
        
        final JComboBox<Double> comboBox = new JComboBox<Double>(pmAct.getSubscriptions());
        comboBox.setBounds(0, 0, 537, 79);
        panel_1_1.add(comboBox);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JComboBox<Double> combo = (JComboBox<Double>) e.getSource();
                double selectedSub =  (double) combo.getSelectedItem();
                System.out.println(selectedSub);
                
                String subsType = "";
                if (selectedSub == 199.00) {
                    subsType = "Standard";
                } else if (selectedSub == 699.00) {
                    subsType = "Premium";
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
                Connection conn = null;
                PreparedStatement pst = null;
                PreparedStatement pst2 = null;
                PreparedStatement pst3 = null;
                PreparedStatement pst4 = null;
                ResultSet rs = null;

                if (mobileField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(container, "Please enter your mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!chckbxNewCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(container, "Please confirm your mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Get the subscription type
                    String username = uNameField.getText();
                    String mobileNum = mobileField.getText();
                    double price = (double) comboBox.getSelectedItem();
                    double amount = Double.parseDouble(amountField.getText());
                    double change = amount - price;
                    String sql1 = "SELECT userId FROM user where username = ? ";
                    String sql2 = "INSERT INTO gcashTrans (amount, userId, userNum, `change`) VALUES (?, ?, ?, ?)";
                    String sql3 = "INSERT INTO `transaction` (userId) VALUES (?) ";
                    String sql4 = "INSERT INTO subscription (subscription, startDate, startEnd, userId) VALUES (?, ?, ?, ?)";
                    
                    if (amount < price) {
                        JOptionPane.showMessageDialog(null, "Please Enter the right amount");
                    } else {
                        try {
                            conn = DriverManager.getConnection(DB_URL, USER, PASS);
                            pst = conn.prepareStatement(sql1);
                            pst.setString(1, username);
                            rs = pst.executeQuery();

                            if (rs.next()) {
                                int userId = rs.getInt("userId");

                                pst2 = conn.prepareStatement(sql2);
                                pst2.setDouble(1, amount);
                                pst2.setInt(2, userId);
                                pst2.setString(3, mobileNum);
                                pst2.setDouble(4, change);

                                String subsType = comboBox.getSelectedItem().toString();
                                LocalDate startDate = LocalDate.now();
                                LocalDate endDate = startDate.plusDays(30);

                                int submitted = pst2.executeUpdate();

                                if (submitted > 0) {
                                    String message = "Payment Confirmed!\n\n" +
                                            "Order: " + subsType + "\nPayment Method: GCASH\n" +
                                            "Subscription Start: " + startDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                            "Subscription End: " + endDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "\n" +
                                            "Change: " + change;
                                    JOptionPane.showMessageDialog(container, message);

                                    pst3 = conn.prepareStatement(sql3);
                                    pst3.setInt(1, userId);
                                    pst3.executeUpdate();
                                    
                                    pst4 = conn.prepareStatement(sql4);
                                    pst4.setString(1, subsType);
                                    pst4.setDate(2, java.sql.Date.valueOf(startDate)); 
                                    pst4.setDate(3, java.sql.Date.valueOf(endDate));
                                    pst4.setInt(4, userId);
                                    pst4.executeUpdate();
                                }
                            } else {
                                System.out.println("Username does not exist for username: " + username);
                                JOptionPane.showMessageDialog(null, "Username does not exist");
                            }
                        } catch (SQLException exc) {
                            exc.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
