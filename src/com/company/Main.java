package com.company;

public class Main {

    static Printable print =  new Mostrar();

    public static void main(String[] args) {
        print.mostrarImporteTotal(new Factura(100000,0.10));
    }
}
