package sef.FinalActivity;

public class Person {

    private String name;
    private String surname;
    private int age;

    //default constructor
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception {
        char[] chars = name.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                throw new Exception("Name can not contain digits");
            } else this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age >= 0) {
            this.age = age;
        } else throw new Exception("Age can not be less than 0");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String introduceOfPerson() {
        return "My name is " + this.getName() + " " + this.getSurname() + " and I am " + this.getAge() + " years old";
    }
}
