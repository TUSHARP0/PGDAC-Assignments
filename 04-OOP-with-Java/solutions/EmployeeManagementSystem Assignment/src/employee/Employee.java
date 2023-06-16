package employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private static int idCounter;
    private int id;
    private String firstName;
    private String lastName;
    private Dept dept;
    private LocalDate joiningDate;
    private double salary;

    public Employee(int id, String firstName, String lastName, Dept dept, LocalDate joiningDate, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.joiningDate = joiningDate;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Dept getDept() {
        return dept;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + id +
                ", First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Department=" + dept +
                ", Joining Date=" + joiningDate +
                ", Salary=" + salary +
                '}';
    }
}
