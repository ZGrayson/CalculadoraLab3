<!--
 * Ejercicio: Formulario con conexion a base de datos
 * @author: Diaz García Zyanya Paola
 * @author: Rodriguez de la Mora Elizabeth Dayanne 
 * @version:  1.0 
 -->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Altas</title>
    </head>
    <body>
        <h1>Altas</h1>
        <%@page import="java.sql.*,java.io.*"%>
        <%
            //Se traen los datos del formulario
            String nom=request.getParameter("Nombre");
            String apeP=request.getParameter("apellidop");
            String apeM=request.getParameter("apellidom");
            String escu=request.getParameter("escuela");
            //Variables para la conexion
            Connection con=null;
            Statement sta=null;
            try
            {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con=DriverManager.getConnection("jdbc:mysql://localhost/Form","root","n0m3l0");
                sta=con.createStatement();
            }
            catch(SQLException error)
            {
                out.print(error.toString());
            }
            //Se realiza la conexion y se insertan los datos
            try
            {
                sta.executeUpdate("INSERT INTO datos VALUES('"+nom+"','"+apeP+"','"+apeM+"','"+escu+"');");
                out.println("<script>alert('Registro dado de alta exitosamente.')</script>");
                con.close();  
                //Refresca la pagina inicial
                out.print("<META HTTP-EQUIV='REFRESH' CONTENT='.0000001;URL=http://localhost:8080/Formulario/'/>");
            }
            catch(SQLException error)
            {
                out.println(error.toString());
            }
            con.close();    
        %>            
    </body>
</html>
