package com.example.Spring_Boot_Assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Question4 {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ApplicationContext context =  SpringApplication.run(Question4.class, args);
        // Get the bean from the context
        MyBean myBean = context.getBean(MyBean.class);

        // Display the properties of the bean
        System.out.println("Property1: " + myBean.getProperty1());
        System.out.println("Property2: " + myBean.getProperty2());
    }
}

@Component
class MyBean{
    int number;
    public int getProperty1(){
        return number;
    }
    public int getProperty2(){
      return number;
    }

}
