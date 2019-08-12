package org.dungmd.javaspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.tools.javac.util.Context;

public class DrawingApp {

    public static void main(String[] args) {
        // Triangle aTriangle = new Triangle();
        AbstractApplicationContext aContext = new ClassPathXmlApplicationContext("SpringDemo.xml");
        aContext.registerShutdownHook();

        System.out.println("Drawing Chain");
        Shape aShape = (Shape) aContext.getBean("chain");
        aShape.draw();

        System.out.println("Drawing Triangle");
        aShape = (Shape) aContext.getBean("triangle-alias");
        aShape.draw();

        System.out.println("Drawing Cycled Chain");
        aShape = (Shape) aContext.getBean("cycle");
        aShape.draw();

        System.out.println("Drawing Circle");
        aShape = (Shape) aContext.getBean("circle");
        aShape.draw();
        
        System.out.println(aContext.getMessage("greeting", null, "Default Greeting", null));
    }

}
