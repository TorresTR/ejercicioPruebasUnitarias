/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.udec.ejerciciopruebasunitarias.Logica;
import com.udec.ejerciciopruebasunitarias.Persona;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class pruebasUnitarias {
    
    static Map<Integer,Persona> genialogia = new HashMap<>();
    public pruebasUnitarias() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        insertar();
    }
    
    public  static void insertar(){
        Persona abueloJuan = new Persona(1, "Juan", "Torres");
        genialogia.put(1, abueloJuan);
        Persona abueloJose = new Persona(2, "Jose", "Rojas");
        genialogia.put(2, abueloJose);
        //padres--------------------------------------------------
        Persona padreAndres = new Persona(3, "Andres", "Torres");
        Persona padreMaria = new Persona(4, "Maria", "Torres");
        Persona padreCarlos = new Persona(5, "Carlos", "Torres");
        abueloJuan.getMapaHijo().put(3, padreAndres);
        abueloJuan.getMapaHijo().put(4, padreMaria);
        abueloJuan.getMapaHijo().put(5, padreCarlos);
        //----------------------------------------------------------
        Persona padreAlberto = new Persona(6, "Alberto", "Rojas");
        Persona padreJimmy = new Persona(7, "Jimmy", "Rojas");
        Persona padreJhon = new Persona(8, "Jhon", "Rojas");
        abueloJose.getMapaHijo().put(6, padreAlberto);
        abueloJose.getMapaHijo().put(7, padreJimmy);
        abueloJose.getMapaHijo().put(8, padreJhon);
        //Hijos---------------------------------------------------
        Persona hijoDiana=  new Persona(9, "Diana", "Torres");
        Persona hijoPaola=  new Persona(10, "Paola", "Torres");
        padreAndres.getMapaHijo().put(9, hijoDiana);
        padreAndres.getMapaHijo().put(10, hijoPaola);
        Persona hijoSofia=  new Persona(11, "Sofia", "Torres");
        padreMaria.getMapaHijo().put(11, hijoSofia);
        Persona hijoJaime=  new Persona(12, "Jaime", "Torres");
        padreCarlos.getMapaHijo().put(12, hijoJaime);
        //---------------------------------------------------------
        Persona hijoTatiana=  new Persona(13, "Tatiana", "Rojas");
        Persona hijoFernanda=  new Persona(14, "Fernanda", "Rojas");
        padreAlberto.getMapaHijo().put(13, hijoTatiana);
        padreAlberto.getMapaHijo().put(14, hijoFernanda);
        Persona hijoViviana=  new Persona(15, "Viviana", "Rojas");
        padreJimmy.getMapaHijo().put(15, hijoViviana);
        Persona hijaDiana=  new Persona(16, "Diana", "Rojas");
        padreJhon.getMapaHijo().put(16, hijaDiana);
    }
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    /*@Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }*/

    @Test
    public void impresionAbuelo(){
        Logica log = new Logica();
        String list = log.Imprimir(2, genialogia);
        assertEquals("JoseAlbertoTatianaFernandaJimmyVivianaJhonDiana", list);
    }
    
    @Test
    public void impresionPadre(){
        Logica log = new Logica();
        String list = log.Imprimir(3, genialogia);
        assertEquals("AndresJuanDianaPaola", list);
    }
    
    
    @Test
    public void impresionHijo(){
        Logica log = new Logica();
        String list = log.Imprimir(14, genialogia);
        assertEquals("FernandaAlbertoJose", list);
    }
    
    @Test
    public void campoVacio(){
        Logica log = new Logica();
        String list = log.Imprimir(50, genialogia);
        assertEquals("", list);
    }
}
