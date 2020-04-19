package com.company;

public class Mostrar implements Printable {

    Factura factura;
    ICalcularImporte calcularImporte = new CalcularImporteFactura();


    @Override
    public void mostrarImporteTotal(Factura factura) {
        double total = calcularImporte.calcularImporteTotal(factura);

        System.out.println("Importe total  = "+total);
    }
}
