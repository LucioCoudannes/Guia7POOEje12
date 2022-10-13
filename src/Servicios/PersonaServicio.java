/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Persona;


import java.util.Date;

import java.util.Scanner;

/**
 *
 * @author A288808
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    Date fechaActual = new Date();
    
    int dia;
    int mes;
    int anio;
    int edad1;
    int edad2;
     Persona p2 = new Persona();
    
//    Date fecha = new Date(anio-1900,mes-1,dia);
    
    
    public void crearPersona(Persona d){
       
     
        
        System.out.println("Ingrese el nombre de la persona");
        d.setNombre(leer.next());
        System.out.println("ingrese el dia de nacimiento");
        dia=leer.nextInt();
        System.out.println("ingrese el mes de nacimiento");
        mes=leer.nextInt();
        System.out.println("ingrese el año de nacimiento");
        anio=leer.nextInt();
        
        
        Date fecha = new Date(anio-1900,mes-1,dia);
        
        d.setFdn(fecha);
        
        
        
        
    }
    
    public void  calcularEdad(Persona f){
        
        System.out.println("La persona tiene " + (fechaActual.getYear() - f.getFdn().getYear())  +" años");
        f.setEdad((fechaActual.getYear() - f.getFdn().getYear()));
        
    }
    
    public Boolean  menorQue(Persona m){
        
        Boolean respuesta = false;
        
       
        
        this.crearPersona(p2);
        this.calcularEdad(p2);
        
        
        
        if(p2.getEdad()<m.getEdad()){
            
            System.out.println("La segunda persona es menor que la primera");
            respuesta = true;
            
        }else{
            
            System.out.println("La primera persona es menor que la segunda");
            
        }
        
        
        return respuesta;
       
        
    }
    
    public void mostrarPersona(Persona ortega){
        
        System.out.println(p2.getNombre() + p2.getFdn() + p2.getEdad());
        
    }
    
    
    
    
    
    
    
}
