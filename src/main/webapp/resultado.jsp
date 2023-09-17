<%-- 
    Document   : resultado
    Created on : 17-Sep-2023, 05:35:18
    Author     : sebol
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Resultado de Interés Simple</title>
    </head>
    <body>
        <h1>Resultado</h1>
        El interés simple generado es: $<%= request.getAttribute("interest")%>
    </body>
</html>
