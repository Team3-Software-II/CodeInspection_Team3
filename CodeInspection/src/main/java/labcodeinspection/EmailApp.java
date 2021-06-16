package labcodeinspection;

import java.util.Scanner;

public class EmailApp {
	
	private EmailApp() {}
	
	/**
	 * Main for EmailApp
	 * @param args
	 */
	public static void main(final String[] args) {
		final Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		final String firstName = scanner.nextLine();

		System.out.print("Enter your last name: ");
		final String lastName = scanner.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		final int depChoice = scanner.nextInt();
		scanner.close();

		final Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
