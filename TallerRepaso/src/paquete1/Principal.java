package paquete1;

import java.util.ArrayList;
import paquete3.*;
import paquete2.*;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Auto> listadoAutos = new ArrayList<>();
        
        Comprador comprador1 = new Comprador("Jeimy Rodas", "1900013213");
        Comprador comprador2 = new Comprador("Erick Torres", "1900987654");
        Comprador comprador3 = new Comprador("Antonella Rivera", "1105132");

        AutoSedan sedan1 = new AutoSedan(comprador1, "Chevrolet", 25000, 10);
        sedan1.calcularValorDescuento();
        sedan1.calcularSeguroMecanico();
        sedan1.calcularPrecioFinal();
        listadoAutos.add(sedan1);
        
        AutoSedan sedan2 = new AutoSedan(comprador2, "JAC", 18000, 5);
        sedan2.calcularValorDescuento();
        sedan2.calcularSeguroMecanico();
        sedan2.calcularPrecioFinal();
        listadoAutos.add(sedan2);
        
        AutoSUV suv = new AutoSUV(comprador3, "Ford", 50000, 15);
        suv.calcularSeguroPersonas();
        suv.calcularPrecioFinal();
        listadoAutos.add(suv);
        
        AutoCamioneta camioneta = new AutoCamioneta(comprador1, "Volkswagen", 32000, 8);
        camioneta.calcularValorImportacion();
        camioneta.calcularSeguroMantenimiento();
        camioneta.calcularPrecioFinal();
        listadoAutos.add(camioneta);

        Concesionaria concesionaria = new Concesionaria("Autos del Mundo", listadoAutos);
        concesionaria.calcularVentas();

        System.out.printf("%s", concesionaria);
    }
    
}
