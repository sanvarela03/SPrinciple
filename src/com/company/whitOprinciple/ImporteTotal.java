package com.company.whitOprinciple;

public class ImporteTotal extends Importe {

    Importe i;
    @Override
    public double calcular(Factura factura) {
        i = new ImporteDeduccion();
        var deduccion = i.calcular(factura);
        i = new ImporteIVA();
        var iva = i.calcular(factura);

        return factura.getImporteFactura()+iva-deduccion;
    }
}
