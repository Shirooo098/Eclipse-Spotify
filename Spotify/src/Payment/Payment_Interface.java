package Payment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
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
		setLocation(size.width/2 - getWidth() / 2, size.height / 2 - getHeight() / 2 );

		setContentPane(container);
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		container.setLayout(null);
		
		// LOGO LOGO LOGO
		// LOGO LOGO LOGO
		// LOGO LOGO LOGO
		
		JLabel logo = new JLabel("");
		logo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		logo.setBounds(290, 41, 522, 140);
		container.add(logo);
		logo.setIcon(img);
		
		JLabel lblChooseYourPlan = new JLabel("CHOOSE PAYMENT METHOD");
		lblChooseYourPlan.setForeground(new Color(255, 255, 255));
		lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
		lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblChooseYourPlan.setBounds(321, 189, 425, 35);
		container.add(lblChooseYourPlan);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(217, 255, 631, 93);
		container.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(217, 395, 631, 93);
		container.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(217, 533, 631, 93);
		container.add(btnNewButton_1_1);
		
		ImageIcon returnImg = new ImageIcon(getClass().getResource("/backImg.png"));
		Image scaledImage = returnImg.getImage().getScaledInstance(50, 70, Image.SCALE_DEFAULT);
		ImageIcon returnIcon = new ImageIcon(scaledImage);
		JLabel returnBtn = new JLabel(returnIcon);
		returnBtn.setBounds(10, 41, 84, 52);
		returnBtn.setHorizontalAlignment(SwingConstants.CENTER);
		returnBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		returnBtn.setVerticalAlignment(SwingConstants.CENTER);
		returnBtn.setVerticalTextPosition(SwingConstants.CENTER);
		container.add(returnBtn);
	}
}
