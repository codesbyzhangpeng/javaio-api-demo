package java.fileioapi.aio;

import java.io.Console;

public class ConsoleDemo {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		Console console = System.console();
		
		if(console!=null) {
			console.printf("Welcome to %s", "the java development world!");
			console.format("Welcome to %s", "the new world!");
		}else
		System.out.println("Console is not obtained");
	}
}
