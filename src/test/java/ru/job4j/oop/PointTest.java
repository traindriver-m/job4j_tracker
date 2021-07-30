package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        int x = 0;
        int y = 1;
        int twoX = 0;
        int twoY = 14;
        Point one = new Point(x, y);
        Point two = new Point(twoX, twoY);
        double expected = 13;
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3d() {
        int x = 0;
        int y = 2;
        int z = 4;
        int twoX = 0;
        int twoY = 4;
        int twoZ = 5;
        Point one = new Point(x, y, z);
        Point two = new Point(twoX, twoY, twoZ);
        double expected = 2.23;
        double out = one.distance3d(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}