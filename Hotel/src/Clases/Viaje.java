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
public abstract class Viaje  {
    private int numeroHabitacion;
    private int diasRes;
    private boolean vigente;

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getDiasRes() {
        return diasRes;
    }

    public void setDiasRes(int diasRes) {
        this.diasRes = diasRes;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Viaje(int numeroHabitacion, int diasRes, boolean vigente) {
        this.numeroHabitacion = numeroHabitacion;
        this.diasRes = diasRes;
        this.vigente = vigente;
    }
    public abstract float costeRes();
    
}
