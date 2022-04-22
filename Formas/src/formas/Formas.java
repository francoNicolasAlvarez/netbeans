/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;
import java.util.ArrayList;
import java.util.Scanner;
import formas.Circulo;
import formas.Rectangulo;
import formas.Triangulo;

/**
 *
 * @author Franco Alvarez
 */
public class Formas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Figura> Figuras=new ArrayList<>();
        
        
        int cantidad;
        
        System.out.println("ingrese la cantidad de figuras");
        cantidad=sc.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
                    int tipo;
                    System.out.println("ingrese el tipo de figura(1: Circulo,2: Rectangulo,3: Triangulo)");
                    tipo=sc.nextInt();
                    
                    Figura nueva=null;
            
                    switch(tipo)
                    {
                        case 1:
                            System.out.println("Ingrese el radio");
                            float radioC=sc.nextFloat();
                            nueva = new Circulo();
                            break;
                        
                        case 2:
                            System.out.println("Ingrese la altura");
                            float altoR=sc.nextFloat();
                            System.out.println("Ingrese el ancho");
                            float anchoR=sc.nextFloat();
                            nueva=new Rectangulo();
                            break;
                            
                        case 3:
                                System.out.println("Ingrese la alto");
                            float baseT=sc.nextFloat();
                            System.out.println("Ingrese la altura");
                            float altoT=sc.nextFloat();
                            nueva=new Triangulo();
                                    break;
                    
                    
                    
                    
                    
                    
                    }
                    if(nueva!=null)
                    Figuras.add(nueva);
                    float suma=0;
                    for (Figura f : Figuras) 
                    {
                        suma+=f.superficie();//llamada polimorfica
                
                    }
        }
        
        
        
    }
    
}
