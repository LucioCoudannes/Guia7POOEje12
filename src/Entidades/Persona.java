/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author A288808
 */
public class Persona {
    
   private String nombre;
   private Date fdn;
   private int edad;

    public Persona() {
    }

    public Persona(String nombre, Date fdn, int edad ) {
        this.nombre = nombre;
        this.fdn = fdn;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFdn() {
        return fdn;
    }

    public void setFdn(Date fdn) {
        this.fdn = fdn;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fdn=" + fdn + '}';
    }
   
   
    
    
    
    
    
}
