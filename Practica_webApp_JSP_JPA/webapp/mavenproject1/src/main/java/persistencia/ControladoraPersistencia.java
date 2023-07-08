package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //Método CREATE
    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
    
    //Método READ
    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }

    public void borrarUsuario(int idEliminar) {
        try {
            usuJpa.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idEdit) {
        return usuJpa.findUsuario(idEdit);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
