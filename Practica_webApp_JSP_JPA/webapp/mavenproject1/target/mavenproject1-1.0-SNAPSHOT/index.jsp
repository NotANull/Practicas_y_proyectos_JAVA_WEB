<%-- 
    Document   : index
    Created on : 4 jul. 2023, 20:14:25
    Author     : salum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvUsuarios" method="POST">
            <label>Dni: </label>
            <input type="text" name="dni"/>
            <br/>
            <label>Nombre: </label>
            <input type="text" name="nombre"/>
            <br/>
            <label>Apellido: </label>
            <input type="text" name="apellido"/>
            <br/>
            <label>Teléfono: </label>
            <input type="text" name="telefono"/>
            <br/>
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Haga click en el botón para ver a los usuarios registrados</h1>
        <form action="SvUsuarios" method="GET">
            <button type="submit">Ver Usuarios</button>
        </form>
        
        <h1>Eliminar usuario</h1>
        <p>Ingrese la id del usuario que quiere eliminar</p>
        <form action="SvEliminar" method="POST">
            <label>Id: </label>
            <input type="text" name="id_usuario"/>
            <button type="submit">EliminarUsuario</button>
        </form>
        
        <h1>Editar usuario</h1>
        <p>Ingrese la id del usuario que quiere editar</p>
        <form action="SvEditar" method="GET">
            <label>Id: </label>
            <input type="text" name="id_usuario_edit"/>
            <button type="submit">Editar Usuario</button>
        </form>
        
    </body>
</html>
