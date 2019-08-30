package java.fileioapi.path;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathdemo {

	public static void main(String[] args)  throws IOException{
		File file = new File("javanew.txt");
		file.createNewFile();
		System.out.println(file.exists());
		File file2 = new File("java.txt");
		Path path1 = Paths.get("java.txt").toAbsolutePath();
		Path path2 = Paths.get("javanew.txt");
		Path path3 = Paths.get("C:\\Users\\czp\\eclipse-workspace\\oca1\\test.txt");
		System.out.println(path3.relativize(path1));
		
		
		System.out.println(path1);
		System.out.println(path1.relativize(path3));
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.exists());
		File file01 = new File("..\\oca1\\test.txt");
		System.out.println(file01.exists());
		
	}
}
