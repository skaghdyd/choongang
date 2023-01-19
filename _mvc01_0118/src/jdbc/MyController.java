package jdbc;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyController
 */
@WebServlet("/scott.do")
public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Dao dao = Dao.getInstance();
		
		String action = request.getParameter("action");
		if(action==null) {
			List<Emp> elst = dao.selectEmpTempAll();
			
			for(Emp emp : elst) {
				System.out.println(emp);
			}
			
			request.setAttribute("data", elst);
			
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			
			rd.forward(request, response);	
		} else if(action.equals("insert")) {
			int empno = Integer.parseInt(request.getParameter("empno"));
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			int mgr = Integer.parseInt(request.getParameter("mgr"));
			String hiredate = request.getParameter("hiredate");
			int sal = Integer.parseInt(request.getParameter("sal"));
			int comm = Integer.parseInt(request.getParameter("comm"));
			int deptno = Integer.parseInt(request.getParameter("deptno"));
			
			Emp emp = new Emp(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			dao.insertEmpTemp(emp);		
			
			List<Emp> elst = dao.selectEmpTempAll();
			
			request.setAttribute("data", elst);
			
			RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
			
			rd.forward(request, response);
			
		}
	}
}