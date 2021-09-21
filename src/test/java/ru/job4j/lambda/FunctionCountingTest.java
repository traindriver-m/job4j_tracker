package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionCountingTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(3, 7, x -> x * x);
        List<Double> expected = Arrays.asList(9D, 16D, 25D, 36D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        FunctionCounting function = new FunctionCounting();
        List<Double> result = function.diapason(2, 6, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D, 32D);
        assertThat(result, is(expected));
    }
}