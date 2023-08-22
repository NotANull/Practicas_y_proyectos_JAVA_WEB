package com.notanull.peluqueriacanina.logica;

import com.notanull.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    private ControladoraPersistencia controladoraPersistencia = new ControladoraPersistencia();

    public void guardar(Duenio unDuenio, Mascota unaMascota) {
        this.controladoraPersistencia.guardar(unDuenio, unaMascota);
    }

    public List<Mascota> traerMascotas() {
        return this.controladoraPersistencia.traerMascotas();
    }

}
