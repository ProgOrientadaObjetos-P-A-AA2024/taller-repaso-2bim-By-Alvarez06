package paquete2;

import paquete3.Comprador;

public class AutoSedan extends Auto{
    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public AutoSedan(Comprador propietario, String marca, double precioBase, double p) {
        super(propietario, marca, precioBase);
        porcentajeDescuento = p;
    }

    public void establecerPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }
    
    public void calcularValorDescuento(){
        valorDescuento = precioBase * (porcentajeDescuento / 100);
    }
    
    public void calcularSeguroMecanico(){
        seguroMecanico = precioBase * 0.01;
    }
    
    public double obtenerPorcentajeSeguro() {
        return porcentajeDescuento;
    }
    
    public double obtenerValorDescuento(){
        return valorDescuento;
    }
    
    public double obtenerSeguroMecanico(){
        return seguroMecanico;
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroMecanico - valorDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto Sedan"
                + "\n%s"
                + "\nPorcentaje Descuento: %.2f"
                + "\nValor Descuento: %.2f"
                + "\nSeguro Mecanico: %.2f"
                + "\nPrecio Total: %.2f", 
                super.toString(), porcentajeDescuento, valorDescuento, 
                seguroMecanico, precioFinal);
        return cadena;
    }
}
