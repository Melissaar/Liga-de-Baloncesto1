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
public class Sanciones {
    

   private String Descripciòn;
   private final Pabellon pabellon1 = new Pabellon();
   
   public void setDescripciòn(String Descripciònp)
   {
   this.Descripciòn=Descripciònp;
   }
   public String getDescripciòn()
   {
   return Descripciòn;
   }
   
   private String Nºsanciones;
   public void setNºsanciones(String Nºsancionesp)
   {
   this.Nºsanciones=Nºsancionesp;
   }
   public String getNºsanciones()
   {
   return Nºsanciones;
   }
}


