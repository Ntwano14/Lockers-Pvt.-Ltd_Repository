package com.lockedme.developer;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DisplayFileNames extends FileOperations{

	public static void displayFileNamesInAscendingOrder() 
	{
		ArrayList<String> allFileNames = new ArrayList<>();
		
		File rootDir = new File("AvailableFiles");
	    String[] rootDirFiles = rootDir.list();
	    if (rootDirFiles != null) 
	    {
	        allFileNames.addAll(Arrays.asList(rootDirFiles));
	    }

	    allFileNames.addAll(fileNames);

	    if (allFileNames.isEmpty()) 
	    {
	        System.out.println("No files found.");
	    } else 
	    {
	        Collections.sort(allFileNames);
	        System.out.println("Files in Ascending Order:");
	        System.out.println("--------------------------");
	        for (String fileName : allFileNames) 
	        {
	            System.out.println(fileName);
	        }
	    }
	}
}
