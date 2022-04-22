/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

import java.util.logging.Logger;

/**
 *
 * @author Franco Alvarez
 */
public class Triangulo extends Figura{
public float base;
public float altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }
   

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
        
        
        
    @Override
    public float superficie() {
        return(float)base*altura/2;
    }
    
}
