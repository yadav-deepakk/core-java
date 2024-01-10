package io;

import java.io.*;

public class FileOperations3 {

	public static void main(String[] args) {
		String filePath = "IO_OPERATIONS";
		String fileName1 = "sampleTextFile.txt";

		File file1 = new File(filePath, fileName1);
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

		// ====================================================
		// Writing Contents into a file with FileWriter.
		// ====================================================
		try {
			// this will append the content to the file of write operations.
			// fileWriter1 = new FileWriter(file1, true);

			// overrides the content of the file by default.
			FileWriter fileWriter1 = new FileWriter(file1);

			fileWriter1.write("Hello world!");
			fileWriter1.write("\n");
			fileWriter1.write("This is a sample text into file1.");
			fileWriter1.write("\n");
			fileWriter1.write(101); // adds character 101 (alphabet 'e') not integer 101
			char[] chars = { 'J', 'a', 'v', 'a', ' ', 'P', 'r', 'a', 'c', 't', 'i', 'c', 'e' };
			fileWriter1.write("\n");
			fileWriter1.write(chars);

			fileWriter1.close();

		} catch (IOException e) {
			System.out.println("IOException in writing content into the file.");
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception in writing content into the file.");
			ex.printStackTrace();
		}

		// ====================================================
		// Reading Contents of a file with FileReader.
		// ====================================================
		try (FileReader fileReader1 = new FileReader(file1)) {
			// reading file character by character
//			System.out.println("File Content Bytes : ");
//			int i = fileReader1.read();
//			while (i != -1) {
//				System.out.println(i + " -> " + (char) i);
//				i = fileReader1.read();
//			}
//			System.out.println();

			System.out.println("File Content chars : ");
			char[] file1Chars = new char[(int) file1.length()];
			fileReader1.read(file1Chars);
			for (char c : file1Chars) {
				System.out.print(c);
			}

		} catch (IOException e) {
			System.out.println("IOException in reading content into the file.");
			e.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception in reading content into the file.");
			ex.printStackTrace();
		}

	}

}
