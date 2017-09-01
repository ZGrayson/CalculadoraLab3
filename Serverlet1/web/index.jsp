<%-- 
  
 Ejercicio:Login SIN conexion a base de datos
 @author: Díaz García Zyanya Paola
 @author: Rodríguez de la Mora Elizabeth Dayanne
 @version:  1.0 
 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%-- Formato en CSS para la pagina--%>
    <style>
    #button 
    {
    background-color: darkmagenta;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 24px;
    }
    #button:hover
    {
     background-color: darkcyan;   
    }
    
    </style>
    <body>
        <%-- Form para recibir y enviar los datos al servlet--%>
        <form action="login" method="post">
            <center>
            <font face="Calibri" color="violet" size="10"> Escribe tu Usuario:&nbsp;  </font>
            <br>
           <input type="text" style="width:400px; height:30px;" name="usuario">
           <br><br>
           <font face="Calibri" color="violet" size="10"> Escribe tu contraseña:&nbsp;  </font>
           <br>
           <input type="password" style="width:400px; height:30px;"name="clave">
           <br><br><br>
           <input type="submit" value="Enviar" id="button">
            </center>
        </form>
    </body>
</html>
