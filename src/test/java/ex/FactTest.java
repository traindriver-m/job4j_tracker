package ex;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenLessZero() {
        int rsl = new Fact().calc(-1);
    }
}