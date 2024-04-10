package Main;

import java.awt.EventQueue;

import Login.*;

public class main {
	
	static Login_Interface logInt = new Login_Interface();

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logInt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

}
