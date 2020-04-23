package com.company.whitOprinciple;

public class ImporteDeduccion extends Importe{
    @Override
    public double calcular(Factura factura) {
        return (factura.getImporteFactura()*factura.getPorcentajeDeduccion())/100;
    }
}
