package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.SV;
import model.bo.SvBO;

/**
 * Servlet implementation class UpdateSvServlet
 */
@WebServlet("/CheckUpdateSvServlet")
public class CheckUpdateSvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SvBO svBO = new SvBO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUpdateSvServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    String mssv = request.getParameter("mssv");
	        String name = request.getParameter("name");
	        String gender = request.getParameter("gender");
	        int id_sv_faculty = Integer.parseInt(request.getParameter("id_sv_faculty"));

	        SV sv = new SV(mssv,id_sv_faculty,name,gender);
	        svBO.UpdateSv(sv);
	    	RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
