package org.racoonman.spring.springjdosample;

import java.util.Properties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *
 * @author daniel
 */
@SpringBootApplication
@EnableWebMvc
public class App extends SpringBootServletInitializer  {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
    
    public static void main(String[] args){
        Properties properties = System.getProperties();
        SpringApplication.run(App.class);
    }
    
}
