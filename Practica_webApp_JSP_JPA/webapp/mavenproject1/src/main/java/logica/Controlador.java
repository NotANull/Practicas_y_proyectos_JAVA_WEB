package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controlador {

    ControladoraPersistencia controlPersi = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usu) {
        controlPersi.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios() {
        return controlPersi.traerUsuarios();
    }

    public void borrarUsuario(int idEliminar) {
        controlPersi.borrarUsuario(idEliminar);
    }

    public Usuario traerUsuario(int idEdit) {
        return controlPersi.traerUsuario(idEdit);
    }

    public void editarUsuario(Usuario usu) {
        controlPersi.editarUsuario(usu);
    }
}
