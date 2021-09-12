package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortByIncreaseItemTest {

    @Test
    public void byIncrease() {
        Item first = new Item(1, "<<A>>");
        Item second = new Item(2, "<<B>>");
        Item third = new Item(3, "<<B>>");
        List<Item> unsorted = Arrays.asList(second, first, third);
        List<Item> sorted = List.of(first, second, third);
        Collections.sort(unsorted, new SortByIncreaseItem());
        assertEquals(sorted, unsorted);
    }
}
