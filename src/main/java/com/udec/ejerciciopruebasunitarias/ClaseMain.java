/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopruebasunitarias;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author David
 */
public class ClaseMain {
    
    public static void main (String [ ] args) {          
         //ClasePrincipalCorrecion cr = new ClasePrincipalCorrecion();
      Map<Integer,Persona> genialogia = new HashMap();
         Logica lof = new Logica(genialogia,0);
    } //Cierre del main
    
    
}
