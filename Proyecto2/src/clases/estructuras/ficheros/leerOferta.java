
package clases.estructuras.ficheros;

import clases.Oferta;
import clases.Producto;
import clases.estructuras.Dato;
import clases.estructuras.ListaCircularSimple;
import clases.estructuras.Nodo;
import clases.estructuras.Pila;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class leerOferta {

    String url,nombreProducto,descripcion,descuentoT,prioridadT;
    int c,contar,contarPila;
    float descuento;
    char caracter;
    char matriz[];
    boolean prioridad;
    ListaCircularSimple productos;
    int contador,contador2,numero,numero2;
    Pila pila = new Pila();
    
    public leerOferta(String url){
        this.url=url;
        caracter=' ';
        matriz=new char[10000];
        contador=0;
        contador2=0;
        nombreProducto="";
        descripcion="";
        descuento=0;
        descuentoT="";
        prioridadT="";
        productos = new ListaCircularSimple();
        prioridad=false;
    }
    
    /**
     * Lee un archivo externo
     */    
    public void leer(){
        try {
            FileReader entrada = new FileReader(url);
            c = entrada.read();
            while(c!=-1){
//                System.out.print((char)c);
                matriz[contador]=(char)c;
                contador++;
                c=entrada.read();
                numero++;
            }
            entrada.close();
        } catch (IOException ex) {
            System.out.println("No se ha encontrado el archivo");
        }
//        System.out.println(matriz[65]);
//        System.out.println(matriz[66]);
//        System.out.println((int)matriz[67]);
//        System.out.println((int)matriz[68]);
//        System.out.println(matriz[69]);

    }
    
    
    /**
     * Codifica el archivo de entrada que contiene las ofertas en texto
     */    
    public void asignar(){
        Dato datos = new Dato();
        boolean validar =false;
        int error = 0;
                try{
                    for(int i=0; i<=numero;i++){
                        switch(contador2){
                            case 0:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    descripcion = descripcion+matriz[i];
                                }                        
                                break;
                            case 1:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    descuentoT = descuentoT+matriz[i];
                                }                        
                                break;
                            case 2:
                                if(matriz[i]==','||matriz[i]==';'){
                                    if(matriz[i]==','){
                                        contador2++;
                                        pila.agregar(nombreProducto);
//                                        nombreProducto="";
                                        pila.mostrarPila();  //MOSTRANDO PILA BORRAR
                                    }else if(matriz[i]==';'){
                                        pila.agregar(nombreProducto);
                                        nombreProducto="";
                                        pila.mostrarPila();  //Mostrando pila BORRAR
                                    }                                   
                                }else{
                                    nombreProducto = nombreProducto+matriz[i];
                                }                           
                                break;
                            case 3:
                                if(matriz[i]=='%' ||i==numero){
                                    contador2=0;   
                                    validar=true;                                   
                                }else{
                                    prioridadT = prioridadT+matriz[i];
                                }                          
                                break;
                            case 4:
                                    contador2=0;   
                                    validar=true;
                                break;
                        }
                        if(validar){
                            descuento = Float.parseFloat(descuentoT);  
                            agregarProductos();
                            castPrioridad();
                            imprimir();
                            if(contar==contarPila){
                                Oferta nuevo = new Oferta(descripcion,descuento,productos,prioridad);
                                datos.getOfertas().agregar(nuevo, prioridad);                                
                            }else{
                                JOptionPane.showMessageDialog(null, "No se pudieron agregar algunas ofertas por error en el archivo de entrada", "Error en la creación de ofertas", JOptionPane.ERROR_MESSAGE);
                            }
                            descripcion="";
                            descuentoT="";
                            prioridadT="";
                            nombreProducto="";
                            productos= new ListaCircularSimple();
                            validar=false;
                        }
                    }             
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se pudieron agregar algunas ofertas por error en el archivo de entrada", "Error en la creación de ofertas", JOptionPane.ERROR_MESSAGE);
                    error = Integer.parseInt("hola");
                }  
                datos.getOfertas().mostrarCola();


    }


    /**
     * Imprime los datos contenidos dentro de una oferta
     */    
    public void imprimir(){
        try{
            System.out.print("\n");
            System.out.print(descripcion);
            System.out.print("\n");            
            System.out.print(descuento);
            System.out.print("\n");            
            productos.mostrar();
            System.out.print("\n");            
            System.out.print(prioridadT);
            System.out.print("\n");            
        }catch(Exception e){
            
        }

    } 
    
    /**
     * Determina la prioridad de la oferta
     */    
    private void castPrioridad(){
        if(prioridadT.equalsIgnoreCase("alta")){
            prioridad = true;
        }else if(prioridadT.equalsIgnoreCase("baja")){
            prioridad = false;
        }
    }


    /**
     * Agrega las productos a la oferta creada
     */    
    private void agregarProductos(){
        Dato dato = new Dato();
        int vueltas = 0;
        contar = 0;
        contarPila = pila.getTamaño();
        Nodo auxiliar = dato.getProductos().getPrimero();
        Producto producto = (Producto)auxiliar.getInfo();
        while(!pila.estaVacia()){
            if(pila.obtenerCima().toString().equalsIgnoreCase(producto.getNombre())&&vueltas<=dato.getProductos().getTamaño()){
                producto.setPrecioAnterior(producto.getPrecio());
                producto.setPrecio(producto.getPrecio()-(producto.getPrecio()*(descuento*0.01f)));
                System.out.println(producto.getPrecio());
                System.out.println(producto.getPrecioAnterior());
                productos.agregar(producto);
                contar++;
            }else{

            }
            if(vueltas==dato.getProductos().getTamaño()-1){
                pila.sacarPila();
                vueltas++;
            }
            if(vueltas<=dato.getProductos().getTamaño()){
                auxiliar=auxiliar.getSiguiente();
                producto = (Producto)auxiliar.getInfo();
                vueltas++;                
            } 
            if(vueltas==dato.getProductos().getTamaño()+1){
                vueltas=0;               
            }            
            
        } 
        productos.mostrar();
    }
}
