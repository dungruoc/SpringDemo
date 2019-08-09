package org.dungmd.javaspring;

import java.util.List;

public class Chain implements Shape {

    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void draw() {
        System.out.println("Chain");
        for (Point point : points) {
            System.out.println(point.toString());
        }
    }

}
