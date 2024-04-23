package Payment;

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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Payment_Interface extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;

    /**
     * Launch the application.
     */
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

    /**
     * Create the frame.
     */
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
        ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
        container.setLayout(null);

        // LOGO LOGO LOGO
        // LOGO LOGO LOGO
        // LOGO LOGO LOGO

        JLabel logo = new JLabel("");
        logo.setFont(new Font("Tahoma", Font.PLAIN, 5));
        logo.setBounds(272, 38, 522, 140);
        container.add(logo);
        logo.setIcon(img);

        JLabel lblChooseYourPlan = new JLabel("CHOOSE PAYMENT METHOD");
        lblChooseYourPlan.setForeground(new Color(255, 255, 255));
        lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
        lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
        lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
        lblChooseYourPlan.setBounds(321, 189, 425, 35);
        container.add(lblChooseYourPlan);

        Font buttonFont = new Font("Tahoma", Font.BOLD, 29);

        ImageIcon image1 = new ImageIcon(new ImageIcon(this.getClass().getResource("/credit.png")).getImage().getScaledInstance(60, -1, Image.SCALE_DEFAULT));
        ImageIcon image2 = new ImageIcon(new ImageIcon(this.getClass().getResource("/digiwallet.png")).getImage().getScaledInstance(60, -1, Image.SCALE_DEFAULT));
        ImageIcon image3 = new ImageIcon(new ImageIcon(this.getClass().getResource("/voucher.png")).getImage().getScaledInstance(60, -1, Image.SCALE_DEFAULT));

        JButton btnNewButton = new JButton(image1);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        JButton btnNewButton_1 = new JButton(image2);
        JButton btnNewButton_1_1 = new JButton(image3);
        btnNewButton_1_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });

        // Set text for each button
        btnNewButton.setText("CREDIT OR DEBIT CARD");
        btnNewButton_1.setText("DIGITAL WALLET");

        // Set button bounds
        btnNewButton.setBounds(217, 255, 631, 93);
        btnNewButton_1.setBounds(217, 395, 631, 93);

        // Set font for buttons
        btnNewButton.setFont(buttonFont);
        btnNewButton_1.setFont(buttonFont);

        // Set horizontal alignment of text and image
        btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNewButton.setHorizontalAlignment(SwingConstants.CENTER);
        btnNewButton_1.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);
        //container
        container.add(btnNewButton);
        container.add(btnNewButton_1);
    }
}