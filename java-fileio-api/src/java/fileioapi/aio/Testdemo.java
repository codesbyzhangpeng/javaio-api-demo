package java.fileioapi.aio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testdemo {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("java3.txt");
		
		writer.write("uuuuttedddafdaadest");
		writer.close();	
		
		FileReader reader = new FileReader("java3.txt");
		char[] buffer = new char[20];
		int character = reader.read(buffer);
		System.out.println(character);
		
		System.out.println(buffer);
		reader.close();
		
	}
	
}
