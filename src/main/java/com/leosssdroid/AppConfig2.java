package com.leosssdroid;

import com.leosssdroid.beans.Mundo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Leosss on 08/10/2016.
 */
@Configuration
public class AppConfig2 {

    @Bean
    public Mundo marte(){
        return new Mundo();
    }
}
