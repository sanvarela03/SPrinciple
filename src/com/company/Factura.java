package com.company;

import java.util.Date;

public class Factura {

    private String codigo;
    private Date fechaEmision;
    private double importeFactura;
    private double porcentajeDeduccion;

    public Factura(String codigo, Date fechaEmision, double importeFactura, double porcentajeDeduccion) {
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public Factura(double importeFactura, double porcentajeDeduccion) {
        this.importeFactura = importeFactura;
        this.porcentajeDeduccion = porcentajeDeduccion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getImporteFactura() {
        return importeFactura;
    }

    public void setImporteFactura(double importeFactura) {
        this.importeFactura = importeFactura;
    }

    public double getPorcentajeDeduccion() {
        return porcentajeDeduccion;
    }

    public void setPorcentajeDeduccion(double porcentajeDeduccion) {
        this.porcentajeDeduccion = porcentajeDeduccion;
    }
}

