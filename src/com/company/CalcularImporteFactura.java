package com.company;

public class CalcularImporteFactura implements ICalcularImporte{
    @Override
    public double calcularImporteTotal(Factura factura) {
        return ((factura.getImporteFactura()-calcularImporteDeduccion(factura))+calcularImporteIVA(factura));
    }

    @Override
    public double calcularImporteIVA(Factura factura) {
        return factura.getImporteFactura()*ConstantesFacturacion.IVA;
    }

    @Override
    public double calcularImporteDeduccion(Factura factura) {
        return (factura.getImporteFactura() * factura.getPorcentajeDeduccion()) / 100;
    }
}
