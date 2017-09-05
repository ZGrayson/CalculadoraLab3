/**
*  Registro de usuario (Servlet con base de datos)
*Created on : 5/09/2017
*@author : Díaz García Zyanya Paola
*@author : Rodriguez de la Mora
*@version: 1.0
*/

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "alta", urlPatterns = {"/alta"})
public class alta extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       //Veriables a recuperar del formulario
        String usuario;
        String clave;
        usuario = request.getParameter("usuario");
        clave = request.getParameter("clave");

        Connection c = null;
        Statement sta = null;
        ResultSet r = null;
        
         //Conexion a base de datos
        try 
            {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet", "root", "n0m3l0");
            sta = c.createStatement();
        //Se insertan los datos en la base de datos    
            sta.executeUpdate("INSERT INTO datos VALUES ('" + usuario + "','" + clave + "');");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.print("<script> alert('Registro exitoso'); </script>");
            out.print("<script> window.location='Main.html'; </script>");

            } 
        catch (InstantiationException | IllegalAccessException
                | ClassNotFoundException | SQLException e) 
            {
            e.printStackTrace();
            }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}