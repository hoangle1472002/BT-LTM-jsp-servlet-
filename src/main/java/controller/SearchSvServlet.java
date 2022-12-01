package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.SV_Faculty;
import model.bo.SvBO;

/**
 * Servlet implementation class SearchSvServlet
 */
@WebServlet("/SearchSvServlet")
public class SearchSvServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public SvBO svBO = new SvBO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchSvServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String textName = request.getParameter("nameSearch");
		List<SV_Faculty> data = new ArrayList<>();
		data = svBO.GetAllSVByNameFaculty(textName);
		if(data.size() > 0) {
			request.setAttribute("message", "Result");
			request.setAttribute("ListSV", data);
		
		}else {
			request.setAttribute("message", "Not Exist !");
		}
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
