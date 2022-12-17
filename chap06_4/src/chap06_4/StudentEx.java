package chap06_4;

public class StudentEx {

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "홍";
		student.hakbun = "202201";
		student.address = "서울 마포구";
		Student student2 = new Student("홍", "202201", "서울 마포구");
//		Student student3 = new Student("202201", "홍", "서울 마포구");
		student2.kor = 90;
		student2.math = 89;
		student2.eng = 97;
		
		double dd = student2.avg();
		System.out.println(dd);

	}

}
