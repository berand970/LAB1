/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra_2_lab1;

/**
 *
 * @author andru
 */
public class EmailAccount {
    private Email[] inbox;
    private String email;
    private String contraseña;
    private String nombre;
    
    public EmailAccount(String email,String contra,String name){
   inbox = new Email[50]; 
   this.email=email;
   this.contraseña=contra;
   this.nombre=name;
   
}
     public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }
    
  public boolean recibirEmail(Email em){
       for (int j = 0; j < inbox.length; j++) {
              if (inbox[j] == null) {
                    inbox[j] = em;
                    System.out.println("Se registro");
                    return true;
                }   
          
      }
      
      return false;
  }
  
  public void printInbox() {
        System.out.println("Dirección de Email: " + email);
        System.out.println("Nombre Completo: " + nombre);
        System.out.println("\nCorreos recibidos:");

        int correosSinLeer = 0;
        int totalCorreos = 0;

        for (int i = 0; i < inbox.length; i++) {
            if (inbox[i] != null) {
                totalCorreos++;
                String visto = inbox[i].isLeido() ? "LEIDO" : "SIN LEER";
                if (!inbox[i].isLeido()) {
                    correosSinLeer++;
                }
                System.out.println((i + 1) + " - " + inbox[i].getEnvio()+ " - " + inbox[i].getAsunto() + " - " + visto);
            }
        }

        System.out.println("\nCorreos sin leer: " + correosSinLeer);
        System.out.println("Total de correos recibidos: " + totalCorreos);
    }
   public void leerEmail(int pos) {
        if (pos >= 1 && pos <= inbox.length && inbox[pos - 1] != null) {
            inbox[pos - 1].print(); // Imprimir el contenido del correo
            inbox[pos - 1].leido(); // Marcar como leído
        } else {
            System.out.println("Correo No Existe");
        }
    }

    
    public void borrarLeidos() {
        for (int i = 0; i < inbox.length; i++) {
            if (inbox[i] != null && inbox[i].isLeido()) {
                inbox[i] = null; // Eliminar el correo leído
            }
        }
    }
    
    
}