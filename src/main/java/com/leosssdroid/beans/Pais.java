package com.leosssdroid.beans;

/**
 * Created by Leosss on 08/10/2016.
 */
public class Pais {
    private String nombre;
    private Ciudad ciudad;

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
