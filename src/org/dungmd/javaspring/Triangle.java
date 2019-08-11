package org.dungmd.javaspring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements Shape, BeanNameAware, ApplicationContextAware {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    @Autowired
    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Autowired
    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    @Autowired
    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
        System.out.println(pointA.toString());
        System.out.println(pointB.toString());
        System.out.println(pointC.toString());
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("beanName: " + beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        System.out.println("applicationContext:");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println("bean: " + name);
        }
    }
}
