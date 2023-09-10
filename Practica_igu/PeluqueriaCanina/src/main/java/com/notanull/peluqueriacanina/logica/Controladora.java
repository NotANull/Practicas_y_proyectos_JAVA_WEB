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

    public void borrarMascota(int numCliente) {
        this.controladoraPersistencia.borrarMascota(numCliente);
    }

    public Mascota traerMascota(int numCliente) {
        return this.controladoraPersistencia.traerMascota(numCliente);
    }

    public void modificarMascota(Duenio unDuenio, Mascota unaMascota, Mascota unaMascotaOriginal) {
        
        unaMascotaOriginal.setNombre(unaMascota.getNombre());
        unaMascotaOriginal.setRaza(unaMascota.getRaza());
        unaMascotaOriginal.setColor(unaMascota.getColor());
        unaMascotaOriginal.setObservaciones(unaMascota.getObservaciones());
        unaMascotaOriginal.setAtencionEspecial(unaMascota.getAtencionEspecial());
        unaMascotaOriginal.setAlergico(unaMascota.getAlergico());
        
        this.controladoraPersistencia.modificarMascota(unaMascotaOriginal);
        
        Duenio duenio = this.buscarDuenio(unaMascotaOriginal.getMiDuenio().getIndDuenio());
        duenio.setCellDuenio(unDuenio.getCellDuenio());
        duenio.setNombre(unDuenio.getNombre());
        
        this.modificarDuenio(duenio);
        
    }

    private Duenio buscarDuenio(int indDuenio) {
        return this.controladoraPersistencia.buscarDuenio(indDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
        this.controladoraPersistencia.modificarDuenio(duenio);
    }

}
