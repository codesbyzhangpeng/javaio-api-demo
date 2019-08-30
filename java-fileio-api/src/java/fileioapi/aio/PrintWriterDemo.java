package java.fileioapi.aio;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter writer = new PrintWriter(System.out);
//		writer.println("Welcome back to the real world!");
		writer.append("something amazing to tell: ");
		String s = "tefafdaf: ";
		writer.print(s);
		
//		System.out.println(s);
		writer.append("I am proud of what I have learned today; ");
		writer.append("sex.");
//		char[] buf = new char[100];
//		writer.write(buf);
//		System.out.println(buf);
		writer.close();
		writer.flush();
		
	}
}
