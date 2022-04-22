/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;
import parcial.Fabrica;
import parcial.Maquina;
import java.util.Scanner;
/**
 *
 * @author Franco Alvarez
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de maquinas en la fabrica");
        int cm= sc.nextInt();
        
        Fabrica f=new Fabrica(cm);
        for (int i = 0; i < cm; i++) {
            System.out.println("Ingrese el codigo de la maquina");
            int codMaq=sc.nextInt();
            System.out.println("Ingrese la cantidad de veces que la maquina fue reparada");
            int cantRep=sc.nextInt();
            System.out.println("Ingrese el total de horas que la maquina estuvo en reparacion");
            double hrsRep=sc.nextDouble();
            
            Maquina m=new Maquina(codMaq,cantRep,hrsRep);
            f.agregarMaqina(m);
        }
        
        System.out.println("ingrese la maquina de la que desea verificar");
        int codVer=sc.nextInt();
        
        System.out.println(f.existeXRota(codVer));
        System.out.println("el total de horas de reparacion es "+f.horasReparacionTotales());
        System.out.println("el promedio de horas que las maquinas estan en reparaciones es "+f.promedioHoras());
    }
    
}
