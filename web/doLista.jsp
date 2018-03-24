<%-- 
    Document   : doLista
    Created on : 3-ago-2017, 22.27.35
    Author     : JAVASE
--%>

<%@page import="it.genchi.melaverdebio.utilita.ErrMsg"%>
<%@page import="it.genchi.melaverdebio.utilita.Errors"%>
<%@page import="it.genchi.melaverdebio.db.ListaArticoliDAO"%>
<jsp:useBean id="lista" class="it.genchi.melaverdebio.bean.ListaArticoliBean" scope="request" />

<%
    // dolista.jsp
    //interroga il database per ottenere le voci
    String cat = request.getParameter("categoria");
    ListaArticoliDAO articoliDAO = new ListaArticoliDAO();
    if (!articoliDAO.fill(lista, cat)) // se non posso recuperare dal database le informazioni sulle categorie
    // reindirizzo alla pagina di errore
    {
        response.sendRedirect("errori.jsp");
    }
%>
<jsp:forward  page="viewLista.jsp" />
