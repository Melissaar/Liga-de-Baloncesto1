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
public class Equipo {
 
  
    private final Pabellon Pabellon1 = new Pabellon();
    
      private Partido Partido1;
    public void setPartido(Partido Partidop)
    {
    this.Partido1=Partidop;
    }
    public Partido getPartido()
    {
    return Partido1;
    }
        
    private String Nombre;
    public void setNombre(String Nombrep)
    {
    this.Nombre=Nombrep;
    }
    public String getNombre()
    {
    return Nombre;
    }
    
   private String Ciudad;
    public void setCiudad(String Ciudadp)
    {
    this.Ciudad=Ciudadp;
    }
    public String getCiudad()
    {
    return Ciudad;
    }
}

}

