package com.gementar.learnspringframework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass
{
    SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency)
    {
        this.someDependency = someDependency;
        System.out.println("All Dependencies are ready");
    }

    @PostConstruct
    public void initialization()
    {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp()
    {
        System.out.println("Cleanup");
    }

}

@Component
class SomeDependency
{

    public void getReady()
    {
        System.out.println("Some logic using SomeDependency");
    }
}

@Configuration
@ComponentScan
public class PrePostContextLauncherApplication
{
    public static void main(String[] args)
    {
        try (var context = new AnnotationConfigApplicationContext(PrePostContextLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);
        }
    }
}
