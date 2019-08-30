package java.fileioapi.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class FileOperationDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("java123.txt");
		file.createNewFile();
		File file2 = new File("Oracle.txt");
		file2.createNewFile();
		Path java = Paths.get("java123.txt");
		Path oracle = Paths.get("Oracle.txt");
		Files.move(java, oracle, StandardCopyOption.REPLACE_EXISTING);
		
		System.out.println(file.exists());
		System.out.println(file2.exists() + ":" + file2.getName());
		
		Path path1 = Paths.get("java123.txt");
		Path path2 = Paths.get("Oracle.txt");
		System.out.println(Files.exists(path1));
		System.out.println(Files.exists(path2));
		
		Files.copy(path2, path1, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(Files.exists(path1));
		System.out.println(path1.getFileName());
		System.out.println(path2.getFileName());
		
		
//		Files.copy(path1, System.out);
//		Files.copy(System.in, path2, StandardCopyOption.REPLACE_EXISTING);
		
		Files.copy(path2, new FileOutputStream("outstream.txt"));
		Path path3 = Paths.get("outStream.txt");
		System.out.println(path3.getFileName());
		
		Files.list(Paths.get(System.getProperty("user.dir"))).forEach(System.out::println);;
		

		
		
	}
}
