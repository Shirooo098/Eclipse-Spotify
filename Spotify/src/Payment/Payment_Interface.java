package Payment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		logo.setBounds(290, 41, 522, 140);
		container.add(logo);
		logo.setIcon(img);
		
		// FORM FORM FORM
		// FORM FORM FORM
		// FORM FORM FORM
		
		JPanel formBox = new JPanel();
		formBox.setBounds(100, 273, 427, 388);
		container.add(formBox);
		formBox.setBackground(new Color(217, 217, 217));
		
		JLabel lblNewLabel = new JLabel("STANDARD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		JButton loginBtn = new JButton("SUBSCRIBE");
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginBtn.setBackground(new Color(211, 204, 227));
		loginBtn.setForeground(new Color(0, 0, 0));
		loginBtn.setFont(new Font("Arial", Font.BOLD, 20));
		
		JTextArea txtrEnjoyUnlimitedAdfree = new JTextArea();
		txtrEnjoyUnlimitedAdfree.setEditable(false);
		txtrEnjoyUnlimitedAdfree.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrEnjoyUnlimitedAdfree.setBackground(new Color(217, 217, 217));
		txtrEnjoyUnlimitedAdfree.setRows(2);
		txtrEnjoyUnlimitedAdfree.setText("• Enjoy Unlimited Ad-Free Music with \r\n   No Interruptions\r\n\r\r\n• Listen on 2 supported devices at a time\r\n\r\n• Listen to all musics available on TuneWave\r\n\r\n• Option to add 1 extra member who doesn't \r\n   live with you.");
		
		JTextArea txtrmonthly = new JTextArea();
		txtrmonthly.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrmonthly.setBackground(new Color(217, 217, 217));
		txtrmonthly.setText("₱149/monthly");
		
		GroupLayout gl_formBox = new GroupLayout(formBox);
		gl_formBox.setHorizontalGroup(
			gl_formBox.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(33)
					.addComponent(txtrEnjoyUnlimitedAdfree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(46, Short.MAX_VALUE))
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_formBox.createSequentialGroup()
					.addContainerGap(140, Short.MAX_VALUE)
					.addComponent(txtrmonthly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(143))
				.addGroup(Alignment.LEADING, gl_formBox.createSequentialGroup()
					.addGap(131)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_formBox.setVerticalGroup(
			gl_formBox.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_formBox.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtrEnjoyUnlimitedAdfree, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrmonthly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(loginBtn, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(42))
		);
		formBox.setLayout(gl_formBox);
		
		JPanel formBox_1 = new JPanel();
		formBox_1.setBackground(new Color(217, 217, 217));
		formBox_1.setBounds(573, 273, 427, 388);
		container.add(formBox_1);
		
		JTextArea txtrEnjoyUnlimitedAdfree_1 = new JTextArea();
		txtrEnjoyUnlimitedAdfree_1.setEditable(false);
		txtrEnjoyUnlimitedAdfree_1.setText("• Enjoy Unlimited Ad-Free Music with \r\n   No Interruptions\r\n\r\r\n• Listen on 4 supported devices at a time\r\n\r\n• Listen to all musics available on TuneWave\r\n\r\n• Option to add 2 extra member who doesn't \r\n   live with you.");
		txtrEnjoyUnlimitedAdfree_1.setRows(2);
		txtrEnjoyUnlimitedAdfree_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtrEnjoyUnlimitedAdfree_1.setBackground(new Color(217, 217, 217));
		
		JLabel lblNewLabel_1 = new JLabel("PREMIUM");
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 29));
		
		JTextArea txtrmonthly_1 = new JTextArea();
		txtrmonthly_1.setText("₱499/monthly");
		txtrmonthly_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		txtrmonthly_1.setBackground(new Color(217, 217, 217));
		
		JButton loginBtn_1 = new JButton("SUBSCRIBE");
		loginBtn_1.setForeground(Color.BLACK);
		loginBtn_1.setFont(new Font("Arial", Font.BOLD, 20));
		loginBtn_1.setBackground(new Color(211, 204, 227));
		GroupLayout gl_formBox_1 = new GroupLayout(formBox_1);
		gl_formBox_1.setHorizontalGroup(
			gl_formBox_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_formBox_1.createSequentialGroup()
					.addGap(33)
					.addComponent(txtrEnjoyUnlimitedAdfree_1, GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(36, Short.MAX_VALUE))
				.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
				.addGroup(Alignment.LEADING, gl_formBox_1.createSequentialGroup()
					.addGap(131)
					.addGroup(gl_formBox_1.createParallelGroup(Alignment.LEADING)
						.addComponent(loginBtn_1, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrmonthly_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(134, Short.MAX_VALUE))
		);
		gl_formBox_1.setVerticalGroup(
			gl_formBox_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_formBox_1.createSequentialGroup()
					.addGap(27)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtrEnjoyUnlimitedAdfree_1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtrmonthly_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(loginBtn_1, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		formBox_1.setLayout(gl_formBox_1);
		
		JLabel lblChooseYourPlan = new JLabel("CHOOSE YOUR PLAN");
		lblChooseYourPlan.setForeground(new Color(255, 255, 255));
		lblChooseYourPlan.setVerticalAlignment(SwingConstants.TOP);
		lblChooseYourPlan.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseYourPlan.setFont(new Font("Tahoma", Font.BOLD, 29));
		lblChooseYourPlan.setBounds(321, 189, 425, 35);
		container.add(lblChooseYourPlan);
	}
}
