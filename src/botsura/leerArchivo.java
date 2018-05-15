/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author japb1
 */
public class leerArchivo {
    Scanner file;
    public ArrayList<String> lista;
    
    public leerArchivo(String archivo){

    this.lista =new ArrayList<>();  
    try {
            file = new Scanner(new File(archivo));
        } catch (FileNotFoundException ex) {
           // Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
    while (file.hasNextLine()){
         lista.add(file.nextLine());
        }
       //file.close();
    }
    
    
    
    
    public ArrayList<String> getlista() {
        return lista;
    }
    public void borrarTrabajador(int i){
        lista.remove(i);
    }
    
    public void setactualizarLista(int i,String Actualizar){
      this.lista.set(i, Actualizar);
    }
    
    
      public int getlistaCounter() {
        return lista.size();
    }
    

    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirlista(){
        for(int i=0;i<this.lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirlistados(){
       for(int i=0;i<this.lista.size();i=1+3){
        System.out.println(lista.get(i));
        }
    }
    
    public String getContentFile(){
     String content = "";
     int i;
     for(i=0;i<lista.size();i++){
         content+=lista.get(i)+"\n"; 
     }
     file.close();
     
    //System.out.println(content);
    return content;
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirOpciones(){
        for(int i=0;i<this.lista.size();i=1+3){
        System.out.println(lista.get(i+1));
        System.out.println(lista.get(i+2));
        }
    }
    
    //actualizar el archivo
     public void ActualizarArchivo(int linea, String Actualizacion){
       FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("base1.txt");
            pw = new PrintWriter(fichero);
                lista.set(linea, Actualizacion);
            for (int i = 0; i < lista.size(); i++)
               // if(i!=linea){
              pw.println(lista.get(i));
                //}else{
                  //  pw.println(Actualizacion +"\n");
                //} 
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (IOException e2) {
              e2.printStackTrace();
           }
    }
    }
    
    
    
    //cierro el archivo
    public void closeFile(){
        file.close();
    }    
    
    
}
