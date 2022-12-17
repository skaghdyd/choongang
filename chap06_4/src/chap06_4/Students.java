package chap06_4;

public class Students {
	Student[] stuArr = new Student[99];
	
	void init() {
		for (int i = 0; i < stuArr.length; i++) {
			insertStudent(i, (i + 1) + "번학생", "0" + (i + 1), "마포구" + (int) Math.ceil(Math.random() * 10) + "번지",
					(int) Math.ceil(Math.random() * 100), (int) Math.ceil(Math.random() * 100),
					(int) Math.ceil(Math.random() * 100));
		}		
	}

	
	void insertStudent(int i, String name, String hakbun, String address, int kor, int math, int eng) {
		stuArr[i] = new Student(name, hakbun, address, kor, math, eng);
	}
	
	Student searchStudent(String hakbun) {
		for (int i = 0; i < stuArr.length; i++) {
			if (stuArr[i].hakbun.equals(hakbun)) {
				return stuArr[i];
			}
		}
		return null;
	}
	
	void updateKorScore(String hakbun, int kor) {
//		for (int i = 0; i < stuArr.length; i++) {
//			if (stuArr[i].hakbun.equals(hakbun)) {
//				stuArr[i].kor = kor;
//			}
//		}
		Student student = searchStudent(hakbun);
		student.kor = kor;
	}
	
	void updateScore(String hakbun, int kor, int math, int eng) {
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

}
