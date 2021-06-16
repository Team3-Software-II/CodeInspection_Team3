package labcodeinspection;

import java.util.Locale;

public class Email {

	private final transient String firstName;
	private final transient String lastName;
	private transient String password;
	private transient String department;
	private final transient int passwordLen = 8;
	private transient String email;
	
	/**
	 * Email constructor
	 * @param firstName
	 * @param lastName
	 */
	public Email(final String firstName, final String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * showInfo shows the different parameters
	 */
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + firstName + "\nLAST NAME= " + lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}
	
	/**
	 * setDepartment sets the Email department depending from the depChoice parameter.
	 * @param depChoice
	 */
	public void setDeparment(final int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			this.department = "none";
		}
	}

	private String randomPassword(final int length) {
		final String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			final int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	 * generateEmail generates the password and uses the first and last name to create a new email.
	 */
	public void generateEmail() {
		this.password = this.randomPassword(this.passwordLen);
		this.email = this.firstName.toLowerCase(Locale.getDefault()) + this.lastName.toLowerCase(Locale.getDefault()) + "@" + this.department
				+ ".espol.edu.ec";
	}
}
