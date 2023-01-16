package org.Person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class TestCreatePerson {

    public Person personaObject(){
        return new Person("Sergi","Aznale",39);
    }

    @Test
    public void getFirstNameTest(){
        Person persona = personaObject();
        Assertions.assertEquals("Sergi",persona.getFirstName());
    }

    @Test
    public void getLastNameTest(){
        Person persona = personaObject();
        Assertions.assertEquals("Aznale",persona.getLastName());
    }

    @Test
    public void  getAgeTest(){
        Person persona = personaObject();
        Assertions.assertEquals(39,persona.getAge());
    }

    @Test
    public void becomeOlderTest(){
        Person persona = personaObject();
        persona.becomeOlder();
        Assertions.assertEquals(44,persona.getAge());
    }

    @Test
    public void killVampireTest(){
        Person person = personaObject();
        person.killVampire();
        Assertions.assertEquals(-150,person.getAge());
    }

    @Test
    public void withFirstNameTest(){
        Person person = personaObject();
        Assertions.assertEquals(person,person.withFirstName("Sergi"));
    }

    @Test
    public void withLastNameTest(){
        Person person = personaObject();
        Assertions.assertEquals(person,person.withLastName("Aznale"));
    }


}
