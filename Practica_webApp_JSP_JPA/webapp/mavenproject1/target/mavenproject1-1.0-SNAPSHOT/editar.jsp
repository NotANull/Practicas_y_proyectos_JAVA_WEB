
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <%Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");%>
        <h1>Datos del cliente</h1>
        <form action="SvEditar" method="POST">
            <label>Dni: </label>
            <input type="text" name="dni" value="<%=usu.getDni()%>"/>
            <br/>
            <label>Nombre: </label>
            <input type="text" name="nombre" value="<%=usu.getNombre()%>"/>
            <br/>
            <label>Apellido: </label>
            <input type="text" name="apellido" value="<%=usu.getApellido()%>"/>
            <br/>
            <label>Teléfono: </label>
            <input type="text" name="telefono" value="<%=usu.getTelefono()%>"/>
            <br/>
            <button type="submit">Editar</button>
        </form>
    </body>
</html>
