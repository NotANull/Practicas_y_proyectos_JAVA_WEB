package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Alumno;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    public void crearAlumno(Alumno alu) {
        aluJpa.create(alu);
    }

    public void eliminarAlumno(int id) throws NonexistentEntityException {
        aluJpa.destroy(id);
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        //No al cast, si a lo que está debajo
        List<Alumno> unaLista = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>(unaLista);
        return listaAlumnos;
    }
    
}
