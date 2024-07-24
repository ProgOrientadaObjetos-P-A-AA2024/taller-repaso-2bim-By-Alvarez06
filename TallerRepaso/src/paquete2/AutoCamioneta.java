package paquete2;

import paquete3.Comprador;

public class AutoCamioneta extends Auto{
    private double porcentajeImportacion;
    private double valorImportacion;
    private double seguroMantenimiento;

    public AutoCamioneta(Comprador propietario, String marca, double precioBase, double p) {
        super(propietario, marca, precioBase);
        porcentajeImportacion = p;
    }

    public void establecerPorcentajeImportacion(double p) {
        porcentajeImportacion = p;
    }
    
    public void calcularValorImportacion(){
        valorImportacion = precioBase * (porcentajeImportacion / 100);
    }
    
    public void calcularSeguroMantenimiento(){
        seguroMantenimiento = valorImportacion * 1.5;
    }
    
    public double obtenerPorcentajeSeguro() {
        return porcentajeImportacion;
    }
    
    public double obtenerValorImportacion(){
        return valorImportacion;
    }
    
    public double obtenerSeguroMantenimiento(){
        return seguroMantenimiento;
    }
    
    @Override
    public void calcularPrecioFinal() {
        precioFinal = precioBase + seguroMantenimiento + valorImportacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto Tipo Camioneta"
                + "\n%s"
                + "\nPorcentaje Adicional Fijo por Importacion: %.2f"
                + "\nValor Importacion: %.2f"
                + "\nSeguro de Mantenimiento: %.2f"
                + "\nPrecio Total: %.2f", 
                super.toString(), porcentajeImportacion, valorImportacion, 
                seguroMantenimiento, precioFinal);
        return cadena;
    }
}
