<%-- 
    Document   : errori
    Created on : 14-mar-2018, 10.08.25
    Author     : JAVASE
--%>

<%@page import="it.genchi.melaverdebio.utilita.ErrMsg"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="stile.css" type="text/css" />
    </head>
    <body>
        <h1>Errori nel sito melaverdebio</h1>
        <%
            for (String errori:ErrMsg.getMsgs()) {
                out.print("<p>"+errori+"</p>");
            }
        %>
    </body>
</html>
