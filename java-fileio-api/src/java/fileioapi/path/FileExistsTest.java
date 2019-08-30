package java.fileioapi.path;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExistsTest {

	public static void main(String[] args) {
		Path path = Paths.get("java.txt");
		System.out.println(Files.exists(path, LinkOption.NOFOLLOW_LINKS));
		System.out.println(Files.notExists(path, LinkOption.NOFOLLOW_LINKS));
	}
}
