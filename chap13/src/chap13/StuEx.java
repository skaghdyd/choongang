package chap13;

import java.util.ArrayList;
import java.util.List;

public class StuEx {

	public static void main(String[] args) {
		ArrayList<Student> lst = new ArrayList<Student>();
		Student stu = new Student(0, "홍","202201", "마포구");
		lst.add(stu);
		lst.add(new Student(1, "홍1","202202", "서초구"));
		lst.add(new Student(2, "홍2","202203", "서대문구"));
		System.out.println(lst.get(0).hakbun);
		for (Student st : lst) {
			System.out.println(st.name);
		}
	}

}
