package Account;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class AccPass extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static final String DB_URL = "jdbc:mysql://localhost:3306/spotify";
	static final String USER = "root";
	static final String PASS = "Arslansenki00";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccPass frame = new AccPass();
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
	public AccPass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(35, 26, 66));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		setBackground(new Color(35, 26, 66));
		setForeground(new Color(0, 0, 0));
		getContentPane().setLayout(null);
		
		JLabel usernameLbl = new JLabel("Username");
		usernameLbl.setForeground(new Color(255, 255, 255));
		usernameLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		usernameLbl.setBounds(45, 134, 94, 40);
		getContentPane().add(usernameLbl);
		
		JLabel oldPassLbl = new JLabel("Old Password");
		oldPassLbl.setForeground(new Color(255, 255, 255));
		oldPassLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		oldPassLbl.setBounds(45, 185, 115, 40);
		getContentPane().add(oldPassLbl);
		
		JLabel newPassLbl = new JLabel("New Password");
		newPassLbl.setForeground(new Color(255, 255, 255));
		newPassLbl.setBackground(new Color(255, 255, 255));
		newPassLbl.setFont(new Font("Tahoma", Font.BOLD, 16));
		newPassLbl.setBounds(45, 236, 127, 40);
		getContentPane().add(newPassLbl);

		ImageIcon logoImg = new ImageIcon(this.getClass().getResource("/Logo.png"));
		Image scaledImage = logoImg.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new ImageIcon(scaledImage);
		JLabel logo = new JLabel(logoIcon);
		logo.setBounds(135, 23, 237, 100);
		getContentPane().add(logo);
		
		final JTextField uNameField = new JTextField();
		uNameField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		uNameField.setBounds(223, 136, 237, 40);
		getContentPane().add(uNameField);
		uNameField.setColumns(10);
		
		final JPasswordField oldPassField = new JPasswordField();
		oldPassField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		oldPassField.setColumns(10);
		oldPassField.setBounds(223, 185, 237, 40);
		getContentPane().add(oldPassField);
		
		final JPasswordField newPassField = new JPasswordField();
		newPassField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		newPassField.setColumns(10);
		newPassField.setBounds(223, 236, 237, 40);
		getContentPane().add(newPassField);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(356, 308, 104, 40);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = uNameField.getText();
				String oldPass = String.valueOf(oldPassField.getPassword());
				String newPass = String.valueOf(newPassField.getPassword());
				
                Connection conn = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
				
				try {
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);

                    String sql = "UPDATE user SET password = ? WHERE username = ?";
                    
                    pst = conn.prepareStatement(sql);
                    
                    if(username.isEmpty() || oldPass.isEmpty() || newPass.isEmpty()) {
                    	JOptionPane.showMessageDialog(null, "Please fill up all fields");
                    }else if(oldPass.equals(newPass)) {
                    	JOptionPane.showMessageDialog(null, "New password must not be the same as Old Password");
                    }else if(newPass.length() < 8) {
                    	JOptionPane.showMessageDialog(null, "Passowrd must have more than 8 characters");
                    }
                    
                    else {
                        int rowsUpdate = pst.executeUpdate();
                        
                        if(rowsUpdate > 0 ) {
                        	JOptionPane.showMessageDialog(null, "Password Changed Successfully");
                        } else {
                        	JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                        }
                    }
                    
				}catch (Exception exc) {
					exc.printStackTrace();
				}
			}
		});
		getContentPane().add(submitBtn);
		
		JButton cancelBtn = new JButton("Cancel");
		cancelBtn.setBounds(223, 308, 104, 40);
		getContentPane().add(cancelBtn);
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

}
