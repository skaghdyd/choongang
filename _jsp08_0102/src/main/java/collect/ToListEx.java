package collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListEx {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍",10,Student.Sex.MALE),
				new Student("김",20,Student.Sex.FEMALE),
				new Student("신",30,Student.Sex.MALE),
				new Student("박",40,Student.Sex.FEMALE)
				);
		List<Student> maleList = totalList.stream()
				.filter(student->student.getSex()==Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.forEach(s->System.out.println(s.getName()));

	}

}
