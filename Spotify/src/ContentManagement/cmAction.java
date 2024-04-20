package ContentManagement;

import Subscription.*;
import CustomerService.*;

public class cmAction {
	
	private String options[] = {"Home", "Subscription", "Contact Us", "Logout"};

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}
	
	public void selectedHome() {
		ContentManagement_Interface cmInt = new ContentManagement_Interface();
		cmInt.setVisible(true);
	}
	public void selectedSub() {
		Subscription_Interface subInt = new Subscription_Interface();
		subInt.setVisible(true);
	}
	public void selectedCS() {
		CS_Interface csInt = new CS_Interface();
		csInt.setVisible(true);
	}
}
