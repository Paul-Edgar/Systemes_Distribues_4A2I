package fr.polytech.nancy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Microservices")
public class Microservices extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Microservices() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Cette méthode est utilisée pour référencer des servlets d'autres applications Web déployées sur un même server.
		this.getServletContext().getRequestDispatcher("/WEB-INF/microservices.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
