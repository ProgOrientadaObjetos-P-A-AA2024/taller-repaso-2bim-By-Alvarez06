package paquete3;

import java.util.ArrayList;
import paquete2.Auto;

public class Concesionaria {

    private ArrayList<Auto> listadoAutos;
    private String nombre;
    private double ventasTotales;
    private double costoAutoMasCaro;
    private double costoAutoMasBarato;

    public Concesionaria(String n, ArrayList<Auto> l) {
        nombre = n;
        listadoAutos = l;
    }

    public void establecerListadoAutos(ArrayList<Auto> s) {
        listadoAutos = s;
    }

    public void establecerNombre(String s) {
        nombre = s;
    }

    public void calcularVentas() {
        costoAutoMasBarato = 9999999;
        costoAutoMasCaro = 0;
        for (Auto auto : listadoAutos) {
            ventasTotales += auto.obtenerPrecioFinal();
            if (auto.obtenerPrecioFinal() > costoAutoMasCaro) {
                costoAutoMasCaro = auto.obtenerPrecioFinal();
            }
            if (auto.obtenerPrecioFinal() < costoAutoMasBarato) {
                costoAutoMasBarato = auto.obtenerPrecioFinal();
            }
        }
    }

    public ArrayList<Auto> obtenerListadoAutos() {
        return listadoAutos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerVentasTotales() {
        return ventasTotales;
    }

    public double obtenerCostoAutoMasCaro() {
        return costoAutoMasCaro;
    }

    public double obtenerCostoAutoMasBarato() {
        return costoAutoMasBarato;
    }

    @Override
    public String toString() {
        String cadena = String.format("Concesionaria %s"
                + "\nListado de Autos:", nombre);
        for (Auto auto : listadoAutos) {
            cadena = String.format("%s\n\n%s", cadena, auto.toString());
        }
        cadena = String.format("%s\n"
                + "\nCosto auto mas caro: %.2f"
                + "\nCosto auto mas barato: %.2f"
                + "\nVentas totales: %.2f", 
                cadena, costoAutoMasCaro, costoAutoMasBarato, ventasTotales);
        return cadena;
    }

}
