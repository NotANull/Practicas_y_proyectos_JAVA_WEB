package com.notanull.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int numCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico; //Probar cambiándole el tipo de dato a boolean
    private String atencionEspecial; //Probar cambiándole el tipo de dato a boolean
    private String observaciones;
    
    //Una mascota podría tener mas de un dueño pero por consigna vamos a hacer la relación 1-1
    @OneToOne
    private Duenio miDuenio;

    public Mascota() {
    }

    public Mascota(int numCliente, String nombre, String raza, String color, String alergico, String atencionEspecial, String observaciones, Duenio miDuenio) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEspecial = atencionEspecial;
        this.observaciones = observaciones;
        this.miDuenio = miDuenio;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEspecial() {
        return atencionEspecial;
    }

    public void setAtencionEspecial(String atencionEspecial) {
        this.atencionEspecial = atencionEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getMiDuenio() {
        return miDuenio;
    }

    public void setMiDuenio(Duenio miDuenio) {
        this.miDuenio = miDuenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "numCliente=" + numCliente + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEspecial=" + atencionEspecial + ", observaciones=" + observaciones + ", miDuenio=" + miDuenio + '}';
    }
    
    
}
