package java.fileioapi.aio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitDemo {

	static boolean f;
	public static void main(String[] args) throws IOException {
		Path path = Paths.get(".");
		FileVisitor<Path> searcher = new Search();
		System.out.println(Files.walkFileTree(path, searcher) + "----");
		
	}
	
	public static final class Search extends SimpleFileVisitor<Path>{
		public FileVisitResult visitFile(Path file, BasicFileAttributes bfa) throws IOException{
//			PathMatcher pm = FileSystems.getDefault().getPathMatcher("glob:*");
			PathMatcher pm2 = FileSystems.getDefault().getPathMatcher("regex:[A-Za-z0-9^~`_./^-^?^+^%=&]+.txt$");
			if(pm2.matches(file.getFileName())&&bfa.isRegularFile()) {
				System.out.println(file);
				f = true;
			}
			return FileVisitResult.CONTINUE;
		}
		
	}
}
