package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MatrixToListTest {

    @Test
    public void toList() {
        Integer[][] matrix = {{1, 2, 4, 9, 3}, {5, 2, 0, 33, 11}};
        List<Integer> expected = Arrays.asList(1, 2, 4, 9, 3, 5, 2, 0, 33, 11);
        List<Integer> rsl = new MatrixToList().convert(matrix);
        assertEquals(expected, rsl);
    }
}