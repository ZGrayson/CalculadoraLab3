/**
 *  Ejercicio:Login SIN conexión a base de datos
 * @author: Díaz García Zyanya Paola
 * @author: Rodríguez de la Mora Elizabeth Dayanne
 * @version:  1.0 
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class login extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           //Iniciamos con HTML
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
           //Se piden los datos para deplegarlos 
            out.println("<h1>Tu usuario es: " + request.getParameter("usuario")+ "</h1>");
            out.println("<br>");
            out.println("<h1>Tu clave es: " + request.getParameter("clave")+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
