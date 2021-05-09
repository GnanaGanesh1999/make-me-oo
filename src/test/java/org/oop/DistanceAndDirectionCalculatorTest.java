package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, origin);

        double returnValue = distanceAndDirectionCalculator.distance();

        Assertions.assertEquals(0, returnValue);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);


        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator2 = new DistanceAndDirectionCalculator(origin, point2);


        double returnValue = distanceAndDirectionCalculator.distance();
        Assertions.assertEquals(1, returnValue);

        double returnValue2 = distanceAndDirectionCalculator2.distance();
        Assertions.assertEquals(1, returnValue2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);


        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(point1, point2);

        double returnValue = distanceAndDirectionCalculator.distance();

        Assertions.assertEquals(2, returnValue);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator2 = new DistanceAndDirectionCalculator(origin, point2);

        double returnValue = distanceAndDirectionCalculator.direction();
        Assertions.assertEquals(0, returnValue);

        double returnValue2 = distanceAndDirectionCalculator2.direction();
        Assertions.assertEquals(0, returnValue2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator2 = new DistanceAndDirectionCalculator(origin, point2);


        double returnValue = distanceAndDirectionCalculator.direction();
        Assertions.assertEquals(Math.PI, returnValue);

        double returnValue2 = distanceAndDirectionCalculator2.direction();
        Assertions.assertEquals(Math.PI, returnValue2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        DistanceAndDirectionCalculator distanceAndDirectionCalculator = new DistanceAndDirectionCalculator(origin, point1);
        DistanceAndDirectionCalculator distanceAndDirectionCalculator2 = new DistanceAndDirectionCalculator(origin, point2);

        double returnValue = distanceAndDirectionCalculator.direction();
        Assertions.assertEquals(Math.PI / 2, returnValue);

        double returnValue2 = distanceAndDirectionCalculator2.direction();
        Assertions.assertEquals(Math.PI / 2, returnValue2);
    }
}
