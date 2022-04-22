/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class viajeNegocios extends Viaje {

    private boolean conf;

    public viajeNegocios(boolean conf, int numeroHabitacion, int diasRes, boolean vigente) {
        super(numeroHabitacion, diasRes, vigente);
        this.conf = conf;
    }

    public boolean isConf() {
        return conf;
    }

    public void setConf(boolean conf) {
        this.conf = conf;
    }

    @Override
    public float costeRes() {
        if (conf = true) {
            return 500 * super.getDiasRes() + 700;
        } 
        else {
            return 500* super.getDiasRes();
        }
    }

}
