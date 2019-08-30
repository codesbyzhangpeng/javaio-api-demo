package java.fileioapi.files.stream;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkDemo {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get(".");
		Files.list(path1).filter(p->Files.isRegularFile(p)).forEach(System.out::println);  // List of current files and directories in the given path
		System.out.println("------------------");
		Files.walk(path1,1,FileVisitOption.FOLLOW_LINKS).filter(p->Files.isRegularFile(p)).forEach(System.out::println);
		System.out.println("------------------");
		Files.find(path1, 4, (p,attr)->p.getFileName().toString().endsWith("txt")&&attr.isRegularFile()).forEach(System.out::println);

	}
}
