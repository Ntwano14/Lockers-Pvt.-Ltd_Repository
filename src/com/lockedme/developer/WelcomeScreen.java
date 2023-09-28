package com.lockedme.developer;

public class WelcomeScreen {

	public void displayWelcomeScreen()
	{
		// Code to display the welcome screen.
		System.out.println("\n=========================================================================\n");
		System.out.println("Welcome to LockedMe.com Application prototype for Lockers Pvt. Ltd Company\n");
		System.out.println("Developer Details:");
		System.out.println("------------------");
		System.out.println("Full Names: Ntwanano Mathebula");	
		System.out.println("Position: Full Stack Java Developer\n");
		System.out.println("\n==========================================================================\n");
	}

	public static void displayMainOptions()
	{
		// The details of the user interface
		System.out.println("\nMain Options:");
		System.out.println("1. Display current file names in ascending order\n2. Choose option to perform below\n3. Exit the application");
		System.out.print("Select an option: ");
	}
}
