/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author Franco Alvarez
 */
public class Circulo extends Figura{
    public float radio;

    public float getRadio() {
        return radio;
    }

    public Circulo() {
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public Circulo(float radio) {
        this.radio = radio;}
    
     
    @Override
    public float superficie()
    {
        return(float)Math.PI*radio*radio;
    }
}
