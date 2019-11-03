
package clases.estructuras.ficheros;

import clases.Producto;
import clases.estructuras.Dato;
import java.io.FileReader;
import java.io.IOException;

public class leerProducto{
    String url,nombre,descripcion,direccion,precioT,existenciaT;
    int existencia,c;
    float precio;
    char caracter;
    char matriz[];
    int contador,contador2,numero,numero2;
    boolean uno,dos,tres,cuatro,cinco;
    
    public leerProducto(String url){
        this.url=url;
        existencia=0;
        precio=0;
        caracter=' ';
        matriz=new char[10000];
        contador=0;
        contador2=0;
        precioT="";
        existenciaT="";
        nombre="";
        direccion="";
        descripcion="";
    }
    
    /**
     * Lee un archivo externo válido para cargar productos 
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
        System.out.println(matriz[65]);
        System.out.println(matriz[66]);
        System.out.println((int)matriz[67]);
        System.out.println((int)matriz[68]);
        System.out.println(matriz[69]);

    }

    /**
     * Crea los productos declarados en el archivo externo
     */    
    public void asignar(){
        Dato datos = new Dato();
        boolean validar =false;
        boolean noEsProducto = false;
        int l;
        
            
                try{
                    for(int i=0; i<numero;i++){
                        if(matriz[i]=='%'){
                            noEsProducto = true;
                            break;
                        }
                        switch(contador2){
                            case 0:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    nombre = nombre+matriz[i];
                                }                        
                                break;
                            case 1:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    descripcion = descripcion+matriz[i];
                                }                        
                                break;
                            case 2:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    precioT = precioT+matriz[i];
                                }                           
                                break;
                            case 3:
                                if(matriz[i]==','){
                                    contador2++;
                                }else{
                                    existenciaT = existenciaT+matriz[i];
                                }                          
                                break;
                            case 4:
                                if((int)matriz[i]==10){
                                    contador2=0;   
                                    validar=true;
                                }else if((int)matriz[i]==13){
                                     
                                }else{
                                    direccion = direccion+matriz[i]; 
                                }                           
                                break;
                        }
                        if(validar){
                            existencia = Integer.valueOf(existenciaT);
                            precio = Float.parseFloat(precioT);                             
                            imprimir();
                            Producto nuevo = new Producto(nombre,descripcion,direccion,precio,existencia);
                            datos.getProductos().agregar(nuevo); 
                            nombre="";
                            direccion="";
                            descripcion="";
                            precioT="";
                            existenciaT="";
                            validar=false;
                        }
                    }             
                }catch(Exception e){ 
//                    JOptionPane.showMessageDialog(null, "Formato de archivo desconocido","Error",JOptionPane.ERROR_MESSAGE);
                    Integer.parseInt("hola");
                }  
                
                if(noEsProducto) l = Integer.parseInt("hola");
                datos.getProductos().mostrar();


    }
 
    
    /**
     * Imprime los datos del producto
    */
    public void imprimir(){
        try{
            System.out.print("\n");
            System.out.print(nombre);
            System.out.print("\n");
            System.out.print(descripcion);
            System.out.print("\n");
            System.out.print(precio);
            System.out.print("\n");
            System.out.print(existencia);
            System.out.print("\n");
            System.out.print(direccion);            
        }catch(Exception e){
            
        }

    }
}
