import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

public class TextFiles {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName = keyboard.nextLine();
		File sourceFile = new File(fileName);
		File tempFile1 = File.createTempFile("tempFiles", ".txt");
		if(!sourceFile.isFile() || !sourceFile.exists() || !sourceFile.canRead()) {
			System.out.println("Not a valid source file.");
			System.exit(0);
		}
		
		Scanner fileScanner = null;
		try {
			fileScanner = new Scanner(new FileInputStream(sourceFile));
			
		}
		catch(FileNotFoundException e) {
			System.out.println(sourceFile + " cannot open!");
			System.exit(0);
		}
		PrintWriter fileWriter = null;
		try {
			fileWriter = new PrintWriter(new FileOutputStream(tempFile1));
		}
		catch(FileNotFoundException e) {
			System.out.println(tempFile1 + " cannot open!");
			System.exit(0);
		}
		while(fileScanner.hasNextLine()) {
			fileWriter.print(fileScanner.nextLine().replace(".", ".\n"));	
		}
		System.out.println("Copied succesfully!");
		fileScanner.close();
		fileWriter.close();
		
		
		try {
			fileScanner = new Scanner(new FileInputStream(tempFile1));
		}
		catch(FileNotFoundException e) {
			System.out.println(sourceFile + " cannot open!");
			System.exit(0);
		}
		try {
			fileWriter = new PrintWriter(new FileOutputStream(sourceFile));
		}
		catch(FileNotFoundException e) {
			System.out.println(sourceFile + " cannot open!");
			System.exit(0);
		}
		while(fileScanner.hasNextLine()) {
			fileWriter.println(fileScanner.nextLine());
		}
		
		fileScanner.close();
		fileWriter.close();
		tempFile1.delete();
	}

}
