package com.notanull.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int indDuenio;
    private String nombre;
    private String cellDuenio;

    public Duenio() {
    }

    public Duenio(int indDuenio, String nombre, String cellDuenio) {
        this.indDuenio = indDuenio;
        this.nombre = nombre;
        this.cellDuenio = cellDuenio;
    }

    public int getIndDuenio() {
        return indDuenio;
    }

    public void setIndDuenio(int indDuenio) {
        this.indDuenio = indDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCellDuenio() {
        return cellDuenio;
    }

    public void setCellDuenio(String cellDuenio) {
        this.cellDuenio = cellDuenio;
    }

    @Override
    public String toString() {
        return "Duenio{" + "indDuenio=" + indDuenio + ", nombre=" + nombre + ", cellDuenio=" + cellDuenio + '}';
    }
    
    
}
