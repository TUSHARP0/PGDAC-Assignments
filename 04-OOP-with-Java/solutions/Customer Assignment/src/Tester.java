import custom_exceptions.CustomerHandlingException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {

        // Using Try-with-resources block to initialize Scanner class
        try (Scanner in = new Scanner(System.in)) {

            // Initializing an Array List of Customer Object
            List<Customer> registerUsers = new ArrayList<>();

//            System.out.println(registerUsers);
//            System.out.println();

            // Adding Sample data to the ArrayList
            System.out.println("Would you like to use the Sample data set? Y/N");
            if (in.next().equalsIgnoreCase("Y"))
                registerUsers = SampleData.populateSampleData();
//            System.out.println(registerUsers);

            // You can uncomment the above sysout comments to see the before and after the Sample Data is added to the registerdUser ArrayList

            // Initializing exit boolean as false
            boolean exit = false;

            // Starting
            while (!exit) {
                try{
                // Printing options for the users
                System.out.println("\n Select an option: ");
                System.out.println("1. SignUp for the service");
                System.out.println("2. SignIn to your account");
                System.out.println("3. Change your account password");
                System.out.println("4. Unsubscribe from the service:");
                System.out.println("5. Display all the existing Customers Names");
                System.out.println("6. Remove Users' whose subscriptions have expired");
                System.out.println("0. Exit");

                System.out.println("\nEnter your Choice: ");
                int ch = in.nextInt();

                // Initiating Switch Case
                switch (ch) {

                    // Exiting case
                    case 0:
                        System.out.println("----------Exiting----------");
                        exit = true;

                        break;

                    // SignUp case
                    case 1:
                        try {
                            System.out.println("\n1. SignUp for the service");
                            System.out.println("Enter your details");

                            // first in.nextLine() to ensure that the function does not skip our input
                            in.nextLine();
                            System.out.print("First Name: ");
                            String firstName = in.nextLine();

                            System.out.print("Last Name: ");
                            String lastName = in.nextLine();

                            System.out.print("Date of Birth (YYYY-MM-DD): ");
                            String dob = in.nextLine();

                            System.out.print("Email Id: ");
                            String email = in.nextLine();

                            System.out.print("Password: ");
                            String password = in.nextLine();

                            System.out.println("\nChoose your plan from the following plans:");
                            for (ServicePlan plan : ServicePlan.values()) {
                                System.out.println(plan);
                            }
                            System.out.print("Enter your Selection: ");
                            String plan = in.nextLine().toUpperCase();
                            System.out.print("Amount to be Paid: ");
                            double registrationAmount = in.nextDouble();

                            System.out.println("Enter the Date of Subscription: ");
                            String subdate = in.nextLine();


                            registerUsers.add(ValidationRules.validateCustomerData(firstName, lastName, subdate, email, password, registrationAmount, dob, plan, registerUsers));
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(e.getMessage());
                        }
                        break;

                    // SignIn case
                    case 2:
                        try {
                            System.out.println("\n2. SignIn to your account");
                            System.out.print("Enter your Email Id: ");
                            // first in.nextLine() to ensure that the function does not skip our input
                            in.nextLine();
                            String email = in.nextLine();

                            // Finding the index of the Customer that matches the Email Id in our ArrayList
                            int index = registerUsers.indexOf(new Customer(email));

                            // indexOf returns -1 in case the value is not found in the ArrayList
                            // Hence if (index != -1) as the user for password and match it using the getPassword method and run it on the index we got from above
                            if (index != -1) {
                                System.out.print("Enter your Password " + registerUsers.get(index).getFirstName() + ": ");
                                String password = in.nextLine();

                                // Using equals method to match the Passwords
                                if (password.equals(registerUsers.get(index).getPassword())) {
                                    System.out.println("----------LogIn Successful----------");
                                    System.out.println("Welcome " + registerUsers.get(index).getFirstName() + " " + registerUsers.get(index).getLastName());

                                    // else case if the Password is incorrect
                                } else
                                    throw new CustomerHandlingException("Invalid Password!");

                                // else case if the Email Id is incorrect
                            } else
                                throw new CustomerHandlingException("Email Id not found. Please enter your registered Email Id or try Signing Up for the Services");
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(e.getMessage());
                        }
                        break;

                    // Change Password case
                    case 3:
                        try {
                            System.out.println("\n3. Change your account password");
                            System.out.println("Enter your Email Id: ");

                            // first in.nextLine() to ensure that the function does not skip our input
                            in.nextLine();
                            String email = in.nextLine();

                            // Finding the index of the Customer that matches the Email Id in our ArrayList
                            int index = registerUsers.indexOf(new Customer(email));

                            // indexOf returns -1 in case the value is not found in the ArrayList
                            // Hence if (index != -1) as the user for password and match it using the getPassword method and run it on the index we got from above
                            if (index != -1) {
                                System.out.print("Enter your new Password " + registerUsers.get(index).getFirstName() + ": ");

                                // using setPassword method to set a new Password
                                registerUsers.get(index).setPassword(in.nextLine());

                                // else case if the Email Id is incorrect
                            } else
                                throw new CustomerHandlingException("Email Id not found. Please try again");
                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println(e.getMessage());
                        }
                        break;

                    // Unsubscribe case
                    case 4:
                        System.out.println("\n4. Unsubscribe from the service: ");
                        System.out.print("Enter your Email Id: ");

                        // first in.nextLine() to ensure that the function does not skip our input
                        in.nextLine();
                        String email = in.nextLine();

                        // Finding the index of the Customer that matches the Email Id in our ArrayList
                        int index = registerUsers.indexOf(new Customer(email));

                        // indexOf returns -1 in case the value is not found in the ArrayList
                        // Hence if (index != -1) as the user for password and match it using the getPassword method and run it on the index we got from above
                        if (index != -1) {

                            // (Optional) Text message that is to be displayed to the user
                            System.out.println("You're Account and all the data will be deleted permanently.");
                            System.out.println("Hit Enter to delete all your data");

                            // (Optional) Taking Enter as an input from the user to
                            in.nextLine();

                            // Method to remove the user data from the ArrayList
                            registerUsers.remove(index);
                            System.out.println("----------Account Deleted----------");

                        } else
                            throw new CustomerHandlingException("Email Id not found!");
                        break;

                    // Display all names case
                    case 5:
//                        // This case was first solved using the Custom Exception Handling Principles, however, updated Assignment required this to be solved with the use of Lambda Expression
                        System.out.println("\n5. Display all the existing Customers: ");
                        System.out.println("Hit enter to display the data of all the existing Customers");
                        in.nextLine(); // This is skipped
                        in.nextLine(); // This is used to take Enter as an input from user
//
//                        // Using for-each loop to print the details of the users
//                        for (Customer c : registerUsers
//                        ) {
//                            System.out.println(c.toString()); // Using Overridden toString method to print the details
//                        }

//                        // Lambda Expression to print out the names of all the existing customers
                        registerUsers.forEach(customer -> System.out.println(customer.getFirstName()));
                        break;

                    // Removing Users whose Subscription has expired
                    case 6:
//                      // This case was first solved using the Custom Exception Handling Principles, however, updated Assignment required this to be solved with the use of Functional Programming
                        System.out.println("\n6. Remove Users' whose subscriptions have expired");
//                        System.out.println("User's whose Subscription has expired: ");
//
//                        ArrayList<Customer> usersWithExpiredSubscriptions = new ArrayList<>();
//
//                        for (Customer c : registerUsers
//                        ) {
//
//                            LocalDate newSubDate = LocalDate.parse(c.getSubDate());
//
//
//                            if (!LocalDate.now().isAfter(newSubDate.plusMonths(3))){
//                                System.out.println(c.getFirstName());
//
//                                usersWithExpiredSubscriptions.add(c);
//
//                            }
//
//                        }
//
//                        System.out.println("Click Enter to delete the user's data ");
//                        in.nextLine();
//                        in.nextLine();
//
//                        for (Customer c: usersWithExpiredSubscriptions
//                             ) {
//                            registerUsers.remove(c);
//                        }
//
                        System.out.println("\n----------Following Users with Expired Subscriptions Removed----------");

                        // Functional Program to display name of users whose Subscription has expired
                        registerUsers.stream()
                                .filter(customer -> LocalDate.now().minusMonths(3).isBefore(LocalDate.parse(customer.getSubDate())))
                                .forEach(customer -> System.out.println(customer.getFirstName()));
//                      // Functional Program to remove the users whose Subscription has expired
                        registerUsers.removeIf(customer -> LocalDate.now().minusMonths(3).isBefore(LocalDate.parse(customer.getSubDate())));
                        break;

                    // Default case
                    default:
                        System.out.println("Invalid selection, Please enter a valid option");

                    }
                }
                catch (Exception e){
                    e.printStackTrace();
                    System.out.println(e.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}