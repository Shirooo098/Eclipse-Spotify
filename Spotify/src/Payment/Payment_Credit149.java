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
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Payment_Credit149 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel container;
    private JTextField txtS;
    private JTextField txtExpirationDate;
    private JTextField txtCvv;
    private JTextField textField_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Payment_Credit149 frame = new Payment_Credit149();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Payment_Credit149() {
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
        
        JLabel lblNewLabel_2_1 = new JLabel("Standard Plan");
        lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        lblNewLabel_2_1.setBounds(210, 410, 230, 26);
        mainPanel.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_3 = new JLabel("CHANGE");
        lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
        lblNewLabel_3.setForeground(new Color(0, 0, 128));
        lblNewLabel_3.setBounds(817, 399, 82, 30);
        mainPanel.add(lblNewLabel_3);

        JLabel lblChooseYourPlan = new JLabel("SET UP YOUR CREDIT OR DEBIT CARD");
        lblChooseYourPlan.setBounds(177, 115, 743, 35);
        lblChooseYourPlan.setForeground(new Color(255, 255, 255));
        lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
        lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
        lblChooseYourPlan.setFont(new Font("Segoe UI", Font.BOLD, 29));
        mainPanel.add(lblChooseYourPlan);
        
     JButton btnNewButton = new JButton("START MEMBERSHIP");

  btnNewButton.setBackground(new Color(253, 210, 48)); 

  btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 18));
  btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          
      }
  });
  btnNewButton.setBounds(177, 467, 743, 61);
  mainPanel.add(btnNewButton);
                 
                 JLabel lblNewLabel_2 = new JLabel("P149/month");
                 lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 19));
                 lblNewLabel_2.setBounds(210, 387, 230, 30);
                 mainPanel.add(lblNewLabel_2);
                 
                 txtExpirationDate = new JTextField();
                 txtExpirationDate.setBackground(new Color(217, 217, 217));
                 txtExpirationDate.setForeground(new Color(0, 0, 0));
                 txtExpirationDate.setFont(new Font("Segoe UI", Font.PLAIN, 19));
                 txtExpirationDate.setColumns(10);
                 txtExpirationDate.setBounds(177, 237, 373, 55);
                 mainPanel.add(txtExpirationDate);
                 
                 txtCvv = new JTextField();
                 txtCvv.setBackground(new Color(217, 217, 217));
                 txtCvv.setForeground(Color.LIGHT_GRAY);
                 txtCvv.setFont(new Font("Segoe UI", Font.PLAIN, 19));
                 txtCvv.setColumns(10);
                 txtCvv.setBounds(560, 237, 360, 55);
                 mainPanel.add(txtCvv);
                 
                 textField_2 = new JTextField();
                 textField_2.setBackground(new Color(217, 217, 217));
                 textField_2.setForeground(new Color(0, 0, 0));
                 textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 19));
                 textField_2.setColumns(10);
                 textField_2.setBounds(177, 302, 743, 55);
                 mainPanel.add(textField_2);
                 
                 JLabel lblNewLabel_1_1_1_3 = new JLabel("cards");
                 lblNewLabel_1_1_1_3.setBounds(177, 548, 743, 55);
                 mainPanel.add(lblNewLabel_1_1_1_3);
                 ImageIcon cards = new ImageIcon(this.getClass().getResource("/Cards.png"));
                 lblNewLabel_1_1_1_3.setIcon(cards);
                 
                 
                 
                 JLabel lblNewLabel = new JLabel("");
                 lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
                 
                      // Set background color
                      lblNewLabel.setBackground(new Color(217, 217, 217));
                      
                           // Ensure that the background color is visible
                           lblNewLabel.setOpaque(true);
                           
                                lblNewLabel.setBounds(177, 367, 743, 90);
                                mainPanel.add(lblNewLabel);
                                
                                JLabel lblNewLabel_4 = new JLabel("TUNEWAVELOGO");
                                lblNewLabel_4.setBounds(30, 20, 162, 38);
                                mainPanel.add(lblNewLabel_4);
                        		ImageIcon smologo = new ImageIcon(this.getClass().getResource("/small logo.png"));
                        		lblNewLabel_4.setIcon(smologo);
                        		
                        		        
                        		
                        		        // Other components
                        		        txtS = new JTextField();
                        		        txtS.setToolTipText("");
                        		        txtS.setBackground(new Color(217, 217, 217));
                        		        txtS.setForeground(new Color(0, 0, 0));
                        		        txtS.setFont(new Font("Segoe UI", Font.PLAIN, 18));
                        		        txtS.setBounds(177, 172, 743, 55);
                        		        mainPanel.add(txtS);
                        		        txtS.setColumns(10);

    }
}
