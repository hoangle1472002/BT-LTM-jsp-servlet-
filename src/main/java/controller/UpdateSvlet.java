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
 * Servlet implementation class UpdateSvlet
 */
@WebServlet("/UpdateSvlet")
public class UpdateSvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SvBO svBO = new SvBO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSvlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		SV sv = svBO.GetSVById(id);
		RequestDispatcher rd = request.getRequestDispatcher("Edit.jsp");
		request.setAttribute("message", "Update sinh vien ");
		request.setAttribute("SV", sv);
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
