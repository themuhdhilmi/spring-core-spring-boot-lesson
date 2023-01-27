package com.gementar.learnspringframework.examples.z.businesscalculationservicemyexsersize;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
@ComponentScan("com.gementar.learnspringframework.examples.businesscalculationservicemyexsersize.db")
public class BusinessCalculationLauncherApplication
{
    public static void main(String[] args)
    {
        try(var context = new AnnotationConfigApplicationContext(BusinessCalculationLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println("DB : " + context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
