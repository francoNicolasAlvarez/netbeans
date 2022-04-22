/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor;

import Clases.Viaje;
import java.util.ArrayList;


public class gestorHotel {
    
    private ArrayList<Viaje> reservaciones;
  
    
    
    public gestorHotel()
            {
            reservaciones=new ArrayList<>();
            }
    public void agregarReservacion(Viaje v)
    {
        reservaciones.add(v);
    }
    
    public float tot=0;
    public int vac=0;
    public int neg=0;
    public void agregarVac()
    {
    vac++;}
    public void agregarNeg(){
    neg++;
    }
    
  
    
        
    
    
}
