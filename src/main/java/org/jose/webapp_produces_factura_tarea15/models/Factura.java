package org.jose.webapp_produces_factura_tarea15.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named
@RequestScoped
public class Factura {
    @Inject
    private Cliente cliente;
    private Integer numeroFactura;
    private String descripcion;
    @Inject
    private List<LineaFactura> lineaFacturas;

    @PostConstruct
    public void inicializar (){
        numeroFactura=25061998;
        descripcion="Factura del cliente: "
                .concat(cliente.getNombre())
                .concat(" ")
                .concat(cliente.getApellidos());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(Integer numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<LineaFactura> getLineaFacturas() {
        return lineaFacturas;
    }

    public void setLineaFacturas(List<LineaFactura> lineaFacturas) {
        this.lineaFacturas = lineaFacturas;
    }
}
