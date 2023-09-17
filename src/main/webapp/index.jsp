<%-- 
    Document   : index
    Created on : 17-Sep-2023, 05:34:12
    Author     : sebol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculadora de Interés Simple</title>
    </head>
    <body>
        <form action="InterestServlet" method="post">
            Capital: <input type="text" name="principal"><br>
            Tasa de Interés Anual (%): <input type="text" name="rate"><br>
            Número de Años: <input type="text" name="years"><br>
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
