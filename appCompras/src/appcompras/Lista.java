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
public class Lista {
    private String nombre;
    private Items[] articulos;

    public Lista(String nombre,int cantidad) {
        this.nombre = nombre;
        articulos=new Items[cantidad];
    }
    public void agregarProducto(Items item){
    for (int i = 0; i < articulos.length; i++) {
            if(articulos[i]==null){
            articulos[i]=item;
            break;
            }
        }
    
    }    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int cantMay5(){
    int c=0;
        for (Items articulo : articulos) {
            if(articulos!=null){
                if(articulo.getCantidad()>5){
            c++;
                }
            }
            
        }
    return c;
    }
    
    public String prodMasCaro(){
        
        String nomCaro="";
        double precioCaro=0;
        for (Items articulo : articulos) {
            if(articulos!=null){
                if(nomCaro=="") {
                    nomCaro=articulo.getProducto();
                    precioCaro=articulo.getPrecio();
                }
                else{
                if(articulo.getPrecio()>precioCaro)
                    precioCaro=articulo.getPrecio();
                }
                
            }
            
        }
        return nomCaro;
    }
    
    public double gastoEstimado(){
    double costoXcantidad=0; 
    double total=0;
        for (Items articulo : articulos) {
            if(articulos!=null && articulo.getCantidad()!=0 && articulo.getPrecio()!=0){
            costoXcantidad=articulo.getCantidad()*articulo.getPrecio();
            total+=costoXcantidad;
            }
            
        }
        return total;
    }
    
}
