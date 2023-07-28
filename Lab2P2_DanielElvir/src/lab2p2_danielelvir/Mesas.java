/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielelvir;

/**
 *
 * @author HP
 */
public class Mesas {
    private int platos;
    private int utensilios;
    private double precio;

    public Mesas(int platos, int utensilios, double precio) {
        this.platos = platos;
        this.utensilios = utensilios;
        this.precio = precio;
    }

    public int getPlatos() {
        return platos;
    }

    public void setPlatos(int platos) {
        this.platos = platos;
    }

    public int getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(int utensilios) {
        this.utensilios = utensilios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  "La mesa contiene: "+"\n"+"Platos=" + platos +"\n"+ "Utensilios=" + utensilios +"\n"+ "Precio=" + precio+"\n";
    }
    
    
}
