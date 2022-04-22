/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Franco Alvarez
 */
public class gestorExamen {
    
        
        private ArrayList<Examen> examenes;
        
        public gestorExamen()
        {
        examenes = new ArrayList<>();
        
        }
        public void agregarExamen(Examen e)
        {
        examenes.add(e);
        }
        public float promGen(){
       float contEx=0;
       float acuNota=0;
            for (Examen e : examenes) {
                acuNota+=e.getNota();
                contEx++;
                
            }
            return acuNota/contEx;
        
        }
        
       public int totRep()
       {
           int contRep=0;
           for (Examen e : examenes) {
               if(e.getTipExamen()=="Recuperatorio" && e.getNota()<6)
               {
               contRep++;
               
               }
           }
           return contRep;
       
       }
       
       public int cantRepZoom()
       {
           int repFinZoom=0;
           for (Examen e : examenes) {
               if(e.getTipExamen()=="Final"&& e.getNota()<6 && e.getModEntrega()=="Zoom")
               {
               repFinZoom++;
               }
               
               
           }
           return repFinZoom;
       }
       
      public Object[] listado() {
        return examenes.toArray();
    }
        
    
}
