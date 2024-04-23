package Payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Payment_E_Wallet extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;
    private JTextField textField_1;
    private JTextField textField_2;

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
        panel.setBounds(242, 334, 600, 320);
        mainPanel.add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton = new JButton("SEND OTP");
        btnNewButton.setBounds(249, 115, 104, 35);
        panel.add(btnNewButton);
        btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        textField_1.setBounds(35, 60, 536, 45);
        panel.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Enter your Mobile Number");
        lblNewLabel.setBounds(25, 24, 207, 26);
        panel.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        
        JButton btnSubmit = new JButton("SUBMIT");
        btnSubmit.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        btnSubmit.setBounds(249, 251, 104, 35);
        panel.add(btnSubmit);
        
        
        textField_2 = new JTextField();
        textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 10));
        textField_2.setColumns(10);
        textField_2.setBounds(35, 196, 536, 45);
        panel.add(textField_2);
        
        JLabel lblEnterOtp = new JLabel("Enter OTP:");
        lblEnterOtp.setForeground(Color.BLACK);
        lblEnterOtp.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblEnterOtp.setBounds(25, 160, 207, 26);
        panel.add(lblEnterOtp);
        
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
        
        JLabel lblNewLabel_1_1 = new JLabel("P149/monthly");
        lblNewLabel_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1.setFont(new Font("Segoe UI", Font.BOLD, 19));
        lblNewLabel_1_1.setBounds(59, 73, 207, 26);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("Standard");
        lblNewLabel_1_1_1.setForeground(Color.BLACK);
        lblNewLabel_1_1_1.setFont(new Font("Segoe UI", Font.PLAIN, 19));
        lblNewLabel_1_1_1.setBounds(59, 98, 207, 26);
        panel_1.add(lblNewLabel_1_1_1);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBounds(25, 60, 547, 79);
        panel_1.add(panel_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("CHANGE");
        lblNewLabel_1_1_1_1.setForeground(new Color(0, 64, 128));
        lblNewLabel_1_1_1_1.setFont(new Font("Segoe UI", Font.BOLD, 17));
        lblNewLabel_1_1_1_1.setBounds(449, 20, 70, 32);
        panel_1_1.add(lblNewLabel_1_1_1_1);
        
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
		

    }
}
