package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;
import model.bo.UserBO;

 

@WebServlet("/CheckLoginServlet")
public class CheckLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 UserBO userBo= new UserBO();
    public CheckLoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		try {
			User a = userBo.GetUserLogin(name, pass);
			if (a == null) {
				RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
				request.setAttribute("message", "Invalid username and password");
				rd.forward(request, response);
			} else {
				request.setAttribute("message", "Welcome !");
				request.getSession().setAttribute("user", a);
				response.sendRedirect("ListSvServlet");
			}
	
		}catch(Exception e) {
			
		}
	 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
