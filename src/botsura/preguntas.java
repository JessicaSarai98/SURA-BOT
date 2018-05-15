/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;


/**
 *
 * @author japb1
 */
public class preguntas {
//   public ArrayList<String> cuestionario;
   String archivo;
   leerArchivo preguntas;
   
    //el constructor abre el archivo, lo lee y vacea el contenido en un arreglo dinamico
    public preguntas(){
   this.archivo="quiz1.txt";
   preguntas= new leerArchivo(this.archivo);    
     
   }
    
    
    public  void imprimir(){
        preguntas.imprimirlista();
    } 
    
}
