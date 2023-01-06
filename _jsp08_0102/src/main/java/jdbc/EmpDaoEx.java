package jdbc;

import java.util.stream.IntStream;

public class EmpDaoEx {

	public static void main(String[] args) {
		EmpDeptDao ed = EmpDeptDao.getInstance();
//		Dept dept = new Dept(60, "회계", "인천");
//		int res = ed.insertDeptTemp(dept);
//		System.out.println(res);
		
		IntStream.rangeClosed(7, 10)
		.forEach(e->{
			int res = ed.insertDeptTemp(new Dept(e*10, "부서"+e, "지역"+e));
			System.out.println(res);
		});

	}

}
