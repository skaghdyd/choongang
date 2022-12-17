package chap05_2;

class Ddd {

}

public class Ccc {
	Ddd a;
	
	Ccc(Ddd d){
		a = d;
	}
	
	void mmm(Ddd d) {
		a = d;
	}
	
	public static void main(String[] args) {
		Ddd d = null;// = new Ddd();
		Ccc c = new Ccc(d);	
		c.mmm(d);
		c.a = d;
	}

}
