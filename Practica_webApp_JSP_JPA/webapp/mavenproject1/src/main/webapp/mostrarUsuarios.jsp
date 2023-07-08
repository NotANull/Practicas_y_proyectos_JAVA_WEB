<%@page import="java.util.List"%>
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <%
            List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            for (Usuario elem : listaUsuarios) {
        %>
                <p>Id: <%=elem.getId()%></p>
                <p>Dni: <%=elem.getDni()%></p>
                <p>Nombre: <%=elem.getNombre()%></p>
                <p>Apellido: <%=elem.getApellido()%></p>
                <p>Teléfono: <%=elem.getTelefono()%></p>
                <p>---------------------------------</p>
        <% } %>
    </body>
</html>
