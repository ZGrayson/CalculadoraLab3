/**
*  Inicio de sesión (Servlet con base de datos)
*Created on : 5/09/2017
*@author : Díaz García Zyanya Paola
*@author : Rodriguez de la Mora
*@version: 1.0
*/

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;


@WebServlet(name = "Ingresa", urlPatterns = {"/Ingresa"})
public class Ingresa extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //Veriables a recuperar del formulario
        
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");
        try 
        {
            //Metodo para conectarlo a la base de datos
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Servlet", "root", "n0m3l0");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datos WHERE nom ='" + usuario + "'");
            
            //Compara la variable clave con el usuario registrado
            if (rs.next()) 
            {
                String aux = rs.getString("pas");
                //En caso de que coincida
                if (clave.equals(aux)) 
                {
                    response.setContentType("text/html;charset=UTF-8");
                    PrintWriter out = response.getWriter();
                    //Dirige a nueva ventana
                    out.print("<script> alert('Has ingresado correctamente'); </script>");
                    out.print("<script> window.location='Bien.html'; </script>");
                } 
                // En caso de que no coincida
                else 
                {
                    response.setContentType("text/html;charset=UTF-8");
                    PrintWriter out = response.getWriter();
                    //Regresa al menu inicial
                    out.print("<script> alert('Datos incorrectos/Usuario inexistente'); </script>");
                    out.print("<script> window.location='Main.html'; </script>");
                }

            }
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
    }// </editor-fold>
}
