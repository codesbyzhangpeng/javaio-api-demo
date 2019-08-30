package java.fileioapi.aio;

import java.io.Serializable;

public class Student implements Serializable{

	private int id;
	private String name;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public int getId() {return id;}
	public String getName() {return name;}
	
}
