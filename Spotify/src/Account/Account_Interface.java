package Account;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Account_Interface extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account_Interface frame = new Account_Interface();
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
	public Account_Interface() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1034, 625);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(35, 26, 66));
		contentPane.setForeground(new Color(35, 26, 66));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(186, 130, 660, 364);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton changePass = new JButton("Change Password");
		changePass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		changePass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccPass chPass = new AccPass();
				chPass.setVisible(true);
				
			}
		});
		changePass.setBounds(44, 81, 576, 67);
		panel.add(changePass);
		
		JButton transacHis = new JButton("Transaction History");
		transacHis.setFont(new Font("Tahoma", Font.PLAIN, 16));
		transacHis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		transacHis.setBounds(44, 223, 576, 67);
		panel.add(transacHis);
		
		JLabel lblNewLabel = new JLabel("Account Settings");
		lblNewLabel.setBounds(312, 32, 420, 69);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 54));
		lblNewLabel.setForeground(new Color(255, 255, 255));
	}
}
