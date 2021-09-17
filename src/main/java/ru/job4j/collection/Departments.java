package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        Set<String> tmp = new LinkedHashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start = start.length() >= el.length() - 1 ? start + "/" + el : el;
                tmp.add(start);
            }
        }
        List<String> strList = new ArrayList<>(tmp);
        sortAsc(strList);
        sortDesc(strList);
        return new ArrayList<>(tmp);
    }

    public static void sortAsc(List<String> orgs) {
        Collections.sort(orgs);
    }

    public static void sortDesc(List<String> orgs) {
        Collections.reverse(orgs);
        Collections.sort(orgs, new DepDescComp());
    }
}
