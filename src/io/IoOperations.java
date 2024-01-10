package io;

import java.io.*;

public class IoOperations {

	public static void main(String[] args) {
		String dir = "IO_OPERATIONS";
		String fileName = "sampleFile2.txt";
		File file = new File(dir, fileName);

		if (!file.exists()) {
			System.out.println("File does not exists. Creating it...");
			try {
				file.createNewFile();
			} catch (IOException ioEx) {
				System.out.println("Exception occured in program.");
				ioEx.printStackTrace();
			}
		} else {
			System.out.println("File already present.");
		}

		// =========================================
		// Writing into file using bufferedWriter
		// =========================================
		System.out.println("Trying to add some lines into the file.");
		try (FileWriter fileWriter = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fileWriter);) {
			bw.write("Hi, Everyone!");
			bw.write("\n");
			bw.write("This is a line written using buffered writer.");
			bw.write("\n");
			bw.write("line1: hi there");
			bw.write("\n");
			bw.write("line2: how are you?");
		} catch (FileNotFoundException e) {
			System.out.println("File is not present. Exception occured.");
			e.printStackTrace();
		} catch (IOException ioEx) {
			System.out.println("IOException occured at the time of writing into the file.");
			ioEx.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Exception occured at the time of writing into the file.");
			ex.printStackTrace();
		}

		// ===========================================
		// Reading file content with bufferedReader
		// ===========================================
		try (FileReader fileReader = new FileReader(file); BufferedReader br = new BufferedReader(fileReader);) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File is not present. Exception occured.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occured.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Some Exception occured.");
			e.printStackTrace();
		}

	}

}
