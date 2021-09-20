package ru.job4j.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> newFolders = new ArrayList<>();
        for (Folder folder : list) {
            if (pred.test(folder)) {
                newFolders.add(folder);
            }
        }
        return newFolders;
    }
}
