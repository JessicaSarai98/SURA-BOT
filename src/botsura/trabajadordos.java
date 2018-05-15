/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//clase de prueba cera borrada en futuras actualizaciones
package botsura;

/**
 *
 * @author japb1
 */
public class trabajadordos {
    String archivo;
    String nuevoContenido;
    leerArchivo act;
    actualizarArchivo def;
    
    public trabajadordos(String archivo){
        this.archivo=archivo;
        act= new leerArchivo(archivo);
        def= new actualizarArchivo(archivo);
    }
    
    
    public void imprimir(){
        act.imprimirlista();
    }
    
    public void actualizar(String texto){
        //leerArchivo act= new leerArchivo(archivo);
       
        def.actualizar2(act.getContentFile());
  
       
        
    }
   
}
