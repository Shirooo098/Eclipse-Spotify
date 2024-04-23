package ContentManagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

import Payment.Payment_Interface;

public class contentAcquisition extends JFrame {

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
					contentAcquisition frame = new contentAcquisition();
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
	public contentAcquisition() {
		
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 801);
		container = new JPanel();
		container.setBackground(new Color(35, 26, 66));
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
