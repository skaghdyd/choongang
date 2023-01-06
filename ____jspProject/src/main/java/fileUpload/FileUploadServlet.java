package fileUpload;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class FileUploadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		String contentType = request.getContentType();
		if(contentType!=null && contentType.toLowerCase().startsWith("multipart/")) {
			printPartInfo(request);
			getServletContext().getRequestDispatcher("/notice.jsp").forward(request, response);
		} else {
			System.out.println("multipart가 아님");
		}
	}
	
	private void printPartInfo(HttpServletRequest request) throws IOException, ServletException {
		String sessionId = null;
		Collection<Part> parts = request.getParts();
		for(Part part : parts) {
			if(part.getName().equals("sessionId")) {
				sessionId = request.getParameter(part.getName());
			}
			
			System.out.println("name = " + part.getName());			
			String contentType = part.getContentType();
			System.out.println("contentType = " + contentType);
			if(part.getHeader("Content-Disposition").contains("filename=")) {
				System.out.println("size = " + part.getSize());
				String fileName = sessionId + "_" + part.getSubmittedFileName();
				System.out.println("filename = " + fileName);
				if(part.getSize()>0) {
					part.write(request.getServletContext().getRealPath("uploadFile") + "\\" + fileName);
					part.delete();
				}
			} else {
				String value = request.getParameter(part.getName());
				System.out.println("value = " + value);
			}
			System.out.println("-------------------------");
		}
		
	}

}
