package Login;

import ContentManagement.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginAction {
	
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
