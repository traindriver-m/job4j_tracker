package ru.job4j.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));

    }

    @Test
    public void whenNotFound() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Andrey");
        assertThat(persons, is(new ArrayList<Person>()));
    }

    @Test
    public void whenFindByPhone() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534572", "Bryansk")
        );
        phones.add(
                new Person("Petr", "Ivanov", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("534872");
        assertThat(persons.get(0).getSurname(), is("Ivanov"));

    }

    @Test
    public void whenFindByAddress() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534572", "Bryansk")
        );
        phones.add(
                new Person("Petr", "Ivanov", "534872", "Tula")
        );
        ArrayList<Person> persons = phones.find("Bryansk");
        assertThat(persons.get(0).getPhone(), is("534572"));

    }

}