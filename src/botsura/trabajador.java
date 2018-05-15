/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botsura;

import vista.inicio;

/**
 *
 * @author japb1
 */
public class trabajador {
    public String matricula;
    public String correo;
    public String archivo;
    leerArchivo trabajadores;
    //public ArrayList<String> listaMat;
    //Scanner file;
    /**
     *
     * @param matricula
     * @param correo
     */
    
    public trabajador(String matricula, String correo){
        this.archivo="base1.txt";
        
        
        this.matricula = matricula;
        
        // this.matricula = inicio.matricula.getText();
         this.correo=correo;
        // this.correo= inicio.correo.getText();
        
        trabajadores= new leerArchivo(archivo);
        
        
    }    
        
    public  void imprimir(){
        trabajadores.imprimirlista();
    } 
    
    
    public boolean identificarse(){
       boolean existe=false;
       int i = 0;
       
       if(i!=-1){
           existe=true;
       }
       
        return existe;
    }
    
    
    //concatenar la nueva matricula
    
    public void actualizarTrabajador(String respuestas){
       String content = "";
       content+= matricula + "," + correo + "," + respuestas;
    }
    
    
    
   public boolean validarTrabajador(){
       boolean existe=false;
       int k;
        parsearArchivo busc= new parsearArchivo();
      busc.getString();
      
      k=busc.validarTrabajador(busc.parsingContent(),"11", "facebook");
      if(k!=-1){
          existe=true;
      }
       return existe;
   }
    
    public String getMatricula(){
        return matricula;
    }
    
    public String setMatricula(){
        return matricula;
    }
    
    public String getCorreo(){
        return this.correo;
    }
    

}