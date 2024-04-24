package ContentManagement;

import Subscription.*;
import Account.*;
import CustomerService.*;

public class cmAction {
	
	private String options[] = {"Home", "Subscription", "Contact Us", "Account", "Logout"};

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
	public void selectedAcc() {
		Account_Interface accInt = new Account_Interface();
		accInt.setVisible(true);
	}
	public void selectedCS() {
		CS_Interface csInt = new CS_Interface();
		csInt.setVisible(true);
	}
}
