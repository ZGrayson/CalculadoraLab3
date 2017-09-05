<%-- 
    JSP para dar de alta en la base de datos
    Created on : 5/09/2017
    Author : Díaz García Zyanya Paola
    Author : Rodriguez de la Mora
    Version: 1.0
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
        <link rel="stylesheet" href="EstiloB.css">
    </head>
     <body background="fondo.jpg">
        <%-- Formulario para dar de alta --%>
        <form action="alta" method="post">
            <center> <br><br><br>
           <font face="Monotype Corsiva" color="darkblue" size="10">Usuario:&nbsp;  </font>
           <br>
           <input type="text" style="width:400px; height:30px;" name="usuario">
           <br><br>
           <font face="Monotype Corsiva" color="darkblue" size="10">Contraseña:&nbsp;  </font>
           <br>
           <input type="password" style="width:400px; height:30px;" name="clave">
           <br><br><br>
           <input type="submit" value="Registrarse" name="registro" id="boton1">
           </center>
        </form>
           
        
            <br><br>
         <%-- Formulario para regresar al inicio --%>   
        <form  action="Main.html" method="post">
            <center>
           <input type="submit" name="menu" value="Menu" id="boton2">
            </center>
         </form>
            
    </body>
</html>
