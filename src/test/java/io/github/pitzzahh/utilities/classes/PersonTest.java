package io.github.pitzzahh.utilities.classes;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void canCreateEmptyPerson() {
        Person person = Person.builder().build();
        System.out.println("person = " + person);
    }
}