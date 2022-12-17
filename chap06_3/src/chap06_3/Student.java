package chap06_3;

public class Student {
	String name = "현대자동차";
	String hakbun;
	String address;
	int kor;
	int math;
	int eng;
	
	Student(String name, String hakbun, String address) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
	}
	
	Student(String name, String hakbun, String address, int kor, int math, int eng) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
	
	double avg() {
		return sum() / 3.0;
	}
	
	void printSum() {
		System.out.println(sum());
	}
	
	int sum() {
		return this.kor + this.math + this.eng;
	}
}
