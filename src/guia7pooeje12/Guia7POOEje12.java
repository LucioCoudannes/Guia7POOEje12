/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7pooeje12;

import Entidades.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author A288808
 */
public class Guia7POOEje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1=new Persona();
        Persona p2 = new Persona();
    
        
        
        ps.crearPersona(p1);
        
        
        ps.calcularEdad(p1);
        
        ps.menorQue(p1);
        
        ps.mostrarPersona(p2);
       
        
        System.out.println(p1.toString());
        
        
        
        
    }
    
}
