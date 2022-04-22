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
public class Fabrica {
    Maquina[] maquina;
    
    
    public Fabrica(int cantidad){
    maquina=new Maquina[cantidad];  
    }
    public void agregarMaqina(Maquina maq){
        for (int i = 0; i < maquina.length; i++) {
            if(maquina[i]==null){
                maquina[i]=maq;
                break;
            
            }
            
            
            
        }
    
    }
    public double horasReparacionTotales(){
        
        double totHoras=0;
        for (int i = 0; i < maquina.length; i++) {
            if(maquina[i]!=null)
            {
            totHoras+=maquina[i].getHorasRep();
            
            }
            
        }
    return totHoras;
    }
    
    public double promedioHoras()
    {
        int acuRotas=0;
        double acuHoras=0;
        for (int i = 0; i < maquina.length; i++) {
            if(maquina[i]!=null && maquina[i].getCantRep()>0 && maquina[i].getHorasRep()>0){
            acuRotas+=maquina[i].getCantRep();
            acuHoras+=maquina[i].getHorasRep();
            
            
            }
        }
        double promedio=acuHoras/(double)acuRotas;
        return promedio;
    }
    public String existeXRota(int codMaq)
    {String existe="La maquina no existe";
    String reparaciones="";
        for (int i = 0; i < maquina.length; i++) 
        {if(maquina[i].getCodigo()==codMaq)
        {
        existe="La maquina existe";
        if(maquina[i].getCantRep()!=0)
                {reparaciones=" y fue reparada "+maquina[i].getCantRep()+" veces";
                }
        else 
            reparaciones=" y nunca fue reparada";
            
        }
        
        }
    
    return existe+reparaciones;
    }
    
    
}
