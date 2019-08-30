package java.fileioapi.files;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Map;

public class AttributeDemo {

	public static void main(String[] args)  throws IOException{
		Path path = Paths.get("java.txt");
		FileStore fs = Files.getFileStore(path);
		System.out.println(fs.getTotalSpace());
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes attSet1 = view.readAttributes();
		BasicFileAttributes attSet2 = Files.readAttributes(path, BasicFileAttributes.class);
		Map<String, Object> map = Files.readAttributes(path, "basic:*");
		System.out.println("Size:" + attSet1.size() + " " + attSet2.size() + " " + map.size());
	}
}
