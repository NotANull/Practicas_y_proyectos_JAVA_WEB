package com.notanull.peluqueriacanina.persistencia;

import com.notanull.peluqueriacanina.logica.Duenio;
import com.notanull.peluqueriacanina.logica.Mascota;
import java.util.List;

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
    
    
}
