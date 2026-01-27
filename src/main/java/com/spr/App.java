package com.spr;
import javax.swing.Spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    // “Bean” means a normal Java object.
    // Spring Bean” means a Java object that is created and managed by Spring.

//     ApplicationContext is a Spring container interface that defines methods for creating and managing beans.
// ClassPathXmlApplicationContext is a class that implements this interface, loads and reads the XML configuration file from the classpath, and provides the implementation of those methods
// What you mean is:
// Spring:
// Creates the object
// Stores it in the container
// Injects it where needed
// Manages its lifecycle -> when it is created or when it is destroyed 
// managing = creating + storing + injecting + lifecycle control
// Because all this work is done by Spring, that object is called a:  // Spring Bean

        ApplicationContext ac=new ClassPathXmlApplicationContext("com/spr/hello.xml");

        // getBean() returns an object of type Object.
        // But we want to store that returned object into a Student reference variable.
        // Since a Student variable can only hold Student type objects,
        // we must typecast the Object into Student before storing it.
        Student so1=(Student) ac.getBean("s1");
        Student so2=(Student) ac.getBean("s2");
        System.out.println(so1);
        System.out.println(so2);
    }
}
