package ru.job4j.collection;

import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;

public class JobTest {
    @Test
    public void whenCompatorIncrByName() {
        Comparator<Job> cmpNameIncrName = new JobIncrByName();
        int rsl = cmpNameIncrName.compare(
                new Job("Fix bug", 1),
                new Job("Add task", 2)
        );
        assertThat(rsl, greaterThan((0)));
    }

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpDescrName = new JobDescByName();
        int rsl = cmpDescrName.compare(
                new Job("Fix bug", 1),
                new Job("Add task", 2)
        );
        assertThat(rsl, lessThan((0)));
    }

    @Test
    public void whenCompatorIncrByPriority() {
        Comparator<Job> cmpIncrPriority = new JobIncrByPriority();
        int rsl = cmpIncrPriority.compare(
                new Job("Fix bug", 1),
                new Job("Add task", 2)
        );
        assertThat(rsl, lessThan((0)));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> cmpDescrPriority = new JobDescByPriority();
        int rsl = cmpDescrPriority.compare(
                new Job("Fix bug", 1),
                new Job("Add task", 2)
        );
        assertThat(rsl, greaterThan((0)));
    }

    @Test
    public void whenCompatorDescByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().
                thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorIncrByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobIncrByName().
                thenComparing(new JobIncrByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("F", 0),
                new Job("F", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByProrityAndName() {
        Comparator<Job> cmpPriorityName = new JobDescByPriority().
                thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorIncrByProrityAndName() {
        Comparator<Job> cmpPriorityName = new JobIncrByPriority().
                thenComparing(new JobIncrByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}