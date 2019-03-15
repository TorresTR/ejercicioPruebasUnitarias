/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopruebasunitarias;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import sun.rmi.transport.TransportConstants;

/**
 *
 * @author David
 */
public class Logica {

    private Map<Integer,Persona> genialogia = new HashMap();
    public Logica() {
      
    }

    public String Imprimir(Integer cv, Map genialogia1){
        String lista="";
        genialogia.putAll(genialogia1);
        for (Integer abuelollave : genialogia.keySet()) {
            if(abuelollave == cv){
                lista=lista.concat(genialogia.get(abuelollave).getNombre());
                System.out.println("Soy: "+genialogia.get(abuelollave).getIdentificacion()+" "+genialogia.get(abuelollave).getNombre()+" "+genialogia.get(abuelollave).getApellido());
                for (Integer padrellave : genialogia.get(abuelollave).getMapaHijo().keySet()) {
                    lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre());
                    System.out.println("\n"+"Mis hijos son: "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre()+" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getApellido()
                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getIdentificacion());
                for (Integer hijollave : genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().keySet()) {
                    lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre());
                    System.out.println("\n"+"Mis nietos son: "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre()
                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getApellido()
                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getIdentificacion());
                } 
            }
                break;
            }else{ 
                for (Integer padrellave : genialogia.get(abuelollave).getMapaHijo().keySet()) {
                    if(genialogia.get(abuelollave).getMapaHijo().containsKey(cv)){
                            if(padrellave == cv){
                            lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre());
                            
                            System.out.println("\n"+"Soy: "
                            +genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre()+" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getApellido()
                            +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getIdentificacion());
                            System.out.println("Mi padre es: "+genialogia.get(abuelollave).getNombre()+" "+genialogia.get(abuelollave).getApellido()+" "+genialogia.get(abuelollave).getIdentificacion());
                            lista=lista.concat(genialogia.get(abuelollave).getNombre());
                            for (Integer hijollave : genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().keySet()) {
                            lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre());
                            System.out.println("\n"+"Mis Hijos son: "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre()
                            +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getApellido()
                            +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getIdentificacion());
                            } 
                        }
                    }else {
                            for (Integer hijollave : genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().keySet()){
                                if(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().containsKey(cv)){
                                    
                                    if(hijollave == cv){
                                    lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre());
                                    lista=lista.concat(genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre());
                                    lista=lista.concat(genialogia.get(abuelollave).getNombre());
                                    
                                    System.out.println("\n"+"Soy: "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getNombre()
                                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getApellido()
                                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getMapaHijo().get(hijollave).getIdentificacion());
                                    System.err.println("\n"+"Mi padre es: "
                                    +genialogia.get(abuelollave).getMapaHijo().get(padrellave).getNombre()+" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getApellido()
                                    +" "+genialogia.get(abuelollave).getMapaHijo().get(padrellave).getIdentificacion());
                                    System.out.println("Mi Abuelo es: "+genialogia.get(abuelollave).getNombre()+" "+genialogia.get(abuelollave).getApellido()+" "+genialogia.get(abuelollave).getIdentificacion());
                                    }
                                }
                                
                                
                            }
                                
                        }
                    
                }
               
            }
            
        }
        return lista;
    }
    
    
}
