package CustomerService;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import ContentManagement.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CS_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	ContentManagement_Interface cmInt = new ContentManagement_Interface();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CS_Interface frame = new CS_Interface();
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
	public CS_Interface() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		Toolkit toolkit = getToolkit();
		Dimension size = toolkit.getScreenSize();
		setLocation(size.width/2 - getWidth() / 2, size.height / 2 - getHeight() / 2 );
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel navbar = new JPanel();
		navbar.setBounds(0, 0, 800, 68);
		navbar.setBackground(new Color(35, 25, 66));
		contentPane.add(navbar);
		navbar.setLayout(null);
		
		JLabel logo = new JLabel("");
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cmInt.setVisible(true);
			}
		});
		ImageIcon img = new ImageIcon(this.getClass().getResource("/Logo.png"));
		Image modifiedLogo = img.getImage().getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH);
		logo.setBounds(20, 11, 121, 46);
		logo.setIcon(new ImageIcon(modifiedLogo));
		navbar.add(logo);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 24));
		panel.setBounds(49, 101, 700, 580);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea("Report your problem here ");
		textArea.setRows(5);
		textArea.setColumns(9);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setFont(new Font("Calibri", Font.PLAIN, 16));
		textArea.setBounds(85, 271, 531, 213);
		textArea.setMargin(new Insets(15, 15, 15, 15));

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(85, 271, 531, 213);
		
	
		panel.add(scroll);

		
		
		
		JLabel lblNewLabel_2 = new JLabel("Report a Problem: ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_2.setBounds(85, 205, 259, 55);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Support");
		lblNewLabel_1.setBounds(130, 35, 447, 105);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		submitBtn.setBounds(290, 505, 117, 43);
		panel.add(submitBtn);
		
		JLabel backBtn = new JLabel("");
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cmInt.setVisible(true);
			}
		});
		ImageIcon backImg = new ImageIcon(this.getClass().getResource("/backImg.png"));
		Image modifiedBackBtn = backImg.getImage().getScaledInstance(40, 50, java.awt.Image.SCALE_SMOOTH);
		backBtn.setBounds(10, 11, 39, 36);
		backBtn.setIcon(new ImageIcon(modifiedBackBtn));
		panel.add(backBtn);
		
		
	}
}
