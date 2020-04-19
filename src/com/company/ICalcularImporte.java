package com.company;

public interface ICalcularImporte {
    double calcularImporteTotal(Factura factura);

    double calcularImporteIVA(Factura factura);

    double calcularImporteDeduccion(Factura factura);
}
