package chap13_4;

public class WildCardEx {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + " 수강생: " + course.getStudents());
	}

	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + " 수강생: " + course.getStudents());
	}

	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + " 수강생: " + course.getStudents());
	}

	public static void main(String[] args) {
		Course<Person> personCourse = new Course<Person>("일반인과정");
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new HighStudent("고등학생"));

		Course<Worker> workerCourse = new Course<Worker>("직장인과정");
		workerCourse.add(new Worker("직장인"));

		Course<Student> studentCourse = new Course<Student>("학생과정");
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));

		Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생과정");
		highStudentCourse.add(new HighStudent("고등학생"));

		registerCourse(personCourse);personCourse.print();
		registerCourse(workerCourse);workerCourse.print();
		registerCourse(studentCourse);studentCourse.print();
		registerCourse(highStudentCourse);highStudentCourse.print();
		System.out.println();

		// registerCourseStudent(personCourse); (x)
		// registerCourseStudent(workerCourse); (x)
		registerCourseStudent(studentCourse);
		registerCourseStudent(highStudentCourse);
		System.out.println();

		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
		// registerCourseWorker(studentCourse); (x)
		// registerCourseWorker(highStudentCourse); (x)
	}

}
