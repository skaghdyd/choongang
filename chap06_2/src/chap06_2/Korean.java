package chap06_2;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;

	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
	public Korean(String name, String ssn, String nation) {
		this.name = name;
		this.ssn = ssn;
		this.nation = nation;
	}
}
