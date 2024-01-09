package io;

import java.io.*;

public class FileOperations3 {

	public static void main(String[] args) {
		String filePath = "IO_OPERATIONS";
		String fileName1 = "textFile1.txt";

		File file1 = new File(filePath + "/" + fileName1);
		if (!file1.exists()) {
			System.out.println("File: " + fileName1 + ", does not exists.");
			try {
				file1.createNewFile();
			} catch (IOException ioEx) {
				System.out.println("IOException occured in program.");
				ioEx.printStackTrace();
			} catch (Exception ex) {
				System.out.println("Exception occured in program.");
				ex.printStackTrace();
			}
		} else {
			System.out.println("File: " + fileName1 + ", already present.");
		}

		// writing into file in java.
		try {
			FileWriter fileWriter1;
			fileWriter1 = new FileWriter(file1);

			fileWriter1.write("Hello world!");
			fileWriter1.write("This is a sample text into file1.");
			fileWriter1.write(101); // adds character 101 (alphabet 'e') not integer 101
			char[] chars = { 'J', 'a', 'v', 'a', ' ', 'P', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
			fileWriter1.write(chars);

			fileWriter1.close();

		} catch (IOException e) {
			System.out.println("Some exception in writing content into the file.");
			e.printStackTrace();
		}

	}

}
