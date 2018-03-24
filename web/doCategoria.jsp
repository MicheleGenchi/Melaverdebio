<%-- 
    Document   : doLista
    Created on : 3-ago-2017, 22.27.35
    Author     : JAVASE
--%>

<%@page import="it.genchi.melaverdebio.db.DAOClass"%>
<%@page import="it.genchi.melaverdebio.utilita.Errors"%>
<%@page import="it.genchi.melaverdebio.utilita.ErrMsg"%>
<%@page import="it.genchi.melaverdebio.db.CategoriaDAO"%>
<jsp:useBean id="categorie" class="it.genchi.melaverdebio.bean.ListaCategorieBean" scope="session" />

<%
    //interroga il database per ottenere le categorie
    CategoriaDAO categoriaDAO = new CategoriaDAO();
    if (!categoriaDAO.fill(categorie)) // se non posso recuperare dal database le informazioni sulle categorie
    // reindirizzo alla pagina di errore
    {
        response.sendRedirect("errori.jsp");
    } else {
        response.sendRedirect("viewCategoria.jsp");
    }
%>



