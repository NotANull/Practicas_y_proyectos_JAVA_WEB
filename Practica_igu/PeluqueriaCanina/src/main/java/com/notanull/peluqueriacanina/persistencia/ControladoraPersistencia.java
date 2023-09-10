package com.notanull.peluqueriacanina.persistencia;

import com.notanull.peluqueriacanina.logica.Duenio;
import com.notanull.peluqueriacanina.logica.Mascota;
import com.notanull.peluqueriacanina.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    private DuenioJpaController duenioControllerJpa = new DuenioJpaController();
    private MascotaJpaController mascotaControllerJpa = new MascotaJpaController();

    public void guardar(Duenio unDuenio, Mascota unaMascota) {
        
        //Creamos un dueño en la db
        this.duenioControllerJpa.create(unDuenio);
        
        //Creamos una mascota en la db
        this.mascotaControllerJpa.create(unaMascota);
    }

    public List<Mascota> traerMascotas() {
        return this.mascotaControllerJpa.findMascotaEntities();
    }

    public void borrarMascota(int numCliente) {
        try {
            this.mascotaControllerJpa.destroy(numCliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascota traerMascota(int numCliente) {
        return this.mascotaControllerJpa.findMascota(numCliente);
    }

    public void modificarMascota(Mascota unaMascotaOriginal) {
        try {
            this.mascotaControllerJpa.edit(unaMascotaOriginal);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio buscarDuenio(int indDuenio) {
        return this.duenioControllerJpa.findDuenio(indDuenio);
    }

    public void modificarDuenio(Duenio duenio) {
        try {
            this.duenioControllerJpa.edit(duenio);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
