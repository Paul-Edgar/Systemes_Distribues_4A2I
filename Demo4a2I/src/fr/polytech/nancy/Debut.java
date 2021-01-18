package fr.polytech.nancy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Debut")
public class Debut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Debut() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//transmettre une information à la JSP
		String mes = "Variable transmise par la Servlet avec la méthode GET";
		//attention il renvoie un Object et pas un string
		request.setAttribute("mes", mes);
				
		//exercice
		String journuit = "Jour";
		request.setAttribute("journuit", journuit);
		// après l'explication sur la Design Pattern MVC, toujours après le traitement
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/debut.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
