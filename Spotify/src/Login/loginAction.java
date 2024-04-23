package Login;

import ContentManagement.*;
import Register.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginAction  {
	
	private String username;
	private String password;
	
	
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

	static final String DB_URL = "jdbc:mysql://localhost:3306/spotify";
	static final String USER = "root";
	static final String PASS = "AandromedaNnebula11";
	
	RegisterAction regAct = new RegisterAction();
	
	public boolean login() {
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		boolean loggedIn = false;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		
			String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
			
			
			pst = conn.prepareStatement(sql);
			pst.setString(1, username);
			pst.setString(2, password);
			
			rs = pst.executeQuery();
			
			loggedIn = rs.next();
			
;		}catch(SQLException exc) {
			exc.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(pst != null) pst.close();
				if(conn != null) conn.close();
			} catch(SQLException exc1) { 
				exc1.printStackTrace();
			}
		}
		
		return loggedIn;
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
	
	public void home(JButton btn) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContentManagement_Interface conInt = new ContentManagement_Interface();
				conInt.setVisible(true);
			}
		});
			
		
	}
	
	
}	
