package empDaoEx;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmpDaoEx {
	public static void main(String[] args) {
		EmpDao ed = EmpDao.getInstance();
		List<Emp> lst = ed.selectAll("a");
//		lst.stream().forEach(n->System.out.println(n));
		Map<Integer, List<Emp>> md1 = lst.stream()
				.collect(Collectors.groupingBy(Emp::getDeptno));
		md1.get(10).stream()
		.forEach(n->System.out.println(n));
		System.out.println("*************************");
		
		Map<Integer, Double> md2 = lst.stream()
				.collect(Collectors.groupingBy(Emp::getDeptno, Collectors.averagingDouble(Emp::getSal)));
		System.out.println(md2.get(20));
		System.out.println("*************************");
		
		Map<Integer, String> md3 = lst.stream()
				.collect(Collectors.groupingBy(Emp::getDeptno, Collectors.mapping(Emp::getEname, Collectors.joining(", "))));
		System.out.println(md3.get(20));		
	}
}
