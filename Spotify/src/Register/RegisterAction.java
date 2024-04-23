package Register;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class RegisterAction {
	
	private String email;
	private String username;
	private String password;

	
	public String getEmail() {
		return email;
	}
	public String setEmail(String email) {
		return this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public String setUsername(String username) {
		return this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public String setPassword(String password) {
		return this.password = password;
	}
	
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/spotify";
	static final String USER = "root";
	static final String PASS = "AandromedaNnebula11";
	

	
	public void register() {
		Connection conn = null;
		PreparedStatement prepStmt = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
			String sql = "INSERT INTO user (email, username, password) values(?, ?, ?)";		
			
			prepStmt = conn.prepareStatement(sql);
			prepStmt.setString(1, email);
			prepStmt.setString(2, username);
			prepStmt.setString(3, password);
			
			prepStmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();

		}finally {
			try {
				if(prepStmt != null) {
					prepStmt.close();
				} else if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
	}
	
	public void textPlaceholder(final JTextField tField, String placeholder, boolean clickFocus) {
		tField.setText(placeholder);
		
		final String finalPlaceholder = placeholder;
		
		tField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if(tField.getText().equals(finalPlaceholder)) {
					tField.setText("");
					
				}
			}
			
			public void focusLost(FocusEvent e) {
				if(tField.getText().isEmpty()) {
					tField.setText(finalPlaceholder);
				}
			}
			
		});
		
		if (clickFocus) {
			tField.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					tField.setFocusable(true);
					tField.requestFocusInWindow();
				}
			});
		}
	}
	
	
	public void passPlaceholder(final JPasswordField pField, final String placeholder, boolean clickFocus) {
		pField.setText(placeholder);
		pField.setEchoChar((char) 0);
		
		pField.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if(String.valueOf(pField.getPassword()).equals(placeholder)) {
					pField.setText("");
					pField.setEchoChar('*');
				}
			}
			public void focusLost(FocusEvent e) {
				if (pField.getPassword().length == 0) {
					pField.setEchoChar((char) 0);
					pField.setText(placeholder);
				}
			}
			
			
		});
		if(clickFocus) {
			pField.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					pField.setFocusable(true);
					pField.requestFocusInWindow();
				}
			});
		}
	}
	
}