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

 
public class Incidencias extends Equipo 
{

 private final Sanciones Sanciones1 = new Sanciones(); 
    
        
    private String Descripcion;
    
    public void setDescripcion(String Descripcionp)
    {
    this.Descripcion=Descripcionp;
    }
    public String getDescripcion()
    {
    return Descripcion;
    }
}



