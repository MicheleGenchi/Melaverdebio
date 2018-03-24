<%-- 
    Document   : viewLista
    Created on : 1-ago-2017, 8.43.42
    Author     : JAVASE
--%>

<%@page import="java.lang.reflect.Field"%>
<%@page import="it.genchi.melaverdebio.bean.ArticoloBean" %>
<jsp:useBean id="voce" class="it.genchi.melaverdebio.bean.ArticoloBean" scope="request" />
<jsp:useBean id="lista" class="it.genchi.melaverdebio.bean.ListaArticoliBean" scope="request" />

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina di visualizzazione della lista articoli</title>
        <link rel="stylesheet" href="stile.css" type="text/css" />
    </head>
    <body>
        <h1>Lista articoli</h1>

        <table>
            <% //Intestazione tabella
                out.print("<tr>");
                for (Field f : voce.getClass().getDeclaredFields()) {
                    out.print("<td>");
                    out.print(f.getName());
                    out.print("</td>");
                }
                out.print("</tr>");

                //Creazione tabella righe
                out.print("<tr>");
                for (ArticoloBean v : lista.getLista()) {
                    out.print("<tr>");
                    //Creazione colonne dati VoceBean
                    out.print("<td class=\"nomeprodotto\">");
                    out.print(v.getIdArticolo());
                    out.print("</td>");
                    out.print("<td class=\"nomeprodotto\">");
                    out.print(v.getDescrizione());
                    out.print("</td>");
                    out.print("<td class=\"nomeprodotto\">");
                    out.print(v.getCatmerceologica());
                    out.print("</td>");
                    out.print("</tr>");
                }
            %>
        </table>
    </body>
</html>
