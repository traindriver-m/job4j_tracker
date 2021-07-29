package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To3Then3() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4To2To5Then5() {
        int left = 4;
        int right = 2;
        int up = 5;
        int result = Max.max(left, right, up);
        int expected = 5;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax41To2To78To123Then123() {
        int left = 41;
        int right = 2;
        int up = 78;
        int down = 123;
        int result = Max.max(left, right, up, down);
        int expected = 123;
        Assert.assertEquals(expected, result);
    }
}