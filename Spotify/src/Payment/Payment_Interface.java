package Payment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Payment_Interface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Payment_Interface frame = new Payment_Interface();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Payment_Interface() {
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
        container.setLayout(new BorderLayout());

        // Main content
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(35, 26, 66));
        container.add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(null);

        JLabel lblNewLabel = new JLabel("Logo");
        lblNewLabel.setBounds(288, 92, 514, 103);
        mainPanel.add(lblNewLabel);
        ImageIcon logo = new ImageIcon(this.getClass().getResource("/Logo.png"));
        lblNewLabel.setIcon(logo);


        JButton btnGcash = new JButton("GCASH");
        btnGcash.setBackground(new Color(217, 217, 217));
        btnGcash.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnGcash.setBounds(214, 448, 663, 97);
        mainPanel.add(btnGcash);

        btnGcash.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Payment_E_Wallet eWallet = new Payment_E_Wallet();
                eWallet.setVisible(true);
                dispose();
            }
        });
        JButton btnCard = new JButton("CREDIT OR DEBIT CARD");
        btnCard.setBackground(new Color(217, 217, 217));
        btnCard.setFont(new Font("Segoe UI", Font.BOLD, 20));
        btnCard.setBounds(214, 312, 663, 97);
        mainPanel.add(btnCard);

        btnCard.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Payment_Credit cCard = new Payment_Credit();
        		cCard.setVisible(true);
        		dispose();
        	}
        });

        JLabel lblNewLabel_1 = new JLabel("CHOOSE YOUR MODE OF PAYMENT");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 24));
        lblNewLabel_1.setBounds(314, 245, 453, 26);
        mainPanel.add(lblNewLabel_1);



    }
}