package Register;

import Login.*;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import Login.Login_Interface;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register_Interface extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTextField emailField;
	private JTextField uNameField;
	private JTextField confirmPw;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Interface frame = new Login_Interface();
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
	public Register_Interface() {
		
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
		logo.setBounds(290, 60, 522, 140);
		container.add(logo);
		logo.setIcon(img);
		
		// FORM FORM FORM
		// FORM FORM FORM
		// FORM FORM FORM
		
		JPanel formBox = new JPanel();
		formBox.setBounds(334, 211, 427, 460);
		container.add(formBox);
		formBox.setBackground(new Color(217, 217, 217));
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		emailField = new JTextField();
		emailField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		emailField.setText("Enter Email");
		emailField.setHorizontalAlignment(SwingConstants.LEFT);
		emailField.setColumns(2);
		emailField.setMargin(new Insets(0, 15, 0, 0));
		
		
		uNameField = new JTextField();
		uNameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		uNameField.setText("Create Username");
		uNameField.setColumns(10);
		uNameField.setMargin(new Insets(0, 15, 0, 0));
		
		JButton loginBtn = new JButton("Register");
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		confirmPw = new JTextField();
		confirmPw.setText("Confirm Password");
		confirmPw.setMargin(new Insets(0, 15, 0, 0));
		confirmPw.setFont(new Font("Tahoma", Font.PLAIN, 18));
		confirmPw.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("Create Password");
		textField_1.setMargin(new Insets(0, 15, 0, 0));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		
		JLabel login = new JLabel("<HTML><U>Already Have an Account</U></HTML>");
		login.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Login_Interface logInt = new Login_Interface();
				logInt.setVisible(true);
			}
		});
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setForeground(new Color(0, 102, 255));
		
		GroupLayout gl_formBox = new GroupLayout(formBox);
		gl_formBox.setHorizontalGroup(
			gl_formBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap(166, Short.MAX_VALUE)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(152))
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_formBox.createParallelGroup(Alignment.LEADING)
						.addComponent(login)
						.addGroup(gl_formBox.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(confirmPw, Alignment.LEADING)
							.addComponent(textField_1)
							.addComponent(uNameField, Alignment.LEADING)
							.addComponent(emailField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_formBox.setVerticalGroup(
			gl_formBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(24)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(emailField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(uNameField, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(confirmPw, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(login, GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		formBox.setLayout(gl_formBox);
	}
}