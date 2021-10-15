package sef.FinalActivity;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ActivityClassEmployePersonStudent {

    public static void main(String[] args) throws Throwable {

        Employee employee1 = new Employee();
        employee1.setName("Alperen");
        employee1.setSurname("Ulker");
        employee1.setAge(31);
        employee1.setCompany("Freelance");
        employee1.setJobTitle("Test Automation");
        employee1.setSalary(1000);

        Employee employee2 = new Employee("Developer", 2000, "Accenture");
        employee2.setName("Davids");
        employee2.setSurname("Davids");
        employee2.setAge(27);

        Employee employee3 = new Employee("Business Manager", 1750, "ITfirm");
        employee3.setName("Maria");
        employee3.setSurname("Maria");
        employee3.setAge(35);

        Employee employee4 = new Employee("Product Owner", 2500, "ITsolutions");
        employee4.setName("Janis");
        employee4.setSurname("Janis");
        employee4.setAge(36);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);


        sortBySalaryTopToLess(employeeList); //Prints employees by salary from top to less
        sortByName(employeeList); //Prints names of employees by name
        saveListasTxt(employeeList);
    }

    public static void sortBySalaryTopToLess(List<Employee> e) {

        List<Integer> salaryList = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            salaryList.add(e.get(i).getSalary());
        }

        Collections.sort(salaryList);
        Collections.reverse(salaryList);

        for (int i = 0; i < salaryList.size(); i++) {
            for (int j = 0; j < e.size(); j++) {
                if (salaryList.get(i) == e.get(j).getSalary()) {
                    System.out.println(e.get(j).introduceOfPerson() + " My salary is " + e.get(j).getSalary());
                }
            }
        }
    }

    public static void sortByName(List<Employee> e) {
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < e.size(); i++) {
            nameList.add(e.get(i).getName());
        }

        Collections.sort(nameList);
        System.out.println(nameList);
    }

    public static void saveListasTxt(List<Employee> e) {

        try {

            FileOutputStream fos = new FileOutputStream("C:\\Users\\testeralpi\\OneDrive\\Desktop\\accenture bootcamp\\list.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();

        } catch (NotSerializableException exc) {
            System.out.println(exc.getMessage());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
