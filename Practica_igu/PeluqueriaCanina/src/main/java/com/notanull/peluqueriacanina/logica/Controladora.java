package com.notanull.peluqueriacanina.logica;

import com.notanull.peluqueriacanina.persistencia.ControladoraPersistencia;

public class Controladora {
    
    private ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(Duenio unDuenio, Mascota unaMascota) {
        this.controladoraPersistencia.guardar(unDuenio, unaMascota);
    }

}
