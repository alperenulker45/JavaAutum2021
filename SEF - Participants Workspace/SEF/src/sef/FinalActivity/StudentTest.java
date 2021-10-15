package sef.FinalActivity;

import org.junit.Assert;
import org.junit.Test;


public class StudentTest {

    @Test //This test will pass but exception message should be displayed because the name has digits
    public void testStudentNameWithDigits() {

        Student student = new Student("45. School", 9);
        try {
            student.setName("Maija12");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void testStudentAge() {

        Student student = new Student("45. School", 9);
        try {
            student.setAge(14);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        Assert.assertEquals(14, student.getAge());
    }

    @Test
    public void testStudentSchoolName() {
        Student student = new Student("45. School", 9);
        Assert.assertEquals("45. School", student.getSchoolName());
    }

    @Test
    public void testStudentSurname() {
        Student student = new Student();
        student.setSurname("Alex");
        Assert.assertEquals("Alex", student.getSurname());
    }

    @Test
    public void testIntroduction() {
        Student student = new Student("34. School", 9);
        try {
            student.setAge(23);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        student.setSurname("Alice");
        try {
            student.setName("Alice");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }

        String expected = "My name is Alice Alice and I am 23 years old I study in 34. School";
        Assert.assertEquals(expected, student.introduceOfPerson());
    }
}
