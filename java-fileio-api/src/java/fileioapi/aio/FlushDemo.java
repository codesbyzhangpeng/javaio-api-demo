package java.fileioapi.aio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FlushDemo {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("whizlabs.txt");
		FileReader reader = new FileReader("whizlabs.txt");
		writer.write("ahizlabs");
//		writer.flush();
		char[] buffer = new char[100];
		int charater = reader.read();
		int ins = reader.read(buffer);
		
		
		
		System.out.println(charater);
		System.out.println(ins);
		reader.close();writer.close();
		
	}
}
