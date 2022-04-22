/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Franco Alvarez
 */
public class Maquina {
   int codigo;
   int cantRep;
   double horasRep;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantRep() {
        return cantRep;
    }

    public void setCantRep(int cantRep) {
        this.cantRep = cantRep;
    }

    public double getHorasRep() {
        return horasRep;
    }

    public void setHorasRep(double horasRep) {
        this.horasRep = horasRep;
    }

    public Maquina(int codigo, int cantRep, double horasRep) {
        this.codigo = codigo;
        this.cantRep = cantRep;
        this.horasRep = horasRep;
    }

   
}
