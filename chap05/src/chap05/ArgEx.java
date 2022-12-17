package chap05;

public class ArgEx {

	public static void main(String[] args) {
//		System.out.println(args.length);
//		for(int i=0; i<args.length; i++) {
//			System.out.println(args[i]);
//		}
//		if(args.length != 2) {
//			System.out.println("사용예> ArgEx 10 20");
//			System.exit(0);
//		}
		String[][] gugudan = new String[8][9];
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
//				System.out.println(i+" x "+j+" = "+(i*j));
				
				//2차원 배열에 넣기
				gugudan[i-2][j-1] = i+" x "+j+" = "+(i*j);
			}
		}
		
		//2차원 배열 출력
		for(int i=0; i<gugudan.length; i++) {
			System.out.println((i+2)+"단");
			for(int j=0; j<gugudan[i].length; j++) {
				System.out.println("gugudan["+i+"]["+j+"] >>> " + gugudan[i][j]);
			}
		}
	}

}