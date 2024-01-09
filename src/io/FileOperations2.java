package io;

import java.io.*;

public class FileOperations2 {
	public static void main(String[] args) {
		String filePath = "IO_OPERATIONS";
		String fileName1 = "textFile1.txt";
		String fileName2 = "textFile2.txt";
		File file1 = new File(filePath + "/" + fileName1); 
		File file2 = new File(filePath + "/" + fileName2); 
		
		try {
			if(!file1.exists()) file1.createNewFile();
			if(!file2.exists()) file2.createNewFile();
			
		}catch(IOException ioEx) {
			System.out.println("Ecception occured in creating files.");
			ioEx.printStackTrace(); 
		}
		
		File directory = new File(filePath); 
		String[] files = directory.list();
		
		// Displaying files present in a particular directory. 
		int i=0; 
		for(String file : files ) {
			System.out.println(++i + ": " + file);
		}

	}
	
}
