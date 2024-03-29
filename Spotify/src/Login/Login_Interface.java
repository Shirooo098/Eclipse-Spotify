package Login;

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
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel container;
	private JTextField uNameField;
	private JTextField pWordField;

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
	public Login_Interface() {
		
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
		uNameField.setText("Username");
		uNameField.setHorizontalAlignment(SwingConstants.LEFT);
		uNameField.setColumns(2);
		uNameField.setMargin(new Insets(0, 15, 0, 0));
		
		
		pWordField = new JTextField();
		pWordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pWordField.setText("Password");
		pWordField.setColumns(10);
		pWordField.setMargin(new Insets(0, 15, 0, 0));
		
		JButton loginBtn = new JButton("Login");
		loginBtn.setBackground(new Color(255, 255, 255));
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		GroupLayout gl_formBox = new GroupLayout(formBox);
		gl_formBox.setHorizontalGroup(
			gl_formBox.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(46)
					.addGroup(gl_formBox.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(pWordField, Alignment.LEADING)
						.addComponent(uNameField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
					.addContainerGap(45, Short.MAX_VALUE))
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap(176, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(165))
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap(163, Short.MAX_VALUE)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addGap(155))
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
					.addGap(46)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		formBox.setLayout(gl_formBox);
	}
}
