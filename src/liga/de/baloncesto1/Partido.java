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


public class Partido extends Incidencias {
   
    
    private Incidencias Incidencias1;
    public void setIncidencias(Incidencias Incidenciasp)
    {
    this.Incidencias1=Incidenciasp;
    }
    public Incidencias getIncidencias()
    {
    return Incidencias1;
    }
    
    
    private String Nºespectadores;
    public void setNªespectadores(String Nºespectadoresp)
    {
    this.Nºespectadores=Nºespectadoresp;
    }
    public String getNºespectadores()
    {
    return Nºespectadores;
    }
    
   private String Resultado;
    public void setCiudad(String Resultadop)
    {
    this.Resultado=Resultadop;
    }
    public String getResultado()
    {
    return Resultado;
    } 
}
