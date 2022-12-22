package jdbc;

import java.sql.SQLException;

public class EmpDaoEx {

	public static void main(String[] args) {
		EmpDao empDao = EmpDao.getInstance();
		try {
			for(Emp emp : empDao.selectAll()) {
				System.out.println(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
