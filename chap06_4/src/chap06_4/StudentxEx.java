package chap06_4;

public class StudentxEx {

	public static void main(String[] args) {
		Students students = new Students();
		students.init();
		System.out.println(students.searchStudent("03"));
		students.updateScore("03", 50, 100, 30);
		System.out.println(students.searchStudent("03"));
	}

}
