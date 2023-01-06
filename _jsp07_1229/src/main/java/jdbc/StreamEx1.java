package jdbc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

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
		System.out.println("-----부서, 사번-----");
		lst.stream().sorted(Comparator.reverseOrder())
					.sorted((n1,n2)->n1.getDeptno()-n2.getDeptno())
					.forEach(System.out::println);
		
		System.out.println("-----루빙 peek()-----");
		List<Emp> dept10 = new ArrayList<Emp>();
		double avg = lst.stream()
						.filter(emp->emp.getDeptno()==10)
						.peek(emp->dept10.add(emp))
						.mapToInt(Emp::getSal)
						.average().getAsDouble();
		dept10.stream().forEach(System.out::println);
		System.out.println("평균 : " + avg);
		
		System.out.println("------------");
		List<Integer> list = new ArrayList<Integer>();
		double avg2 = list.stream()
						  .mapToInt(Integer::intValue)
						  .average().orElse(0.0);
		System.out.println(avg2);
		
		System.out.println("------------");
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(e->System.out.println(e));
		
		System.out.println("-----------");
		OptionalDouble opt = list.stream()
				.mapToInt(Integer::intValue)
				.average();		
		if(opt.isPresent()) {
			System.out.println(opt.getAsDouble());
		} else {
			System.out.println("없음");
		}
		
	}

}
