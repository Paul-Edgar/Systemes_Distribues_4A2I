package fr.polytech.nancy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Bigdata")
public class Bigdata extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Bigdata() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Cette m�thode est utilis�e pour r�f�rencer des servlets d'autres applications Web d�ploy�es sur un m�me server.
		this.getServletContext().getRequestDispatcher("/WEB-INF/bigdata.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
