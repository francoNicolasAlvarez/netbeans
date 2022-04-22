/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u2e3;

/**
 *
 * @author Franco Alvarez
 */
public class Producto {
    String descripcion;
    Material[] materiales;
    
    public Producto(String descripcion,int cantMateriales){
    this.descripcion=descripcion;
    materiales=new Material[cantMateriales];
    
    } 
    
    public void agregarMaterial(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]==null){
                materiales[i]=material;
                break;
            
            }
            
            
            
        }
    
    }
    public double costoTotal(){
        
        double costoTot=0;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null)
            {
            costoTot+=materiales[i].getValorUnitario();
            
            }
            
        }
    return costoTot;
    }
    public boolean existeMaterial(int codigo)
    {
     boolean existe=false;
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null && materiales[i].getCodigo()==codigo)
            {
            existe=true;
            
            break;
            
            }
            
        }
    return existe;
    }
    public Material[] materialesMenorParametro(double valorMax)
        {
            Material[] materialesMenores=new Material[materiales.length];
            
            int proximaPosicion=0;
            for (int i = 0; i < materiales.length; i++) {
                if(materiales[i]!=null && materiales[i].getValorUnitario()<valorMax)
                    materialesMenores[proximaPosicion]=materiales[i];
                    proximaPosicion++;
                    }
            
            
            
            return materialesMenores;
        }
    public int [] cantidadPrecio()
    {
    int [] cantidadXPrecio=new int[4];
    
        for (int i = 0; i < materiales.length; i++) {
            if(materiales[i]!=null)
            {
            
            if(materiales[i].getValorUnitario()>0 && materiales[i].getValorUnitario()<=10)
                cantidadXPrecio[0]++;
            else if(materiales[i].getValorUnitario()>10 && materiales[i].getValorUnitario()<=20)
                                cantidadXPrecio[1]++;
             else if(materiales[i].getValorUnitario()>20 && materiales[i].getValorUnitario()<=30)
                                cantidadXPrecio[2]++;
                                         else 
                                cantidadXPrecio[3]++;

            }
            
            
        }
    
            
          
        return cantidadXPrecio;
    }  
    
    
 }
