/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra_2_lab1;

/**
 *
 * @author andru
 */
public class Email {
  private String envio;
  private String asunto;
  private String contenido;       
  private boolean leido;

    


public Email(String envio,String asunto,String contenido){
   this.envio = envio;
   this.asunto= asunto;
   this.contenido =contenido;
   leido=false;
}

 public void leido() {
        this.leido = true;
    }
 
public void print(){
    System.out.println("DE:"+envio+"\nAsunto"+asunto+"\n"+contenido);
}
public boolean isLeido() {
        return leido;
    }
  
  
    public String getEnvio() {
        return envio;
    }

    public String getAsunto() {
        return asunto;
    }


    public String getContenido() {
        return contenido;
    }
}