package ContentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JFormattedTextField;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class ContentManagement_Interface {

	private JFrame frame;
	private JTextField search;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContentManagement_Interface window = new ContentManagement_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ContentManagement_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (!search.contains(e.getPoint())) {
					search.setFocusable(false);
				}
			}
		});
		frame.setBackground(new Color(35, 25, 66));
		frame.getContentPane().setBackground(new Color(18, 18, 18));
		
		JPanel navbar = new JPanel();
		navbar.setBounds(0, 0, 1266, 68);
		navbar.setBorder(new EmptyBorder(0, 0, 0, 0));
		navbar.setBackground(new Color(35, 25, 66));
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBounds(10, 79, 245, 627);
		sidePanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		sidePanel.setBackground(new Color(25, 24, 24));
		
		JPanel mainContent = new JPanel();
		mainContent.setBounds(273, 79, 983, 627);
		mainContent.setForeground(new Color(255, 255, 255));
		mainContent.setBorder(new EmptyBorder(0, 0, 0, 0));
		mainContent.setBackground(new Color(25, 24, 24));
		sidePanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(18, 18, 18));
		panel.setBounds(0, 303, 250, 10);
		sidePanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Playlists");
		lblNewLabel_1.setBounds(20, 11, 80, 30);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		sidePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_9 = new JLabel("Random song ");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBackground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(10, 330, 180, 20);
		sidePanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Memories");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_10.setBounds(45, 515, 70, 14);
		sidePanel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Jayce");
		lblNewLabel_11.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_11.setForeground(new Color(192, 192, 192));
		lblNewLabel_11.setBounds(150, 515, 46, 14);
		sidePanel.add(lblNewLabel_11);
		
		JButton randomsongbtn = new JButton("");
		randomsongbtn.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\Untitled design (2).png"));
		randomsongbtn.setBorderPainted(false);
		randomsongbtn.setBounds(45, 360, 150, 150);
		sidePanel.add(randomsongbtn);
		
		JLabel lblNewLabel_12 = new JLabel("No playlists made.");
		lblNewLabel_12.setForeground(new Color(128, 128, 128));
		lblNewLabel_12.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_12.setBounds(45, 145, 140, 20);
		sidePanel.add(lblNewLabel_12);
		
		JButton addplistbtn = new JButton("");
		addplistbtn.setBorderPainted(false);
		addplistbtn.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\addplist.png"));
		addplistbtn.setBounds(195, 11, 40, 40);
		sidePanel.add(addplistbtn);
		mainContent.setLayout(null);
		
		JButton pandorabtn = new JButton("");
	    pandorabtn.setBorderPainted(false);
		pandorabtn.setForeground(new Color(18, 18, 18));
		pandorabtn.setBackground(new Color(18, 18, 18));
		pandorabtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pandorabtn.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Desktop\\pandora3.png"));
		pandorabtn.setBounds(25, 77, 900, 250);
		mainContent.add(pandorabtn);
		
		JButton artistbtn = new JButton("");
		 artistbtn.setBorderPainted(false);
		artistbtn.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Desktop\\artist1.png"));
		
		artistbtn.setBounds(80, 400, 100, 100);
		mainContent.add(artistbtn);
		
		JButton artistbtn2 = new JButton("");
		artistbtn2.setBorderPainted(false);
		artistbtn2.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Desktop\\artist2.png"));
		artistbtn2.setBounds(250, 400, 100, 100);
		mainContent.add(artistbtn2);
		
		JButton artistbtn3 = new JButton("");
		artistbtn3.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\artist3.png"));
		artistbtn3.setBorderPainted(false);
		artistbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		artistbtn3.setBounds(420, 400, 100, 100);
		mainContent.add(artistbtn3);
		
		JLabel lblNewLabel_2 = new JLabel("Artists");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(20, 340, 75, 30);
		mainContent.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Featured\r\n");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_3.setBounds(20, 41, 100, 25);
		mainContent.add(lblNewLabel_3);
		
		JButton artistbtn4 = new JButton("");
		artistbtn4.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\artist4.png"));
		artistbtn4.setBorderPainted(false);
		artistbtn4.setBounds(590, 400, 100, 100);
		mainContent.add(artistbtn4);
		
		JButton artistbtn5 = new JButton("");
		artistbtn5.setIcon(new ImageIcon("C:\\Users\\WinDows10\\Downloads\\artist4 (1).png"));
		artistbtn5.setBorderPainted(false);
		artistbtn5.setBounds(760, 400, 100, 100);
		mainContent.add(artistbtn5);
		
		JLabel lblNewLabel_4 = new JLabel("David");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(110, 511, 46, 14);
		mainContent.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Charlotte\r\n");
		lblNewLabel_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(270, 514, 70, 14);
		mainContent.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Jayce");
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(450, 510, 46, 20);
		mainContent.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Bone\r\n");
		lblNewLabel_7.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setBounds(620, 514, 46, 14);
		mainContent.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Lows");
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setBounds(795, 514, 46, 14);
		mainContent.add(lblNewLabel_8);
		
		search = new JTextField("Search");
		search.setForeground(new Color(68, 68, 68));
		search.setBackground(new Color(217, 217, 217));
		search.setMargin(new Insets(0, 10, 0, 0));
		search.setFont(new Font("Tahoma", Font.PLAIN, 18));
		search.setFocusable(false);
		search.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				search.setFocusable(true);
				search.requestFocusInWindow();
			}
		});
		
		search.addFocusListener(new FocusAdapter() {
			
			public void focusGained(FocusEvent e) {
				if(search.getText().equals("Search")) {
					search.setFocusable(true);
					search.setText("");
				}
				
			}
			
			public void focusLost(FocusEvent e) {
				if(search.getText().equals("")) {
					search.setText("Search");
				}
			}
		});
		frame.getContentPane().setLayout(null);
		search.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Hello Username!!");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_navbar = new GroupLayout(navbar);
		gl_navbar.setHorizontalGroup(
			gl_navbar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navbar.createSequentialGroup()
					.addGap(56)
					.addComponent(search, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 772, Short.MAX_VALUE)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_navbar.setVerticalGroup(
			gl_navbar.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_navbar.createSequentialGroup()
					.addGap(11)
					.addGroup(gl_navbar.createParallelGroup(Alignment.BASELINE)
						.addComponent(search, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(11))
		);
		navbar.setLayout(gl_navbar);
		frame.getContentPane().add(navbar);
		frame.getContentPane().add(sidePanel);
		frame.getContentPane().add(mainContent);
		frame.setBounds(100, 100, 1244, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
