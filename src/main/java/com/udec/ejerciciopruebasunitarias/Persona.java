/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.ejerciciopruebasunitarias;

import java.util.HashMap;
import java.util.Map;

/**
 * Esta clase contiene los atributos de la persona y el mapa para contenerse a si misma
 * @author David
 */
public class Persona {
    
    /**
     * Este es el id de la persona que vamos a agregar
     */
    private int identificacion;
    
    /**
     * Esta variable guarda el nombre de la persona
     */
    private String nombre;
    
    /**
     * Esta variable guarda el apellido 
     */
    private String Apellido;
  
    /**
     * Este es el para el cual contendra a los hijos y padres
     */
    private Map<Integer,Persona> mapaHijo  = new HashMap();

    /**
     * Contructir que inicializa las varibales y el mapa
     * @param identificacion
     * @param nombre
     * @param Apellido 
     */
    public Persona(int identificacion, String nombre, String Apellido) {
      
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.Apellido = Apellido;
    }

    /**
     * Retona la identifiacion de la persona
     * @return identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Permite asignar un valor para identificacion
     * @param identificacion 
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Retorna  El nombre para la persona
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar el nombre de para la persona
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el apellido de la persona 
     * @return Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * Retorna el valor del apellido para la persona
     * @param Apellido 
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * Retorna El mapa
     * @return 
     */
   public Map<Integer, Persona> getMapaHijo() {
        return mapaHijo;
    }

   /**
    * Permite asignar valores al mapa
    * @param mapaHijo 
    */
    public void setMapaHijo(Map<Integer, Persona> mapaHijo) {
        this.mapaHijo = mapaHijo;
    }
    
    
    
}
