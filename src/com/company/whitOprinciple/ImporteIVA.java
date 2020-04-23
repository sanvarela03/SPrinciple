package com.company.whitOprinciple;

import com.company.ConstantesFacturacion;

public class ImporteIVA extends Importe {
    @Override
    public double calcular(Factura factura) {
        return factura.getImporteFactura() * ConstantesFacturacion.IVA;
    }
}
