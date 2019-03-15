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
public class Persona {
    
    private int identificacion;
    
    private String nombre;
    
    private String Apellido;
  
    private Map<Integer,Persona> mapaHijo  = new HashMap();

    public Persona(int identificacion, String nombre, String Apellido) {
      
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

  
    

   
    public Map<Integer, Persona> getMapaHijo() {
        return mapaHijo;
    }

    public void setMapaHijo(Map<Integer, Persona> mapaHijo) {
        this.mapaHijo = mapaHijo;
    }
    
    
    
}
