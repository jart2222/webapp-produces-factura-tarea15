package org.jose.webapp_produces_factura_tarea15.configs;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.Produces;
import org.jose.webapp_produces_factura_tarea15.models.LineaFactura;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProducerResources{

    @Resource(name = "jdbc/mysqlDB")
    private DataSource ds;


    @Produces
    @RequestScoped
    @MysqlConn
    private Connection beansConnection() throws SQLException {
        return ds.getConnection();
    }

    @Produces
    private List<LineaFactura> beansLineasDeFactura(){

        List<LineaFactura> lineaFacturas=new ArrayList<>();
        LineaFactura lineaFactura= new LineaFactura();
        lineaFactura.setPrecio(300);
        lineaFactura.setCantidad(2);
        lineaFactura.setNombreProducto("Monitor LG LCD 24");

        LineaFactura lineaFactura1=new LineaFactura();
        lineaFactura1.setPrecio(400);
        lineaFactura1.setCantidad(3);
        lineaFactura1.setNombreProducto("Escritorio de oficina");

        LineaFactura lineaFactura2=new LineaFactura();
        lineaFactura2.setPrecio(540);
        lineaFactura2.setCantidad(10);
        lineaFactura2.setNombreProducto("Impresora Multifuncional");

        lineaFacturas.add(lineaFactura);
        lineaFacturas.add(lineaFactura1);
        lineaFacturas.add(lineaFactura2);

        return lineaFacturas;
    }



}
