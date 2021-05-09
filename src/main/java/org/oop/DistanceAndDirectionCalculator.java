package org.oop;

import java.awt.geom.Point2D;

public class DistanceAndDirectionCalculator implements Calculator{

    Point point1, point2;

    public DistanceAndDirectionCalculator(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public double distance() {
        return Point2D.distance(point1.x, point1.y, point2.x, point2.y);
    }

    public double direction() {
        double xDistance = point2.x - point1.x;
        double yDistance = point2.y - point1.y;
        return Math.atan2(yDistance, xDistance);
    }
}
