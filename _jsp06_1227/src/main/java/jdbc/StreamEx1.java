package jdbc;

import java.util.Arrays;
import java.util.List;

public class StreamEx1 {

	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		List<Emp> lst = ed.selectAll("a");
//		IntStream.rangeClosed(1, 5).forEach(e -> {
//			System.out.println("****");
//			System.out.println(e + "test");
//		});

//		List<String> inList = Arrays.asList("10, 20,  30", "40,  50, 60");
//		inList.stream().flatMapToInt(a -> {
//			System.out.println("--------------");
//			String[] strArr = a.split(",");
//			for (String ss : strArr) {
//				System.out.println(ss+"*******");
//			}
//			int[] intArr = new int[strArr.length];
//			for (int i = 0; i < strArr.length; i++) {
//				intArr[i] = Integer.parseInt(strArr[i].trim());
//			}
//			return Arrays.stream(intArr);
//		}).forEach(n->System.out.println(n+"#############"));
		
		System.out.println("-----사번-----");
		lst.stream().sorted()
					.forEach(System.out::println);
		System.out.println("-----부서-----");
		lst.stream().sorted((n1,n2)->n1.getDeptno()-n2.getDeptno())
					.forEach(System.out::println);
	}

}
