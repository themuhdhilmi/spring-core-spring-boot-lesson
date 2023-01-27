package com.gementar.learnspringframework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
@ComponentScan
public class RealWorldExampleSpringContextLauncherApplication
{
    public static void main(String[] args)
    {
        try (var context = new AnnotationConfigApplicationContext(RealWorldExampleSpringContextLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println("MR BEAN - " + context.getBean(BusinessCalculationService.class));
        }
    }
}
