/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liga.de.baloncesto1;

/**
 *
 * @author SENA
 */

    public class Jugadores extends Partido {
   
 private final Equipo equipo1 = new Equipo();
   
 
   
   private String Nombre;
  
   public void setNombre(String Nombrep)
   {
   this.Nombre=Nombrep;
   }
   public String getNombre()
   {
   return Nombre;
   }
private String DNI;
   public void setDNI(String DNIp)
   {
   this.DNI=DNIp;
   }
   public String getDNI()
   {
   return DNI;
   }
  private String Contrato;
   public void setContrato(String Contratop)
   {
   this.Contrato=Contratop;
   }
   public String getContrato()
   {
   return Contrato;
   }
}


