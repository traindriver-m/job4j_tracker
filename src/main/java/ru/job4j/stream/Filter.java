package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, -8, 16, -2, -29, 11, 74, -7);
        list = list.stream().filter(el -> el > 0).collect(Collectors.toList());
    }
}
