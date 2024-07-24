package paquete2;

import paquete3.Comprador;

public abstract class Auto {
    protected Comprador propietario;
    protected String marca;
    protected double precioBase;
    protected double precioFinal;

    public Auto(Comprador p, String m, double pB) {
        propietario = p;
        marca = m;
        precioBase = pB;
    }
    
    public void establecerPropietario(Comprador x) {
        propietario = x;
    }

    public void establecerMarca(String x) {
        marca = x;
    }

    public void establecerPrecioBase(double x) {
        precioBase = x;
    }

    public abstract void calcularPrecioFinal();
    
    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Informacion Propietario:"
                + "\n%s"
                + "\nInformacion Auto:"
                + "\nMarca: %s"
                + "\nPrecio Base: %.2f", 
                propietario.toString(), marca, precioBase);
        return cadena;
    }
}
