package java.fileioapi.aio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedWriterAndReader {

	public static void main(String[] args) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("java1.txt"))){
			writer.write("Welcome to the new programming world");
			writer.newLine();
			writer.write("OCPJP 8 practice exam!");
			writer.newLine();
			writer.write("OCPJP 8 practice exam!");
			writer.newLine();
			writer.append("Appended Text");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader("java1.txt"))){
			reader.lines().forEach(System.out::println);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		String output = "";
		try(BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("Anything");
			
		while(true) {
			String conText = reader2.readLine();
			if(conText.equalsIgnoreCase("Exit"))
				break;
			output += conText.toUpperCase() + " ";
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(output);
		
	}
}
