/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Franco Alvarez
 */
public class Operacion {
    
    private int idCliente;
    private String presentacion;
    private int codSucursal;
    private String presnetacion;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public int getCodSucursal() {
        return codSucursal;
    }

    public void setCodSucursal(int codSucursal) {
        this.codSucursal = codSucursal;
    }

    public String getPresnetacion() {
        return presnetacion;
    }

    public void setPresnetacion(String presnetacion) {
        this.presnetacion = presnetacion;
    }

    public Operacion(int idCliente, String presentacion, int codSucursal, String presnetacion) {
        this.idCliente = idCliente;
        this.presentacion = presentacion;
        this.codSucursal = codSucursal;
        this.presnetacion = presnetacion;
    }
    
}
