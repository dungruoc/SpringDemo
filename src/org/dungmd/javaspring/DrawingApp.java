package org.dungmd.javaspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        // Triangle aTriangle = new Triangle();
        AbstractApplicationContext aContext = new ClassPathXmlApplicationContext("SpringDemo.xml");
        aContext.registerShutdownHook();
        Shape aShape = (Shape) aContext.getBean("chain");
        aShape.draw();

        aShape = (Shape) aContext.getBean("triangle-alias");
        aShape.draw();

        aShape = (Shape) aContext.getBean("cycle");
        aShape.draw();
    }

}
