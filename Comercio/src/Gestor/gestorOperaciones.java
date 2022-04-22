/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestor;

import clases.Operacion;
import java.util.ArrayList;

/**
 *
 * @author Franco Alvarez
 */
public class gestorOperaciones {
    public ArrayList<Operacion> operaciones;
    
    
  
    
     public gestorOperaciones(){
        operaciones = new ArrayList<>();
    }
     

    public void agregarOperacion(Operacion o) {
        operaciones.add(o);
    }
    int datosCargados=0;
    public void sumarCargas(){
    datosCargados++;
    }
    public int conSug=0;
    public void sumarConSug(){
    conSug++;
    }
    int recGen=0;
    public void recGen(){
        recGen++;
    
    }
    public Object[] listado(){
         return operaciones.toArray();
    }
   
    
}
