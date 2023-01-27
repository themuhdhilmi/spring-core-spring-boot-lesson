package com.gementar.learnspringframework.examples.a1;

import com.gementar.learnspringframework.game.GameRunner;
import com.gementar.learnspringframework.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass
{
    Dependency1 dependency1;

    Dependency2 dependency2;

    //    @Autowired
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2)
    {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    //    public Dependency1 getDependency1()
//    {
//        return dependency1;
//    }
//
//    public Dependency2 getDependency2()
//    {
//        return dependency2;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2)
//    {
//        System.out.println("Setter Injection - SetDpendency1");
//        this.dependency2 = dependency2;
//    }
//
//    @Autowired
//    public void setDependency1(Dependency1 dependency1)
//    {
//        System.out.println("Setter Injection - SetDpendency2");
//        this.dependency1 = dependency1;
//    }

    @Override
    public String toString()
    {
        return "Using : " + dependency1 + " and " + dependency2;
    }
}

@Component
class Dependency1
{

}

@Component
class Dependency2
{

}

@Configuration
@ComponentScan
public class DependencyInjectionAppLauncherApplication
{
    public static void main(String[] args)
    {
        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionAppLauncherApplication.class))
        {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }
}
