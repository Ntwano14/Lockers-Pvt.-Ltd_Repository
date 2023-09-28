package com.lockedme.developer;

import java.util.Scanner;

public class LockedMePrototypeMain{

	public static void main(String[] args) throws Exception {

		// Declarations
		Scanner scanner = new Scanner(System.in);
		int option;

		WelcomeScreen ws = new WelcomeScreen();
		ws.displayWelcomeScreen();
		try {

			while(true)
			{
				WelcomeScreen.displayMainOptions();
				// Features to accept the user input to select one of the options listed 
				option = scanner.nextInt();
				System.out.println();

				switch (option) 

				{
				case 1:
					DisplayFileNames.displayFileNamesInAscendingOrder();
					break;
				case 2:
					Option2subOptions.subOptions();
					break;
				case 3:
					System.out.println("Exiting the Application. Goodbye!");
					scanner.close();
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Option. Please choose valid option\n");
					break;
				}

			}
		} 
		catch (Exception e) {

			System.out.println("\n"+e);
			System.out.println("Characters are not allowed, Please enter only valid Integers....");
		}
	}
}
