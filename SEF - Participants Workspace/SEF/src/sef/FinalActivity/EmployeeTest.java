package sef.FinalActivity;

import org.junit.Assert;
import org.junit.Test;


public class EmployeeTest {

    @Test //This test will pass but exception message should be displayed because the name has digit
    public void testEmployeeNameWithDigits() {

        Employee employee = new Employee("developer", 3000, "Company");
        try {
            employee.setName("Alex5 De Souza");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    @Test
    public void testEmployeeSalary() {

        Employee employee = new Employee("developer", 3000, "Company");
        Assert.assertEquals(3000, employee.getSalary());
    }


    @Test
    public void testEmployeeTitle() {
        Employee employee = new Employee("developer", 3000, "Company");
        Assert.assertEquals("developer", employee.getJobTitle());
    }

    @Test
    public void testEmployeeCompany() {
        Employee employee = new Employee();
        employee.setCompany("Big Company");

        Assert.assertEquals("Big Company", employee.getCompany());
    }

    @Test
    public void testEmployeeAge() {
        Employee employee = new Employee();
        try {
            employee.setAge(23);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }

        Assert.assertTrue(employee.getAge() == 23);

    }

    @Test
    public void testEmployeeIntroduction() {
        Employee employee = new Employee("developer", 3000, "Company");
        try {
            employee.setAge(23);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }
        employee.setSurname("Alice");
        try {
            employee.setName("Alice");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            Assert.fail();
        }

        String expected = "My name is Alice Alice and I am 23 years old I work as developer in Company";
        Assert.assertEquals(expected, employee.introduceOfPerson());
    }
}
