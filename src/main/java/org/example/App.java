package org.example;

import org.example.config.SpringConfig;
import org.example.service.CatService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello MVC!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        CatService service = context.getBean(CatService.class);

        service.start();
    }
}
