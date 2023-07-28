/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielelvir;

/**
 *
 * @author HP
 */
public class Meseros {
    private String Nombre;
    private int Edad;
    private String turno;
    private double propina;
    private double sueldo;

    public Meseros(String Nombre, int Edad, String turno, double propina, double sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.propina = propina;
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

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Nombre del Mesero=" + Nombre +"\n"+ "Edad=" + Edad +"\n"+ "Turno=" + turno +"\n"+ "Propina=" + propina +"\n"+ "Sueldo=" + sueldo+"\n";
    }
    
    
}
