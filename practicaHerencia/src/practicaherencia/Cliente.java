/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaherencia;

/**
 *
 * @author Franco Alvarez
 */
public class Cliente {

    private int numero;
    private String nombre    ;
    private String telefono;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente(int numero, String nombre, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}
