package com.lockedme.developer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperations{
	
	static final List<String> fileNames = new ArrayList<>();
	private static final Scanner scanner = new Scanner(System.in);

	//Method to add a file
	//Protected access specifier
	protected static void addAFile()
	{
		System.out.print("Enter file name : ");
		String fileName = scanner.next();
		File[] files = new File("AvailableFiles").listFiles();

		boolean fileExists = false;
		for (File file : files) 
		{
			if (file.getName().equalsIgnoreCase(fileName)) 
			{
				fileExists = true;
				break;
			}
		}

		if (!fileExists) 
		{
			File newFile = new File("AvailableFiles/" + fileName);

			try
			{
				if (newFile.createNewFile()) 
				{
					System.out.println("File Added successfully.....\n");
					fileNames.add(fileName);
				} 
				else 
				{
					System.out.println("Failed to add the file.");
				}
			} 
			catch (IOException e) 
			{
				System.out.println("An error occurred while adding the file.");
			}
		} 
		else 
		{
			System.out.println("File Already exist\n");
		}
	}
	
	//Method to delete a file
	public static void deleteAFile()
	{
		
		System.out.print("Enter file name to Delete : ");
		String fileName = scanner.next();
		    File[] files = new File("AvailableFiles").listFiles();
		    
		    boolean fileDeleted = false;

		    for (File file : files) 
		    {
		        if (file.getName().equals(fileName)) 
		        {
		            if (file.delete()) 
		            {
		            	System.out.println("File Deleted successfully...\n");
		                fileNames.remove(fileName);
		                fileDeleted = true;
		                break;
		            }
		            else 
		            {
		                System.out.println("Failed to delete the file.");
		                fileDeleted = true;
		                break;
		            }
		        }
		    }

		    if (!fileDeleted) {
		        System.out.println("File Not Found...\n");
		    }
	}
	
	//Method to search a file
	public static void searchAFile() {
	    System.out.print("Enter the file name to search: ");
	    String fileName = scanner.next();

	    boolean fileFound = false;

	    // Search in the root directory
	    File rootDir = new File("AvailableFiles");
	    String[] rootDirFiles = rootDir.list();
	    if (rootDirFiles != null) 
	    {
	        for (String fName : rootDirFiles) 
	        {
	            if (fName.equals(fileName)) 
	            {
	                System.out.println("File found in root directory: " + fName + "\n");
	                fileFound = true;
	                break;
	            }
	        }
	    }

	    // Search in the ArrayList
	    for (String fName : fileNames) 
	    {
	        if (fName.equals(fileName)) 
	        {
	            System.out.println("File found in ArrayList: " + fName + "\n");
	            fileFound = true;
	            break;
	        }
	    }

	    if (!fileFound) {
	        System.out.println("File not found.\n");
	    }
	}

}

class Option2subOptions extends FileOperations
{
	static Scanner scanner = new Scanner(System.in);

	public static void subOptions() throws Exception
	{
		while(true)
		{
			System.out.println("1. Add a file\n2. Delete a file\n3. Search a file\n4. Navigate back to Main Options");
			System.out.print("Pick a choice: ");
			int choice = scanner.nextInt();
			System.out.println();

			switch (choice) 
			{
			case 1:
				addAFile();
				break;
			case 2:
				deleteAFile();
				break;
			case 3:
				searchAFile();
				break;
			case 4:
				System.out.println("Navigating back to main options.....\n");
				return;
			default:
				System.out.println("Invalid Option. Please choose valid option\n");
				break;
			}	
		}
	}
}
