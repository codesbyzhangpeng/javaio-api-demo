package java.fileioapi.stream;

import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {
		PrintStream stream1 = System.out;
		PrintStream stream2 = System.err;
		System.out.println(stream1 == stream2);
	}
}
