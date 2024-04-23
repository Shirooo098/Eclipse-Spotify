package Payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JComboBox;

public class Payment_E_Wallet extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;
    private JTextField textField;
    private JTextField textField_1;

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
        mainPanel.setBackground(new Color(14, 10, 26));
        container.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(null);

        JLabel lblChooseYourPlan = new JLabel("SET UP YOUR E-WALLET");
        lblChooseYourPlan.setBounds(0, 0, 1089, 35);
        lblChooseYourPlan.setForeground(new Color(255, 255, 255));
        lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
        lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
        lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
        mainPanel.add(lblChooseYourPlan);
        
        JLabel lblNewLabel = new JLabel("Enter your mobile Number");
        lblNewLabel.setBounds(287, 84, 207, 13);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setForeground(new Color(0, 0, 0));
        mainPanel.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setBounds(248, 69, 608, 158);
        mainPanel.add(panel);
        panel.setLayout(null);
        
        JButton btnNewButton = new JButton("SEND OTP");
        btnNewButton.setBounds(239, 102, 104, 35);
        panel.add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        
        textField_1 = new JTextField();
        textField_1.setBounds(72, 46, 459, 35);
        panel.add(textField_1);
        textField_1.setColumns(10);

    }
}
