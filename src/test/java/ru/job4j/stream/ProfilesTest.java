package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void collectAndSorted() {
        List<Address> expected = List.of(
                new Address("Kaluga", "Voskresenskaya", 14, 24),
                new Address("Kozelsk", "Krupskoy", 18, 1),
                new Address("Moscow", "Kluchevaya", 8, 212),
                new Address("Sharya", "Lenina", 95, 3),
                new Address("Tula", "Mosina", 29, 14)

        );
        List<Profile> profilesList = List.of(
                new Profile(new Address("Moscow", "Kluchevaya", 8, 212)),
                new Profile(new Address("Kozelsk", "Krupskoy", 18, 1)),
                new Profile(new Address("Sharya", "Lenina", 95, 3)),
                new Profile(new Address("Tula", "Mosina", 29, 14)),
                new Profile(new Address("Kaluga", "Voskresenskaya", 14, 24))
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profilesList);
        assertEquals(rsl, expected);
    }

    @Test
    public void collectAndUnicue() {
        List<Address> expected = List.of(
                new Address("Kaluga", "Voskresenskaya", 14, 24),
                new Address("Kozelsk", "Krupskoy", 18, 1),
                new Address("Moscow", "Kluchevaya", 8, 212),
                new Address("Sharya", "Lenina", 95, 3),
                new Address("Tula", "Mosina", 29, 14)

        );
        List<Profile> profilesList = List.of(
                new Profile(new Address("Moscow", "Kluchevaya", 8, 212)),
                new Profile(new Address("Kozelsk", "Krupskoy", 18, 1)),
                new Profile(new Address("Sharya", "Lenina", 95, 3)),
                new Profile(new Address("Tula", "Mosina", 29, 14)),
                new Profile(new Address("Kozelsk", "Krupskoy", 18, 1)),
                new Profile(new Address("Kaluga", "Voskresenskaya", 14, 24)),
                new Profile(new Address("Moscow", "Kluchevaya", 8, 212))
        );
        Profiles profiles = new Profiles();
        List<Address> rsl = profiles.collect(profilesList);
        assertEquals(rsl, expected);
    }
}