/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielelvir;

/**
 *
 * @author HP
 */
public class Bartenders {
    private String Nombre;
    private int Edad;
    private String turno;
    private int NumLicores;
    private double sueldo;

    public Bartenders(String Nombre, int Edad, String turno, int NumLicores, double sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.NumLicores = NumLicores;
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

    public int getNumLicores() {
        return NumLicores;
    }

    public void setNumLicores(int NumLicores) {
        this.NumLicores = NumLicores;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return  "Nombre del Bartender=" + Nombre +"\n"+ "Edad=" + Edad +"\n"+ "turno=" + turno +"\n"+ "NumLicores=" + NumLicores +"\n"+ "sueldo=" + sueldo+"\n";
    }
    
    
}
