package java.fileioapi.files.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class LinesList {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".\\java.txt");
		Files.lines(path).forEach(System.out::println);
		Path path2 = Paths.get(".\\java.txt");
		Map map = new HashMap<String, Object>();
		map = Files.readAttributes(path2, "basic:*");;
		System.out.println(map);
		
		File file = new File("java.txt");
		System.out.println(file.getAbsolutePath());
		List<String> list= Files.readAllLines(Paths.get(file.getAbsolutePath()));
		System.out.println(list);
		
		Path path01 = Paths.get("C:\\Users\\czp\\eclipse-workspace\\ocjp\\java.txt");
		Path path02 = Paths.get(".\\java.txt");
		Path path03 = Paths.get(".\\java.txt");
		List<String> list2 = Files.readAllLines(path03);
		list2.stream().skip(3).forEach(System.out::println);
		
		System.out.println(Files.isSameFile(path01, path02));
		Path path1 = Paths.get(".");
		Files.list(path1).forEach(System.out::println);
//		System.out.println("------------------");
//		Files.walk(path1, 1, FileVisitOption.FOLLOW_LINKS).filter(p->Files.isRegularFile(p)).forEach(System.out::println);
//		System.out.println("------------------");
//		Files.find(path1, 4, (p,q)->p.getFileName().toString().endsWith("java")&&q.isRegularFile()).forEach(System.out::println);
//		
		

	}
}
