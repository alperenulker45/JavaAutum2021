package sef.FinalActivity;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test //This test will pass but exception message should be displayed because the name has a digit.
    public void testNameWithDigit() {
        Person person = new Person();
        try {
            person.setName("Kaspars3");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void testName() {
        Person person = new Person();
        try {
            person.setName("Alperen");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }

    }

    @Test
    public void testSurname() {
        Person person = new Person();
        person.setSurname("Ivanov");
        Assert.assertEquals("Ivanov", person.getSurname());
    }

    @Test
    public void testAge() {
        Person person = new Person();
        try {
            person.setAge(25);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }
        Assert.assertEquals(25, person.getAge());
    }

    @Test//This test will pass but exception message should be displayed because the age has a negative value
    public void testAgeNegative() {
        Person person = new Person();
        try {
            person.setAge(-3);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void testIntroduction() {
        Person person = new Person();
        try {
            person.setAge(24);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }
        person.setSurname("Davids");
        try {
            person.setName("Davids");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }

        String expected = "My name is Davids Davids and I am 24 years old";
        Assert.assertEquals(expected, person.introduceOfPerson());
    }
}
