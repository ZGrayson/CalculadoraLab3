
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  Ejercicio:Hola mundo con servlet
 * @author: Díaz García Zyanya Paola
 * @author: Rodríguez de la Mora Elizabeth Dayanne
 * @version:  1.0 
 */
@WebServlet(urlPatterns = {"/NewServlet"})
public class Hola_Mundo extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //Cadena Hola Mundo
            out.println("<h1>"+"Hola Mundo"+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
