package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));

    }

    @Test
    public void whenNotFound() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        var persons = phones.find("Andrey");
        assertThat(persons, is(new ArrayList<Person>()));
    }

    @Test
    public void whenFindByPhone() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534572", "Bryansk")
        );
        phones.add(
                new Person("Petr", "Ivanov", "534872", "Bryansk")
        );
        var persons = phones.find("534872");
        assertThat(persons.get(0).getSurname(), is("Ivanov"));

    }

    @Test
    public void whenFindByAddress() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534572", "Bryansk")
        );
        phones.add(
                new Person("Petr", "Ivanov", "534872", "Tula")
        );
        var persons = phones.find("Bryansk");
        assertThat(persons.get(0).getPhone(), is("534572"));

    }

}