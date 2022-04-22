/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcompras;

/**
 *
 * @author Franco Alvarez
 */
public class Items {
    private String producto;
    private int cantidad;
    private float precio;

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Items(String producto, int cantidad, float precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    
}
