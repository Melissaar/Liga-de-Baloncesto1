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
    
   public class Estadisticas extends Partido {
    
   private final Jugadores Jugadores1 = new Jugadores(); 
   
    private Equipo Equipo1;
    public void setEquipo1(Equipo Equipop)
    {
    this.Equipo1=Equipop;
    }
    public Equipo getEquipo1()
    {
    return Equipo1;
    }
    
    
    
    private String Resultado_Final;
    public void setResultado_Final(String Resultado_Finalp)
    {
    this.Resultado_Final=Resultado_Finalp;
    }
    public String getResultado_Final()
    {
    return Resultado_Final;
    }
   
}


