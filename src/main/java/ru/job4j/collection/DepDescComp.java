package ru.job4j.collection;

import java.util.Collections;
import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] strOne = o1.split("/");
        String[] strTwo = o2.split("/");
        return strOne[0].compareTo(strTwo[0]) < 0 ? o2.compareTo(o1) : o1.compareTo(o2);
    }
}

