package CustomerService;

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

public class CS_Interface {

	private JFrame frame;
	private JTextField search;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CS_Interface window = new CS_Interface();
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
	public CS_Interface() {
		frame = new JFrame();
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
		navbar.setBackground(new Color(35, 25, 66));
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(25, 24, 24));
		
		JPanel musicPlaying = new JPanel();
		musicPlaying.setBackground(new Color(18, 18, 18));
		
		JPanel mainContent = new JPanel();
		mainContent.setBackground(new Color(25, 24, 24));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(navbar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(sidePanel, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(mainContent, GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(musicPlaying, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(navbar, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(sidePanel, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
						.addComponent(mainContent, GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(musicPlaying, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
		);
		
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
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 1244, 819);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	}

	/**
	 * Initialize the contents of the frame.
	 */

}
