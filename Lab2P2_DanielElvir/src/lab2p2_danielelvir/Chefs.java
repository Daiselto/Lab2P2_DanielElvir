/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielelvir;

/**
 *
 * @author HP
 */
public class Chefs {
    private String Nombre;
    private int Edad;
    private String turno;
    private int Estrellas;
    private double sueldo;

    public Chefs(String Nombre, int Edad, String turno, int Estrellas, double sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.Estrellas = Estrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstrellas() {
        return Estrellas;
    }

    public void setEstrellas(int Estrellas) {
        this.Estrellas = Estrellas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre del chef=" + Nombre +"\n"+ "Edad=" + Edad +"\n"+ "Turno=" + turno +"\n"+ "Estrellas=" + Estrellas +"\n"+ "Sueldo=" + sueldo +"\n";
    }
    
    
}
