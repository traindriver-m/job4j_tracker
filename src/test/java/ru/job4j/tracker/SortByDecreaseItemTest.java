package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByDecreaseItemTest {

    @Test
    public void byDecrease() {
        Item first = new Item(1, "<<A>>");
        Item second = new Item(2, "<<B>>");
        Item third = new Item(3, "<<B>>");
        List<Item> unsorted = Arrays.asList(second, third, first);
        List<Item> sorted = List.of(third, second, first);
        Collections.sort(unsorted, new SortByDecreaseItem());
        assertEquals(sorted, unsorted);
    }
}