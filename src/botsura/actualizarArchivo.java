/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;
//https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;




/**
 *
 * @author japb1
 */
public class actualizarArchivo {
    //se requiere una clase especial para actualizar los datos
  FileWriter fichero;
  PrintWriter pw;  
    String archivo;
    
    public actualizarArchivo(String archivo){
        this.archivo=archivo;
        fichero=null;
        pw=null;
        
        try
        {
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
          

        }
        
    }
    
    
    
    public void actualizar(int num, String Actualizar){
        leerArchivo act= new leerArchivo(archivo);
        act.lista.set(num, Actualizar);
        for (int i = 0; i <act.getlistaCounter(); i++)
            pw.println(act.lista.get(i));

        
        }
        
    
    public void actualizar2(String Actualizar){
        pw.println(Actualizar);
    }
    
    public void Actualizar3(int num, String actualizar){
       leerArchivo act= new leerArchivo(archivo);
        for(int i = 0; i <act.getlistaCounter(); i++)
        if(num==i){
            pw.println(actualizar);
        }else{
            pw.println(act.lista.get(i));
        }    
    }
    
    
    public void terminarActualizacion(){
         try {
          //cerramos el archivo
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
        
    }
    
    }

