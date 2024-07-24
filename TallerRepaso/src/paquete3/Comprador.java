package paquete3;

public class Comprador {
    private String nombres;
    private String cedula;

    public Comprador(String n, String c) {
        nombres = n;
        cedula = c;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public void establecerCedula(String n) {
        cedula = n;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Comprador:"
                + "\nNombres: %s"
                + "\nCedula: %s", obtenerNombres(), obtenerCedula());
        return cadena;
    }
}
