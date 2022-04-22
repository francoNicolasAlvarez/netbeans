/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consecionaria;
import java.util.ArrayList;
/**
 *
 * @author Franco Alvarez
 */
public class Consecionari {
    private String nombre;
    private ArrayList<Auto> autos;
    

    public Consecionari(String nombre) {
        this.nombre = nombre;
        this.autos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarAuto(Auto nuevo)
    {
    autos.add(nuevo);
    }
    public int cantidadAutos()
    {
    return autos.size();
    }
    public int cantidadAutosPocoUso()
    {
    int cantPocoUso=0;
        for (Auto auto : autos) {
            if(auto.getAntiguedad()>=6 && auto.getAntiguedad()<10)
                cantPocoUso++;   
    }
        return cantPocoUso;
    }
    public float promedioAntNOMuyAntiguos()
    {
    int sumaAntiguedad=0;
        int cantPocoAntiguo=0;
         for (Auto auto : autos) {
            if(auto.getAntiguedad()<=20)
                sumaAntiguedad+=auto.getAntiguedad();
            cantPocoAntiguo++;
        }
         float promedio=0;
        if(cantPocoAntiguo>0){
        promedio=(float)sumaAntiguedad/cantPocoAntiguo;
        }
        return promedio;
    }
        
}
