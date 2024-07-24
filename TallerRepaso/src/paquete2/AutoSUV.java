package paquete2;

import paquete3.Comprador;

public class AutoSUV extends Auto{
    private double porcentajeSeguro;
    private double seguroPersonas;

    public AutoSUV(Comprador propietario, String marca, double precioBase, double p) {
        super(propietario, marca, precioBase);
        porcentajeSeguro = p;
    }

    public void establecerPorcentajeSeguro(double p) {
        porcentajeSeguro = p;
    }
    
    public void calcularSeguroPersonas(){
        seguroPersonas = precioBase * (porcentajeSeguro / 100);
    }
    
    public double obtenerPorcentajeSeguro() {
        return porcentajeSeguro;
    }
    
    public double obtenerSeguroPersonas(){
        return seguroPersonas;
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto SUV"
                + "\n%s"
                + "\nPorcentaje Seguro: %.2f"
                + "\nSeguro Personas: %.2f"
                + "\nPrecio Total: %.2f", 
                super.toString(), porcentajeSeguro, seguroPersonas, precioFinal);
        return cadena;
    }
}
