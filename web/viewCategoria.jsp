<%-- 
    Document   : viewLista
    Created on : 1-ago-2017, 8.43.42
    Author     : JAVASE
--%>

<%@page import="java.lang.reflect.Field"%>
<jsp:useBean id="categorie" class="it.genchi.melaverdebio.bean.ListaCategorieBean" scope="session" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina di visualizzazione categorie</title>
        <link rel="stylesheet" href="stile.css" type="text/css" />
    </head>
    <body>
        <h1>Lista categorie</h1>

        <% //Intestazione tabella
            out.print("Categoria merceologica");
        %>
        <form action="doLista.jsp">
        <select name="categoria">
            <%
                for (String c : categorie.getLista()) {
                    out.print("<option value=\""+c+"\">" + c + "</option>");
                }
            %>
        </select>
        <input type="submit" value="seleziona" />
        </form>
    </body>
</html>
