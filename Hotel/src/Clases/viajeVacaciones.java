/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Franco Alvarez
 */
public class viajeVacaciones extends Viaje {
    
    private int niños;

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }

    public viajeVacaciones(int niños, int numeroHabitacion, int diasRes, boolean vigente) {
        super(numeroHabitacion, diasRes, vigente);
        this.niños = niños;
    }
    
   
    @Override
    public float costeRes()
    {
    return 600*super.getDiasRes()+100*niños;
    
    }
    
    
    
}
