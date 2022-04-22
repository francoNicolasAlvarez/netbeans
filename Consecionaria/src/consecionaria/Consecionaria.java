
package consecionaria;
import java.util.Scanner;
import java.util.ArrayList;


public class Consecionaria {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la nombre de la consecionaria");
        String nomC=sc.nextLine();
        int ant;
        Auto au;       
        Consecionari c=new Consecionari(nomC);
        
        
        System.out.println("Ingrese la antiguedad del auto(fin con 0)");
        ant=sc.nextInt();
        while(ant>0)
        {
            sc.nextLine();
        System.out.println("Ingrese la marca");
        String marca=sc.nextLine();
        System.out.println("Ingrese la patente");
        String patente=sc.nextLine();
        
         c.agregarAuto(new Auto(marca,patente,ant));
         
        System.out.println("Ingrese la antiguedad del auto(fin con 0)");
        ant=sc.nextInt();
        }
        
                System.out.println("Cantidad de autos cargados "+ c.cantidadAutos());
        System.out.println("Cantidad de autos  con poco uso "+ c.cantidadAutosPocoUso());
        System.out.println("el promedio de antieguedad es "+ c.promedioAntNOMuyAntiguos());
     
                 
        }
        
        
        

        
        
        
    }
    

