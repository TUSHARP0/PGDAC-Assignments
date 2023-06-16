package tester;

import employee.Employee;
import sampleData.SampleData;
import utils.ValidationRules;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import static utils.IOUtils.*;

public class Tester {
    static int idCounter;

    static {
        idCounter = 15;
    }

    public static void main(String[] args) {
        // Initializing a Try-with-resources block to Initialize Scanner
        try (Scanner in = new Scanner(System.in)) {

            // Initializing a Map
            // Restoring data from "enmployeeData" file into the Map
            Map<Integer, Employee> empDetailsMap = restoreEmployeeDetailsMap("employeeData.ser");

            // Initializing necessary variables
            boolean flag = true;
            int choice;

            System.out.println("Select an Operation: ");
            System.out.println("1. Hire a new Employee");
            System.out.println("2. List all Employee Details");
            System.out.println("3. Promote an Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Sort Employee as per Joining Date");
            System.out.println("9. Restore Sample Data");
            System.out.println("0. Exit");

            // Using while loop with a switch-case to implement the solution
            while (flag) {

                // Prompting user to provide an input
                System.out.println("\nEnter your selection: ");
                choice = in.nextInt();

                switch (choice) {

                    // Exit case
                    case 0:

                        // Storing the Map data into "enployeeData.ser" file
                        storeEmployeeDetailsMap("employeeData.ser", empDetailsMap);

                        System.out.println("----------Data Backup Initiated----------");
                        System.out.println("----------Data Backup Successful----------");
                        System.out.println("\n----------Exiting----------");
                        flag = false;

                        break;

                    // Hire Employee case
                    case 1:
                        try {
                            System.out.println("\n1. Hire a new Employee");

                            // Using idCOunter to Assign Id's to new Employees
                            idCounter++;
                            System.out.println("Enter the details of your employee: ");
                            in.nextLine(); // Skips the first in.nextLine() function

                            // Prompt user to provide required data for the new Employee
                            System.out.print("First Name: ");
                            String firstName = in.nextLine();

                            System.out.print("Last Name: ");
                            String lastName = in.nextLine();

                            System.out.print("Department: ");
                            String dept = in.nextLine();

                            System.out.print("Date of Joining: ");
                            String joiningDate = in.nextLine();

                            System.out.print("Salary: ");
                            double salary = in.nextDouble();

                            // Using Map's .putIfAbsent() method and ValidationRule.validateEmployee() method to pass the data, validate it and store it in the Map
                            empDetailsMap.putIfAbsent(idCounter, ValidationRules.validateEmployee(idCounter, firstName, lastName, dept, joiningDate, salary));

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;

                    // Display all details case
                    case 2:
                        System.out.println("\n2. List all Employee Details");

                        // Functional approach to the requirement to display all details
                        empDetailsMap.values().forEach(System.out::println);

                        break;

                    // Promote an Employee/Increase salary by 20% case
                    case 3:
                        System.out.println("\n3. Promote an Employee");
                        System.out.println("-----Employee List-----");

                        // Functional approach to the Employee id and name
                        empDetailsMap.values().forEach(employee -> System.out.println(employee.getId() + " " + employee.getFirstName()));

                        // Prompting user to Enter Employee id
                        System.out.println("\nEnter Employee Id of the Employee you wish to Promote: ");
                        int empId = in.nextInt();

                        // Increasing the salary by 20%
                        empDetailsMap.get(empId).setSalary(empDetailsMap.get(empId).getSalary() * 1.20);

                        break;

                    // Remove Employee case
                    case 4:
                        System.out.println("\n4. Remove Employee");

                        // Functional approach to the Employee id and name
                        System.out.println("-----Employee List-----");
                        empDetailsMap.values().forEach(employee -> System.out.println(employee.getId() + " " + employee.getFirstName()));

                        // Prompting user to provide Employee Id
                        System.out.println("Enter the Employee Id: ");
                        empId = in.nextInt();

                        // Using Meps' .remove() method to remove the Employee
                        empDetailsMap.remove(empId);

                        break;

                    // Sorting Employees based on Joining Date case
                    case 5:
                        System.out.println("\n5. Sort Employee as per Joining Date");

                        // Functional approach to Sort data based on Joining Date
                        empDetailsMap.values().stream()
                                .sorted((emp1, emp2) -> ((LocalDate) emp1.getJoiningDate()).compareTo(emp2.getJoiningDate()))
                                .forEach(System.out::println);

                        break;

                    // Restoring Data from the Sample Default Values case
                    case 9:
                        System.out.println("----------Restoring Sample Data----------");

                        // Using populateSampleDataMap() to replace existing data with Sample Default Values
                        empDetailsMap = SampleData.populateSampleDataMap();

                        // Displaying the Sample Data
                        empDetailsMap.values().stream()
                                .forEach(System.out::println);

                        System.out.println("\n----------Sample Data Restored----------");

                        break;

                    // Default case
                    default:
                        System.out.println("Invalid Selection");
                        System.out.println("Select an Operation: ");
                        System.out.println("1. Hire a new Employee");
                        System.out.println("2. List all Employee Details");
                        System.out.println("3. Promote an Employee");
                        System.out.println("4. Remove Employee");
                        System.out.println("5. Sort Employee as per Joining Date");
                        System.out.println("9. Restore Sample Data");
                        System.out.println("0. Exit");

                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
