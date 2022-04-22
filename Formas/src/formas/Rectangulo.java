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
public class Rectangulo extends Figura {
    public float alto;
    public float ancho;

    public Rectangulo() {
    }

    public Rectangulo(float alto, float ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    @Override
    public float superficie()
    {
    return alto*ancho;
    }
}
