package io;

import java.io.*;

public class IoOperations2 {

	public static void main(String[] args) {
		String dir = "IO_OPERATIONS";
		String fileName = "sampleText.txt";
		File file = new File(dir, fileName);

		if (!file.exists()) {
			System.out.println("File does not exists, creating a new file.");
			try {
				file.createNewFile();
			} catch (IOException ioEx) {
				System.out.println("IOException occured.");
				ioEx.printStackTrace();
			} catch (Exception ex) {
				System.out.println("Exception occured.");
				ex.printStackTrace();
			}
		} else
			System.out.println("File already present.");

		// =======================================
		// Writing into file with PrintWriter
		// =======================================
		try (FileWriter fileWriter = new FileWriter(file); PrintWriter pw = new PrintWriter(fileWriter);) {
			pw.write("Hello there, everyone!");
			pw.write("\n");
			pw.write(100); // will add character equivalence of 100.
			pw.write("\n");
			pw.println(20.08); // will add a digits
			pw.println(30);
			pw.println(40);
			pw.println(50);
			pw.println(60);
		} catch (FileNotFoundException e) {
			System.out.println("File is not Found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occured at the time of Writing into the file.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occuredat the time of Writing into the file.");
			e.printStackTrace();
		}

		// =======================================
		// Reading file with BufferedReader
		// =======================================
		try (FileReader fileReader = new FileReader(file); BufferedReader br = new BufferedReader(fileReader)) {

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File is not Found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occured at the time of Reading the file.");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Exception occuredat the time of Reading the file.");
			e.printStackTrace();
		}

	}

}
