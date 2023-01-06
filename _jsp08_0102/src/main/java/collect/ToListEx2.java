package collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ToListEx2 {

	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍",10,Student.Sex.MALE,Student.City.Busan),
				new Student("김",20,Student.Sex.FEMALE,Student.City.Seoul),
				new Student("신",30,Student.Sex.MALE,Student.City.Busan),
				new Student("박",40,Student.Sex.FEMALE,Student.City.Seoul)
				);
		System.out.println("***************** 1");
		Map<Student.Sex, List<Student>> ms = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));
		ms.get(Student.Sex.MALE).stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println("***************** 2");
		Map<Student.City, List<Student>> ms2 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.toList()));
		ms2.get(Student.City.Seoul).stream()
		.forEach(s->System.out.println(s.getName()));
		
		System.out.println("***************** 3");
		Map<Student.City, List<String>> ms3 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.toList())));
		ms3.get(Student.City.Seoul).stream()
		.forEach(s->System.out.print(s));
		System.out.println();
		ms3.get(Student.City.Busan).stream()
		.forEach(s->System.out.print(s));
		System.out.println();
		
		System.out.println("***************** 4");
		Map<Student.Sex, Double> ms4 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex, Collectors.averagingDouble(Student::getScore)));
		System.out.println(ms4.get(Student.Sex.FEMALE));
		
		System.out.println("***************** 5");
		Map<Student.Sex, String> ms5 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex, Collectors.mapping(Student::getName, Collectors.joining(", "))));
		System.out.println(ms5.get(Student.Sex.FEMALE));
		
		System.out.println("***************** 6");
		Map<Student.City, String> ms6 = totalList.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.mapping(Student::getName, Collectors.joining(", "))));
		System.out.println(ms6.get(Student.City.Busan));
		
	}

}
