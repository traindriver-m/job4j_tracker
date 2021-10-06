package ru.job4j.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(s -> s.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(),
                        s.getSubjects().stream()
                                .mapToInt(Subject::getScore)
                                .average()
                                .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(f -> f.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(n -> new Tuple(n.getKey(), n.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(s -> new Tuple(s.getName(), s.getSubjects().stream()
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max(Tuple::compareTo)
                .orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(f -> f.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(n -> new Tuple(n.getKey(), n.getValue()))
                .max(Tuple::compareTo)
                .orElse(null);
    }
}

