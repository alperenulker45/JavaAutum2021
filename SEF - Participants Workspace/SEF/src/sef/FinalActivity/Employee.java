package sef.FinalActivity;

public class Employee extends Person implements IHumanity {

    private String jobTitle;
    private int salary;
    private String company;
    private String address;


    //default constructor
    public Employee() {

    }

    //parametrized constructor
    public Employee(String jobTitle, int salary, String company) {
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.company = company;

    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String introduceOfPerson() {
        return super.introduceOfPerson() + " I work as " +
                this.getJobTitle() + " in " + this.getCompany();
    }

    @Override
    public String myAddress() {
        return "My address is " + this.getAddress();
    }
}
