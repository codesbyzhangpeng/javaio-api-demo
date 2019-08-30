package java.fileioapi.aio;

import java.io.File;
import java.io.IOException;

public class FileRenameToDemo {

	public static void main(String[] args) throws IOException {
		File dir = new File("myDir");
		File file = new File("myFile");
		dir.mkdir(); file.createNewFile();
		file.renameTo(new File("myDir","myFile"));
		String[] list = dir.list();
		System.out.println(list.length);
	}
}
