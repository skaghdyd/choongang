package chap06_4;

public class Student {
	String name;
	String hakbun;
	String address;
	int kor;
	int math;
	int eng;

	Student() {
		// TODO Auto-generated constructor stub
	}

	Student(String name, String hakbun, String address) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
	}

	public Student(String name, String hakbun, String address, int kor, int math, int eng) {
		this.name = name;
		this.hakbun = hakbun;
		this.address = address;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	int sum() {
		return this.kor + this.math + this.eng;
	}

	double avg() {
		return (double) sum() / 3; // sum() / 3.0 과 동일함.
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", hakbun=" + hakbun + ", address=" + address + ", kor=" + kor + ", math="
				+ math + ", eng=" + eng + "]";
	}
}