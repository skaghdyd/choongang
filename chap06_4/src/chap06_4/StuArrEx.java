package chap06_4;

public class StuArrEx {
	static Student[] stuArr;

	public static void main(String[] args) {
		stuArr = new Student[99];
		
//		stuArr[0] = new Student();
//		stuArr[0].name = "홍";
//		System.out.println(stuArr[0].name);
//		insertStudent("홍", "01", "마포구", 89, 97, 67);
//		System.out.println(stuArr[0]);

		for (int i = 0; i < stuArr.length; i++) {
			insertStudent(i, (i + 1) + "번학생", "0" + (i + 1), "마포구" + (int) Math.ceil(Math.random() * 10) + "번지",
					(int) Math.ceil(Math.random() * 100), (int) Math.ceil(Math.random() * 100),
					(int) Math.ceil(Math.random() * 100));
		}
//		for (Student student : stuArr) {
//			System.out.println(student);
//		}

//		for(int i=0; i<stuArr.length; i++) {
//			if(stuArr[i].hakbun.equals("03")) {
//				System.out.println(stuArr[i]);
//			}
//		}
		System.out.println(searchStudent("03"));
		updateKorScore("03", 100);
		System.out.println(searchStudent("03"));
		updateScore("03", 50, 100, -1);
		System.out.println(searchStudent("03"));
	}

	static void updateScore(String hakbun, int kor, int math, int eng) {
//		for (int i = 0; i < stuArr.length; i++) {
//			if (stuArr[i].hakbun.equals(hakbun)) {
//				stuArr[i].kor = ((kor >= 0) ? kor : stuArr[i].kor);
//				stuArr[i].math = ((math >= 0) ? math : stuArr[i].math);
//				stuArr[i].eng = ((eng >= 0) ? eng : stuArr[i].eng);
//			}
//		}
		Student student = searchStudent(hakbun);
		student.kor = ((kor >= 0) ? kor : student.kor);;
		student.math = ((math >= 0) ? math : student.math);
		student.eng = ((eng >= 0) ? eng : student.eng);
	}

	static void updateKorScore(String hakbun, int kor) {
//		for (int i = 0; i < stuArr.length; i++) {
//			if (stuArr[i].hakbun.equals(hakbun)) {
//				stuArr[i].kor = kor;
//			}
//		}
		Student student = searchStudent(hakbun);
		student.kor = kor;
	}

	static Student searchStudent(String hakbun) {
		for (int i = 0; i < stuArr.length; i++) {
			if (stuArr[i].hakbun.equals(hakbun)) {
				return stuArr[i];
			}
		}
		return null;
	}

	static void insertStudent(int i, String name, String hakbun, String address, int kor, int math, int eng) {
		stuArr[i] = new Student(name, hakbun, address, kor, math, eng);
	}

}
