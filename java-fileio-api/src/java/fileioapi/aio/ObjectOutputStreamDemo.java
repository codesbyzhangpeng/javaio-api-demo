package java.fileioapi.aio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("Text.txt");
		FileOutputStream fileOut = new FileOutputStream(file);
		ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
		Student outStudent = new Student("Jon Snow", 2);
		outStream.writeObject(outStudent);
		FileInputStream fileIn = new FileInputStream("Text.txt");
		ObjectInputStream inStream = new ObjectInputStream(fileIn);
		Student inStudent = (Student)inStream.readObject();
		System.out.println(inStudent.getId() + ": " + inStudent.getName());
		outStream.close();
		inStream.close();
		
	}
}
