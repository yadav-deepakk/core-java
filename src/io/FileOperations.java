package io;

import java.io.*;

public class FileOperations {
	public static void main(String[] args) {
		File file1 = new File("txtFile1.txt"); // creates file in current workspace
		System.out.println(file1.exists());
		
		File file2 = new File("IO_OPERATIONS"); 
		System.out.println(file2.exists());
		try{
			file1.createNewFile(); 
			file2.createNewFile(); 
			System.out.println(file1.getPath());
			System.out.println(file1.getAbsolutePath());
			
		}catch(IOException ioEx) {
			System.out.println("IOException occured");
			ioEx.printStackTrace();
		}catch(Exception ex) {
			System.out.println("Exception occured.");
			ex.printStackTrace();
		}
		
	}

}
