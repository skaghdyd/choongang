package chap07_2;
abstract class Bbb{
	abstract void print();
}

class Ccc extends Bbb{

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Aaa {
	public static void main (String[] arg) {
//		Bbb bbb = new Bbb();
		Bbb ccc = new Ccc();
	}
}
