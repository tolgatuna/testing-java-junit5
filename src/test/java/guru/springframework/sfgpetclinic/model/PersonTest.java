package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAssertions() {
        // given
        Person person = new Person(1L, "Joe", "Buck");
        assertAll("Test Props Set",
                () -> assertEquals(person.getFirstName(), "Joe"),
                () -> assertEquals(person.getLastName(), "Buck")
                );
    }

    @Disabled
    @Test
    void groupedAssertionsWithFail() {
        // given
        Person person = new Person(1L, "Joe", "Buck");
        assertAll("Test Props Set - Part 2",
                () -> assertEquals(person.getFirstName(), "Jack"),
                () -> assertEquals(person.getLastName(), "Buck")
        );
    }


}