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
public class Examen {
    private String materia;
    private String tipExamen;
    private int Nota;
    private String modEntrega;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getTipExamen() {
        return tipExamen;
    }

    public void setTipExamen(String tipExamen) {
        this.tipExamen = tipExamen;
    }

    public int getNota() {
        return Nota;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public String getModEntrega() {
        return modEntrega;
    }

    public void setModEntrega(String modEntrega) {
        this.modEntrega = modEntrega;
    }

    public Examen(String materia, String tipExamen, int Nota, String modEntrega) {
        this.materia = materia;
        this.tipExamen = tipExamen;
        this.Nota = Nota;
        this.modEntrega = modEntrega;
    }

    @Override
    public String toString() {
        return "Examen{" + "materia=" + materia + ", tipExamen=" + tipExamen + ", Nota=" + Nota + ", modEntrega=" + modEntrega + '}';
    }
    
    
    
}
