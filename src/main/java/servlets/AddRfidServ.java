package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.UserDAO;

/**
 * Servlet implementation class AddRfidServ
 */
@WebServlet("/AddRfidServ")
public class AddRfidServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
    RequestDispatcher rd = null;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddRfidServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String rfid = request.getParameter("RFID");
		if(UserDAO.addRFID(rfid) == 1) {
			System.out.println("User Added Successfully!");
			rd = request.getRequestDispatcher("AddRfidSuccess.jsp");
			rd.forward(request, response);
		}
		else {
			System.out.println("Error while adding User!");
			doGet(request, response);
		}
	}

}
