package chap05_2;

public class ScoreEx {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "홍";
		stu.hakbun = "01";
		
		Scores sco = new Scores();
		sco.kor = 89;
		sco.math = 91;
		sco.eng = 88;
		
		stu.scores = sco;
		
	}

}
