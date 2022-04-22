/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcompras;
import java.util.Scanner;
import appcompras.Lista;
import appcompras.Items;
/**
 *
 * @author Franco Alvarez
 */
public class AppCompras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       
       System.out.println("Ingrese titulo de la lista");
       String compranding = sc.next();
       System.out.println("Ingrese la cantidad de articulos de la lista");
       int canArt=sc.nextInt();
       
       Lista a=new Lista(compranding,canArt);
       
        for (int i = 0; i < canArt; i++) {
            System.out.println("Ingrese el nombre del producto");
            String prod=sc.next();
            System.out.println("Ingrese la cantidad a comprar");
            int can=sc.nextInt();
            System.out.println("Ingrese el costo maximo aceptable");
            float max=sc.nextFloat();
            
            Items itm=new Items(prod,can,max);
            
            a.agregarProducto(itm);
        }
        int masDe5=a.cantMay5();
        String msCaro=a.prodMasCaro();
        double ttl=a.gastoEstimado();
        
        System.out.println(masDe5);
        System.out.println(msCaro);
        System.out.println(ttl);
    }
    
}
