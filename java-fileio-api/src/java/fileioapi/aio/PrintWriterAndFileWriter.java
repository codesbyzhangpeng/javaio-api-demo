package java.fileioapi.aio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterAndFileWriter {
	public static void main(String[] args) throws IOException {
		FileWriter fWriter = new FileWriter("texxt.txt");
		PrintWriter pWriter = new PrintWriter(fWriter,true);
		pWriter.write("be your best self!");
		pWriter.flush();
		FileReader reader = new FileReader("texxt.txt");
		char[] buffer = new char[100];
		int ins = reader.read(buffer);
		pWriter.close();
		System.out.println(buffer);
		System.out.println(ins);
		System.out.println(reader);
	}

}
