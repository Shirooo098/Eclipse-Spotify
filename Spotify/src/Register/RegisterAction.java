package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class RegisterAction {
	
	static final String DB_URL = "jdbc:mysql://localhost:3306/spotify";
	static final String USER = "root";
	static final String PASS = "Arslansenki00";
	

	
	public boolean register(String email, String username,
			String password) {
		

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
			
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
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
}
