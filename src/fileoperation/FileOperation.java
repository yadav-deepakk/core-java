package fileoperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperation {

	public static void main(String[] args) throws IOException {

		String filePath = "";
		String fileName = "JavaFile.txt";
		File myFile = new File(filePath + fileName);
		
		if(!myFile.exists()) {
			System.out.println("Trying to create a new file.");
			try {
				// throw new Exception("Error in creating file.");
				myFile.createNewFile();
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println(myFile.getName() + " => already exists!");
		}
		
		if(!myFile.exists()) {
			return;
		}
		
		if(myFile.length() == 0) {
			System.out.println("Adding lines to the file.");
			FileWriter myFileWriter = new FileWriter(myFile);
			myFileWriter.write("Hi! \nThis is a sample File created using Java Programing Language.");
			myFileWriter.close();
		}
		
		Scanner fileScanner = new Scanner(myFile);
		while(fileScanner.hasNextLine()) {
			System.out.println(fileScanner.nextLine());
		}
		fileScanner.close();
		
		if(myFile.exists()) {
			System.out.println("\""+myFile.getName() + "\" will be deleted!");
			myFile.delete();
		}

	}

}
