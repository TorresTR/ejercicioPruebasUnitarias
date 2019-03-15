/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopruebasunitarias;

import com.udec.ejerciciopruebasunitarias.Persona;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class ClasePrincipalCorrecion {
    
    private Map<Integer,Persona> genialogia = new HashMap();
    Scanner scanner = new Scanner(System.in);
    
    public ClasePrincipalCorrecion() {
        
        genialogia = new HashMap<>();
        
        //abuelos
        Persona abueloJuan = new Persona(1, "Juan", "Torres");
        genialogia.put(1, abueloJuan);
        Persona abueloJose = new Persona(2, "Jose", "Rojas");
        genialogia.put(2, abueloJose);
        
        //padres
        Persona padreAndres = new Persona(3, "Andres", "Torres");
        Persona padreMaria = new Persona(4, "Maria", "Torres");
        Persona padreCarlos = new Persona(5, "Carlos", "Torres");
        
        abueloJuan.getMapaHijo().put(3, padreAndres);
        abueloJuan.getMapaHijo().put(4, padreMaria);
        abueloJuan.getMapaHijo().put(5, padreCarlos);
        
        Persona padreAlberto = new Persona(6, "Alberto", "Rojas");
        Persona padreJimmy = new Persona(7, "Jimmy", "Rojas");
        Persona padreJhon = new Persona(8, "Jhon", "Rojas");
        
        abueloJose.getMapaHijo().put(6, padreAlberto);
        abueloJose.getMapaHijo().put(7, padreJimmy);
        abueloJose.getMapaHijo().put(8, padreJhon);
        
        
        //Hijos
        
        Persona hijoDiana=  new Persona(9, "Diana", "Torres");
        Persona hijoPaola=  new Persona(10, "Paola", "Torres");
        padreAndres.getMapaHijo().put(9, hijoDiana);
        padreAndres.getMapaHijo().put(10, hijoPaola);
        Persona hijoSofia=  new Persona(11, "Sofia", "Torres");
        padreMaria.getMapaHijo().put(11, hijoSofia);
        Persona hijoJaime=  new Persona(12, "Jaime", "Torres");
        padreCarlos.getMapaHijo().put(12, hijoJaime);
        
        Persona hijoTatiana=  new Persona(13, "Tatiana", "Rojas");
        Persona hijoFernanda=  new Persona(14, "Fernanda", "Rojas");
        padreAlberto.getMapaHijo().put(13, hijoTatiana);
        padreAlberto.getMapaHijo().put(14, hijoFernanda);
        Persona hijoViviana=  new Persona(15, "Viviana", "Rojas");
        padreJimmy.getMapaHijo().put(15, hijoViviana);
        Persona hijaDiana=  new Persona(16, "Diana", "Rojas");
        padreJhon.getMapaHijo().put(16, hijaDiana);
        
        Imprimir();
    }
    
    
    public void Imprimir(){
        System.out.print("Ingrese La identificacion a buscar: ");
        int cv = scanner.nextInt();
         for (Integer keyAbuelo : genialogia.keySet()) {
            Persona pAbuelo = genialogia.get(keyAbuelo);
            for (Integer keyPadre : pAbuelo.getMapaHijo().keySet()) {
                Persona pPadre = pAbuelo.getMapaHijo().get(keyPadre);
                for (Integer keyHijo : pPadre.getMapaHijo().keySet()) {
                    Persona pHijo = pPadre.getMapaHijo().get(keyHijo);
                    if(genialogia.containsKey(cv)){
                        if(keyAbuelo == cv){
                            System.out.println("Soy: "+pAbuelo.getNombre()+" "+pAbuelo.getApellido());
                            System.out.println("Mi hijo es: "+pPadre.getNombre()+" "+pPadre.getApellido());
                            System.out.println("Mi nieto es: "+pHijo.getNombre()+" "+pHijo.getApellido());
                       }//if
                    }else if(genialogia.get(keyAbuelo).getMapaHijo().containsKey(cv)){
                        if(keyPadre == cv){
                            System.out.println("soy: "+pPadre.getNombre()+" "+pPadre.getApellido());
                            System.out.println("Mi hijo es: "+pHijo.getNombre()+" "+pHijo.getApellido());
                            System.out.println("Mi padre es: "+pAbuelo.getNombre()+" "+pAbuelo.getApellido());
                        }//if
                    }else if(genialogia.get(keyAbuelo).getMapaHijo().get(keyPadre).getMapaHijo().containsKey(cv)){
                        if(keyHijo == cv){
                            System.out.println("soy: "+pHijo.getNombre()+" "+pHijo.getApellido());
                            System.out.println("Mi padre es: "+pPadre.getNombre()+" "+pPadre.getApellido());
                            System.out.println("Mi abuelo es: "+pAbuelo.getNombre()+" "+pAbuelo.getApellido());
                        }//if
                        
                    }// if
                }//for
            }//for
        }//for
     Imprimir();
    }
    
}
