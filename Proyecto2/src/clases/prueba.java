/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.estructuras.ColaPrioridad;
import clases.estructuras.ListaCircularSimple;
import clases.estructuras.Nodo;
import clases.estructuras.Pila;

/**
 *
 * @author Jo
 */
public class prueba {
    public static void main(String [] args){
// Probando las pilas -- trabajando al 100%

//    Pila pila = new Pila();
//    System.out.println(pila.estaVacia());
//    pila.buscar("Jorge");
//    pila.mostrarPila();
//    System.out.println(pila.existe("Jorge"));
//    
//    pila.agregar("Jorge");
//    pila.agregar("Mario");
//    pila.agregar("Carla");
//    pila.buscar("Jorge").setInfo("Mariano");
//    pila.eliminar("Carla");
//    pila.mostrarPila();
//    System.out.println(pila.existe("Jorge"));
//    System.out.println(pila.obtenerCima());
//    System.out.println(pila.existe("Carla"));
//-----------------------------------------------------------------------------

//Probando cola de prioridad

        ColaPrioridad cola = new ColaPrioridad();
        cola.mostrarCola();
        System.out.println(cola.estaVacia());
        cola.sacarCola();
        System.out.println(cola.existe("Mario"));
        cola.agregar("Mario", false);
        cola.agregar("Jorge", false);
        cola.agregar("Roberto", true);
        cola.agregar("chan", true);
        cola.mostrarCola();

        
        
    }
    
}
