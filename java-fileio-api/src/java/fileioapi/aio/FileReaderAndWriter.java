package java.fileioapi.aio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderAndWriter {

	public static void main(String[] args) {
		try(FileWriter writer = new FileWriter("javaworld.txt", false)){ // check if the javaworld.text exists, if not create a new one!
			writer.write("Thank you,");
			writer.append("my love, i need your help");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		File file = new File("javaworld.txt");
		try (FileReader reader = new FileReader(file);){
			char[] buffer = new char[14];
			reader.read(buffer);
			System.out.println(buffer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
