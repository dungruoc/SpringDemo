package org.dungmd.javaspring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {
    private int x;
    private int y;

    public Point( ) {
    }
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "(" + Integer.toString(x) + ", " + Integer.toString(y) + ")";
    }

    @Override
    public void afterPropertiesSet() throws Exception {  
        System.out.println("afterPropertiesSet: " + this.toString());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy: " + this.toString());
    }
    
    public void myInit( ) {
        System.out.println("myInit: " + this.toString());        
    }

    public void myCleanup( ) {
        System.out.println("myCleanup: " + this.toString());        
    }
}
