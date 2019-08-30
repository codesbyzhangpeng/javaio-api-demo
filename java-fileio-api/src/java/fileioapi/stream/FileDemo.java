package java.fileioapi.stream;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		File file = new File("javapro.txt");
		System.out.println(file.exists());
		try {
			file.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println(file.exists());
		File dir = new File("java");
		dir.mkdir();
		System.out.println(dir.exists());
	}
}
