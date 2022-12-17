package chap05;

public class Exercise07 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2, 5, 5, 1, 2, 3, 1, 2, 5, 6, 8, 8, 3, 3, 3, 7, 9, 9, 1, 2, 4, 5, 6, 7, 8, 9, 4, 5,
				2, 5, 5, 5, 5, 5, 5, 1, 1, 12, 12, 9, 8, 88, 77, 44, 15, 52, 45, 88, 9, 1, 1, 2, 3, 2, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max: " + max);

		int[] index = new int[max + 1];
		for (int i = 0; i < array.length; i++) {
			index[array[i]]++;
		}
		int cnt = 0;
		int mode = 0;
		for (int i = 0; i < index.length; i++) {
			if (cnt < index[i]) {
				cnt = index[i];
				mode = i;
			}
		}
		System.out.println("array.length >>> " + array.length);

		System.out.println("index.length >>> " + index.length);
		for (int i = 0; i < index.length; i++) {
			System.out.print(index[i] + ", ");
		}

		System.out.println("최빈값은 >>> " + mode);
		System.out.println("최빈값이 몇번 나왔냐 >>> " + cnt);
	}

}
