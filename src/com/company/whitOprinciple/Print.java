package com.company.whitOprinciple;


public class Print {

    static Importe importe = new ImporteTotal();

    public static void main(String[] args) {
        Factura factura = new Factura(1000,0.1);
        importe.calcular(factura);
        System.out.println(importe.getClass()+ " = $ " + importe.calcular(factura));
    }
}
