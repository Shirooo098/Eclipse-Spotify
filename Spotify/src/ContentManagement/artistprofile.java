package ContentManagement;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;

public class artistprofile extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					artistprofile frame = new artistprofile();
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
	public artistprofile() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1113, 801);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(18, 18, 18));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(35, 26, 66));
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(0, 0, 1097, 91);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(new Color(25, 25, 24));
		panel_1.setForeground(new Color(25, 25, 24));
		panel_1.setBounds(10, 102, 700, 640);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/1.png"));
		lblNewLabel.setBounds(35, 32, 125, 125);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("RanzU");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 40));
		lblNewLabel_1.setBounds(180, 70, 125, 50);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1.");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_2.setForeground(new Color(192, 192, 192));
		lblNewLabel_2.setBounds(75, 210, 20, 30);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("2.\r\n");
		lblNewLabel_4.setForeground(new Color(192, 192, 192));
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_4.setBounds(75, 280, 20, 30);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("3.");
		lblNewLabel_6.setForeground(new Color(192, 192, 192));
		lblNewLabel_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel_6.setBounds(75, 350, 20, 30);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_8 = new JLabel("Memories\r\n");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_8.setBounds(180, 215, 60, 14);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("/song 1.png"));
		lblNewLabel_3.setBounds(105, 200, 400, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_9 = new JLabel("Falling");
		lblNewLabel_9.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(180, 285, 60, 14);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("/song 2.png"));
		lblNewLabel_5.setBounds(105, 270, 400, 50);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_10 = new JLabel("Artist");
		lblNewLabel_10.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(180, 355, 60, 14);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("/song 3.png"));
		lblNewLabel_7.setBounds(105, 340, 400, 50);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_11 = new JLabel("More Songs");
		lblNewLabel_11.setForeground(new Color(255, 255, 255));
		lblNewLabel_11.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_11.setBounds(35, 391, 120, 40);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("/moresong1.png"));
		lblNewLabel_12.setBounds(55, 450, 100, 100);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("/moresong2.png"));
		lblNewLabel_13.setBounds(214, 450, 100, 100);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setIcon(new ImageIcon("/moresong3.png"));
		lblNewLabel_14.setBounds(378, 450, 100, 100);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setIcon(new ImageIcon("/moresong4.png"));
		lblNewLabel_15.setBounds(542, 450, 100, 100);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Your Face\r\n");
		lblNewLabel_16.setForeground(new Color(255, 255, 255));
		lblNewLabel_16.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_16.setBounds(55, 559, 60, 14);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Entombed\r\n");
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_17.setBounds(214, 559, 60, 14);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("welcome and goodbye");
		lblNewLabel_18.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_18.setForeground(new Color(255, 255, 255));
		lblNewLabel_18.setBounds(378, 559, 120, 14);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Dance With My Father");
		lblNewLabel_19.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_19.setForeground(new Color(255, 255, 255));
		lblNewLabel_19.setBounds(542, 559, 120, 14);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("wisp");
		lblNewLabel_20.setForeground(new Color(128, 128, 128));
		lblNewLabel_20.setBounds(55, 583, 46, 14);
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("Deftones\r\n");
		lblNewLabel_21.setForeground(new Color(128, 128, 128));
		lblNewLabel_21.setBounds(214, 583, 46, 14);
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Dream, Ivory");
		lblNewLabel_22.setForeground(new Color(128, 128, 128));
		lblNewLabel_22.setBounds(378, 583, 70, 14);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Luther Vandross\r\n");
		lblNewLabel_23.setForeground(new Color(128, 128, 128));
		lblNewLabel_23.setBounds(542, 583, 80, 14);
		panel_1.add(lblNewLabel_23);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBackground(new Color(25, 25, 24));
		panel_2.setBounds(720, 102, 368, 640);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setIcon(new ImageIcon("/jcc.png"));
		lblNewLabel_24.setBounds(55, 80, 268, 300);
		panel_2.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("Liked Songs\r\n");
		lblNewLabel_25.setForeground(new Color(255, 255, 255));
		lblNewLabel_25.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_25.setBounds(55, 35, 120, 40);
		panel_2.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Burnt Out");
		lblNewLabel_26.setForeground(new Color(255, 255, 255));
		lblNewLabel_26.setFont(new Font("Segoe UI", Font.BOLD, 20));
		lblNewLabel_26.setBounds(55, 380, 100, 40);
		panel_2.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("Jayce");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_27.setForeground(new Color(128, 128, 128));
		lblNewLabel_27.setBounds(55, 425, 46, 20);
		panel_2.add(lblNewLabel_27);
	}
}
