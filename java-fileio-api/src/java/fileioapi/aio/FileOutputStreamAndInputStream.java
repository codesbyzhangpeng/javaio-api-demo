package java.fileioapi.aio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamAndInputStream {

	public static void main(String[] args) {
		try(FileOutputStream output = new FileOutputStream("java.txt", true)){
			byte[] buffer = "Welcome to the java world!\n".getBytes();
			output.write(buffer);
			output.flush();
			buffer = "OCPJP 8 practice exams".getBytes();
			output.write(buffer,0,8);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream input = new FileInputStream("java.txt")){
			byte[] buffer = new byte[100];
			input.read(buffer);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
