/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author japb1
 */
public class tema {
   String archivo;
   leerArchivo temas;
    
   public tema(){
        this.archivo="tema.txt";
        temas= new leerArchivo(this.archivo);     
    }     
    
    
    
    
   /*     
public void imprimirTema(){
       for(int i=0;i<this.temas.size();i=i+2){
        System.out.println(temas.get(i));
        }
    }
    
    //este medodo solo es para comprobar que lo vacie en un arreglo
    public void imprimirContenido(){
        for(int i=0;i<this.temas.size();i=i+2){
        System.out.println(temas.get(i));
        }
    }    
    
    */
    
    
}
