/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.estructuras.ficheros.leerProducto;


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

//Probando cola de prioridad -- trabajando al 100%

//        ColaPrioridad cola = new ColaPrioridad();
//        cola.mostrarCola();
//        System.out.println(cola.estaVacia());
//        cola.sacarCola();
//        System.out.println(cola.existe("Mario"));
//        cola.agregar("Mario", false);
//        cola.agregar("Jorge", false);
//        cola.agregar("Roberto", true);
//        cola.agregar("chan", true);
//        cola.eliminar("chan");
//        cola.eliminar("Roberto");
//        cola.agregar("Joel", true);
//        cola.mostrarCola();
//        System.out.println(cola.inicio());

//-----------------------------------------------------------------------------

//Probando lista simple circular -- funciona al 100%

//        ListaCircularSimple circular = new ListaCircularSimple();
//        circular.mostrar();
//        circular.eliminar("Manuel");
//        circular.buscar("Manuel");
//        System.out.println(circular.existe("Manuel"));
//        System.out.println(circular.estaVacia());
//        System.out.println(circular.getTamaño());
//        
//        circular.agregar("Manuel");
//        circular.agregar("Maria");
//        circular.agregar("Carlos");
//        circular.agregar("Roberto");
//        circular.agregar("Joel");
//        circular.eliminar("Carlos");
//        circular.eliminar("Manuel");
//        circular.eliminar("Joel");
//        System.out.println(circular.buscar("Manuel").getInfo().toString());
//        System.out.println(circular.existe("Manuel"));
//        System.out.println(circular.estaVacia());
//        System.out.println(circular.getTamaño()); 
//       System.out.println(circular.getPrimero().getInfo().toString()); 
//       System.out.println(circular.getUltimo().getInfo().toString()); 
        
//----------------------------------------------------------------------------
// Probando la lista simple -- funciona al 100%

//        ListaSimple lista = new ListaSimple();
//        System.out.println(lista.buscar("Jorge").getInfo().toString());
//        System.out.println(lista.existe("Jorge"));
//        lista.agregar("Jorge");
//        lista.agregar("Joel");
//        lista.agregar("Maria");
//        System.out.println(lista.buscar("Jorge").getInfo().toString());
//        System.out.println(lista.existe("Jorge"));    
//        System.out.println(lista.getTamaño());
//        lista.mostrar();

//lectura de ficheros
        leerProducto leer = new leerProducto("C:\\Users\\Jo\\Desktop\\archivo.txt");
        leer.leer();
        leer.asignar();
    }
    
}
