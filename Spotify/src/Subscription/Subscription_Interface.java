package Subscription;

import Payment.*;
import java.awt.EventQueue;

import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import ContentManagement.ContentManagement_Interface;

import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Subscription_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;

	ContentManagement_Interface cmInt = new ContentManagement_Interface();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Subscription_Interface frame = new Subscription_Interface();
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
	public Subscription_Interface() {
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1128, 820);
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
		logo.setBounds(290, 41, 522, 140);
		container.add(logo);
		logo.setIcon(img);
		
		// FORM FORM FORM
		// FORM FORM FORM
		// FORM FORM FORM
		
		JPanel formBox = new JPanel();
		formBox.setBounds(100, 273, 916, 388);
		container.add(formBox);
		formBox.setBackground(new Color(217, 217, 217));
		
		JLabel lblNewLabel = new JLabel("STANDARD");
		lblNewLabel.setBounds(10, 27, 409, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JButton subscribeBtn = new JButton("SUBSCRIBE");
		subscribeBtn.setBounds(370, 328, 162, 36);
		subscribeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Payment_Interface payInt = new Payment_Interface();
				payInt.setVisible(true);
				dispose();
			}
		});
		subscribeBtn.setBackground(new Color(211, 204, 227));
		subscribeBtn.setForeground(new Color(0, 0, 0));
		subscribeBtn.setFont(new Font("Arial", Font.BOLD, 20));
		
		JTextArea txtrEnjoyUnlimitedAdfree = new JTextArea();
		txtrEnjoyUnlimitedAdfree.setBounds(33, 72, 386, 205);
		txtrEnjoyUnlimitedAdfree.setEditable(false);
		txtrEnjoyUnlimitedAdfree.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrEnjoyUnlimitedAdfree.setBackground(new Color(217, 217, 217));
		txtrEnjoyUnlimitedAdfree.setRows(2);
		txtrEnjoyUnlimitedAdfree.setText("• Enjoy 1-month  of Unlimited Ad-Free Music with \r\n   No Interruptions\r\n\r\r\n• Listen on 2 supported devices at a time\r\n\r\n• Listen to all musics available on TuneWave\r\n\r\n• Option to add 2 unsupported device\r\n   live with you.");
		
		JTextArea txtrmonthly = new JTextArea();
		txtrmonthly.setBounds(140, 283, 144, 27);
		txtrmonthly.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrmonthly.setBackground(new Color(217, 217, 217));
		txtrmonthly.setText("₱149/monthly");
		
		JLabel lblNewLabel_1 = new JLabel("PREMIUM");
		lblNewLabel_1.setBounds(479, 27, 427, 35);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		JTextArea txtrEnjoyUnlimitedAdfree_1 = new JTextArea();
		txtrEnjoyUnlimitedAdfree_1.setBounds(519, 72, 358, 205);
		txtrEnjoyUnlimitedAdfree_1.setEditable(false);
		txtrEnjoyUnlimitedAdfree_1.setText("• Enjoy 1-year of Unlimited Ad-Free Music with \r\n   No Interruptions\r\n\r\r\n• Listen on 4 supported devices at a time\r\n\r\n• Listen to all musics available on TuneWave\r\n\r\n• Option to add 2 unsupported device");
		txtrEnjoyUnlimitedAdfree_1.setRows(2);
		txtrEnjoyUnlimitedAdfree_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrEnjoyUnlimitedAdfree_1.setBackground(new Color(217, 217, 217));
		
		JTextArea txtrmonthly_1 = new JTextArea();
		txtrmonthly_1.setBounds(619, 283, 146, 27);
		txtrmonthly_1.setText("₱499/annually");
		txtrmonthly_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrmonthly_1.setBackground(new Color(217, 217, 217));
		formBox.setLayout(null);
		formBox.add(lblNewLabel);
		formBox.add(txtrEnjoyUnlimitedAdfree);
		formBox.add(lblNewLabel_1);
		formBox.add(txtrEnjoyUnlimitedAdfree_1);
		formBox.add(txtrmonthly);
		formBox.add(txtrmonthly_1);
		formBox.add(subscribeBtn);
		
		JLabel lblChooseYourPlan = new JLabel("CHOOSE YOUR PLAN");
		lblChooseYourPlan.setForeground(new Color(255, 255, 255));
		lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
		lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblChooseYourPlan.setBounds(321, 189, 425, 35);
		container.add(lblChooseYourPlan);
		
		ImageIcon returnImg = new ImageIcon(getClass().getResource("/backImg.png"));
		Image scaledImage = returnImg.getImage().getScaledInstance(50, 70, Image.SCALE_DEFAULT);
		ImageIcon returnIcon = new ImageIcon(scaledImage);
		JLabel returnBtn = new JLabel(returnIcon);
		returnBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cmInt.setVisible(true);
				dispose();
			}
		});
		returnBtn.setBounds(10, 41, 84, 52);
		returnBtn.setHorizontalAlignment(SwingConstants.CENTER);
		returnBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		returnBtn.setVerticalAlignment(SwingConstants.CENTER);
		returnBtn.setVerticalTextPosition(SwingConstants.CENTER);
		container.add(returnBtn);
	}
}
