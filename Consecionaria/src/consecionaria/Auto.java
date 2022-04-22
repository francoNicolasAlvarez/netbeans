/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionaria;

/**
 *
 * @author Franco Alvarez
 */
public class Auto {
    
    private String marca;
    private String patente;
    private int antiguedad;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Auto(String marca, String patente, int antiguedad) {
        this.marca = marca;
        this.patente = patente;
        this.antiguedad = antiguedad;
    }
    
    
    
}
