package com.leosssdroid.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Leosss on 07/10/2016.
 */
public class Mundo {
    @Value("Hola mundo")
    private String saludo;

    public String getSaludo(){
        return saludo;
    }

    public void setSaludo(String saludo){
        this.saludo = saludo;
    }
}
