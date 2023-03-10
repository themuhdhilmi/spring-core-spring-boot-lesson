package com.gementar.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring
{
    public static void main(String[] args)
    {
        //1 - Launch a Spring Context -
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2 - Configure the tings that we want Spring framework to manage - @Configuration.
        // HelloWorldConfiguration - @Configuration
        // name - @Bean
//        System.out.println(context.getBean("name"));
//        System.out.println(context.getBean("age"));
//        System.out.println(context.getBean("person2MethodCall"));
//        System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean("person"));
//        System.out.println(context.getBean("address2"));
//        System.out.println(context.getBean(Address.class));

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

    }
}
