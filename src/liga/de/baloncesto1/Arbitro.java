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
public class Arbitro {
    
    private final Partido partido1 = new Partido();
    private String Nombre;
    public void setNombre(String Nombrep)
   {
   this.Nombre=Nombrep;
   }
   public String getNombre()
   {
   return Nombre;
   }
   
    private String Colegio;
   public void setColegio(String Colegiop)
   {
   this.Colegio=Colegiop;
   }
   public String getColegio()
   {
   return Colegio;
   }
   
}


