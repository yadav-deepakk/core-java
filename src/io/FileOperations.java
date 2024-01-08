package io;

import java.io.*;

public class FileOperations {
	public static void main(String[] args) {
		File file1 = new File("txtFile1.txt"); // creates file in current workspace
		System.out.println(file1.exists());
		
		File dir = new File("IO_OPERATIONS"); 
		System.out.println(dir.exists());
		try{
			file1.createNewFile(); 
			dir.mkdir(); 
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
