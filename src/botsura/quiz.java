/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import java.util.ArrayList;

/**
 *
 * @author japb1
 */
public class quiz {
    public ArrayList<String> Respuestas;
    public int NoInt;  
    public int Calificacion;
    
    public quiz(){
       this.Respuestas= new ArrayList<>();    
    }
    
   //se agrega la respuesta al arreglo dinamico
   public void agregarRespuesta(String abc){
       Respuestas.add(abc);
   }
    
   public int getNoInt(){
       return NoInt;
   }
   
    public int getRespuestasCounter() {
        return Respuestas.size();
    }
   
   //pasar el arreglo a un String
    public String getContenido(){
        String contenido="";
        for(int i=0;i<Respuestas.size();i++){
            contenido+=Respuestas.get(i);
        }
        return contenido;
    }
    
   
   public int getCalificacion(){
       return Calificacion;
       
   }
   
   public int setCalificacion(){
       
       return Calificacion;
   }
   
   public void imprimirRespuestas(){
       int i;
       for(i=0;i<Respuestas.size();i++){
           System.out.println(Respuestas.get(i));
       }
   }
   
   public int calificarQuiz(){
      int cal=0,i;
      //aqui se calificaran las preguntas
      for(i=0;i<Respuestas.size();i++){
          
      }
     if(Respuestas.get(1).equals("a")){
      cal++;
     }
     if(Respuestas.get(2).equals("a")){
      cal++;
     }
     if(Respuestas.get(3).equals("a")){
      cal++;
     }
     if(Respuestas.get(4).equals("a")){
      cal++;
     }
     if(Respuestas.get(5).equals("a")){
      cal++;
     }
      return cal;
       
   }
   
    
    
    
    
    
    
    
    
    
}
