package org.jose.webapp_produces_factura_tarea15.models;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Cliente {

    private String nombre;
    private String apellidos;
    private String email;

    @PostConstruct
    public void inicializar (){
        nombre="Jose Armando";
        apellidos="Roman Torres";
        email="jart2607@gmail.com";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
