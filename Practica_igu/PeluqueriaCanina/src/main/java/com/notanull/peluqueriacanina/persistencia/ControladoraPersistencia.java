package com.notanull.peluqueriacanina.persistencia;

import com.notanull.peluqueriacanina.logica.Duenio;
import com.notanull.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {

    private DuenioJpaController duenioController = new DuenioJpaController();
    private MascotaJpaController mascotaController = new MascotaJpaController();

    public void guardar(Duenio unDuenio, Mascota unaMascota) {
        
        //Creamos un dueño en la db
        this.duenioController.create(unDuenio);
        
        //Creamos una mascota en la db
        this.mascotaController.create(unaMascota);
    }
    
    
}
