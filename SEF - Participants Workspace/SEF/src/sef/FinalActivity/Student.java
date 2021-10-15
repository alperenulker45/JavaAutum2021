package sef.FinalActivity;

public class Student extends Person implements IHumanity {

    private String schoolName;
    private int grade;
    private String address;

    //default constructor
    public Student() {
    }

    //parametrized constructor
    public Student(String schoolName, int grade) {
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String introduceOfPerson() {
        return super.introduceOfPerson() + " I study in " + this.getSchoolName();
    }

    @Override
    public String myAddress() {
        return "My address is " + this.getAddress();
    }
}
