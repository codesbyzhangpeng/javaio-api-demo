package java.fileioapi.stream;

import java.util.Scanner;

public class InputStreamDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "", output = "";
		System.out.println("Enter the message:");
		
		while(true) {
			input = scanner.nextLine();
			if(input.equalsIgnoreCase("Exit"))break;
			output += input.toUpperCase() + " ";			
			}
		System.out.println(output);
 }
}