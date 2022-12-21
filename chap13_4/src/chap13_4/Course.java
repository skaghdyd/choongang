package chap13_4;

import java.util.ArrayList;
import java.util.List;

public class Course<T> {
	private String name;
	private List<T> students;

	public Course(String name) {
		this.name = name;
		this.students = new ArrayList<T>();
	}

	public String getName() {
		return name;
	}

	public List<T> getStudents() {
		return students;
	}

	public void add(T t) {
		students.add(t);
	}
	
	public void print() {
		System.out.print(this.name+" :[");
		students.stream().forEach(e->System.out.print(e.toString()+", "));
		System.out.println("]");
	}
}
