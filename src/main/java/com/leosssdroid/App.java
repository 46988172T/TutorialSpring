package com.leosssdroid;

import com.leosssdroid.beans.Mundo;
import com.leosssdroid.beans.OtraPersona;
import com.leosssdroid.beans.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {

        //ejercicio 1 (con xml y con anotaciones)

        /*ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        Mundo m = (Mundo) appContext.getBean("mundo");

        System.out.println(m.getSaludo());

        ((ConfigurableApplicationContext)appContext).close();*/

        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class, AppConfig2.class);
        Mundo m = (Mundo) appContext.getBean("mundo");

        System.out.println(m.getSaludo());

        ((ConfigurableApplicationContext)appContext).close();

        //ejercicio 2 datos del constructor

        ApplicationContext appContext2 = new ClassPathXmlApplicationContext("beans.xml");
        Persona p = (Persona)appContext2.getBean("persona");

        System.out.println(p.getId()+", "+p.getNombre()+", "+p.getApodo());

        ((ConfigurableApplicationContext)appContext2).close();

        //ejercicio 3 referencia de beans

        ApplicationContext appContext3 = new ClassPathXmlApplicationContext("beans.xml");
        OtraPersona op = (OtraPersona)appContext3.getBean("otraPersona");

        System.out.println(op.getId()+", "+op.getNombre()+", "+op.getApodo()+", "+op.getPais().getNombre()+", "+op.getPais().getCiudad().getNombre());

        ((ConfigurableApplicationContext)appContext3).close();
    }
}
