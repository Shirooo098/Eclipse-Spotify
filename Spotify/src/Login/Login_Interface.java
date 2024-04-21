package Login;

import Register.*;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
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

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTextField uNameField;
	private JPasswordField pWordField;
	loginAction logAct = new loginAction();
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */


	
	public Login_Interface() {
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(!uNameField.contains(e.getPoint())) {
					uNameField.setFocusable(false);
				}
				if(!pWordField.contains(e.getPoint())) {
					pWordField.setFocusable(false);
				}
			}
			
		});	
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
		formBox.setBounds(334, 256, 427, 388);
		container.add(formBox);
		formBox.setBackground(new Color(217, 217, 217));
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		uNameField = new JTextField();
		uNameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		uNameField.setHorizontalAlignment(SwingConstants.LEFT);
		uNameField.setColumns(2);
		uNameField.setMargin(new Insets(0, 15, 0, 0));
		
		
		pWordField = new JPasswordField();
		pWordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pWordField.setColumns(10);
		pWordField.setMargin(new Insets(0, 15, 0, 0));
		
		logAct.textPlaceholder(uNameField, "Username", true);
		
		
		logAct.passPlaceholder((JPasswordField) pWordField, "Password" , true);
		
		JButton loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = uNameField.getText();
				String password = pWordField.getText();
				
				if(logAct.login(username, password)) {
					ContentManagement_Interface cmInt = new ContentManagement_Interface();
                    cmInt.setVisible(true);
                    dispose();
                    
				}
			}
		});
		
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		
		
		JLabel register = new JLabel("<HTML><U>Don't  Have an Account?</U></HTML>");
		register.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Register_Interface regInt = new Register_Interface();
				regInt.setVisible(true);
				dispose();
			}
		});
		register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register.setForeground(new Color(0, 102, 255));
		

		
		GroupLayout gl_formBox = new GroupLayout(formBox);
		gl_formBox.setHorizontalGroup(
			gl_formBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap(163, Short.MAX_VALUE)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_formBox.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(pWordField, Alignment.LEADING)
						.addComponent(uNameField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
						.addComponent(register, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(45, Short.MAX_VALUE))
		);
		gl_formBox.setVerticalGroup(
			gl_formBox.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(34)
					.addComponent(lblNewLabel)
					.addGap(28)
					.addComponent(uNameField, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(pWordField, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(register)
					.addGap(21)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		formBox.setLayout(gl_formBox);
	}
}
