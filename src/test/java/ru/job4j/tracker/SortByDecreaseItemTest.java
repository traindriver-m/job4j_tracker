package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortByDecreaseItemTest {

    @Test
    public void byDecrease() {
        Tracker tracker = new Tracker();
        tracker.add(new Item("<<B>> "));
        tracker.add(new Item("<<A>> "));
        tracker.add(new Item("<<C>> "));
        List<Item> unsorted = new ArrayList<>(tracker.findAll());
        Collections.reverse(unsorted);
        List<Item> sorted = new ArrayList<>(tracker.findAll());
        Collections.sort(sorted, new SortByDecreaseItem());
        assertThat(unsorted, is(sorted));
    }
}