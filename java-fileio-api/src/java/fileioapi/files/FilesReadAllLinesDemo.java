package java.fileioapi.files;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.util.List;

public class FilesReadAllLinesDemo {

	public static void main(String[] args) throws IOException {

		//readAllLines method of Files return a list of String read al the content of the file java.txt
		Path path1 = Paths.get("java.txt");
		List<String> lines = Files.readAllLines(path1);
		System.out.println(lines);
		
		/* the static method copy of Files class return a long value represents the number of characters in the file
		And copy the content of java.txt to orcale.txt.
		*/
		long longValue = Files.copy(path1, new FileOutputStream("Orcale.txt"));
		Path path2 = Paths.get("Orcale.txt");
		List<String> linesOracle= Files.readAllLines(path2);
		System.out.println(linesOracle);
		
		Path path3 = Paths.get("filetofile.txt");
		Files.copy(path1, path3,StandardCopyOption.REPLACE_EXISTING);
		List<String>  copiedfromfile = Files.readAllLines(path3);
		System.out.println(copiedfromfile);
		
		Files.setAttribute(path1, "lastModifiedTime", FileTime.from(Instant.parse("2010-02-20T01:20:00.00Z")));
		System.out.println(Files.getLastModifiedTime(path1));
		System.out.println(Files.getOwner(path1));
		System.out.println(Files.getFileStore(path2) + ": ");

		
	}
}
