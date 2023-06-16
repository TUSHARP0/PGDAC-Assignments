import custom_exceptions.CustomerHandlingException;

import java.time.LocalDate;
import java.util.List;

public class ValidationRules {

    // Declaration of one method that will call all the validation methods
    public static Customer validateCustomerData(String firstName, String lastName, String subDate, String email, String password, double registrationAmount, String dob, String plan, List<Customer> customerList) throws CustomerHandlingException {
        checkDuplicateCustomer(email, customerList);
        checkPlanAndAmount(registrationAmount, plan.toUpperCase());

        // This local Method was deprecated to match the requirements of the updated problem statement. You may however, uncomment it and check if need be
        // Do make sure to uncomment the method definition below as well
        // checkPlan(plan.toUpperCase());
        checkAge(dob, customerList);
        System.out.println("\nEmail Id Registered Successfully");

        // Return the Customer Object with the data required to fill in the details in the ArrayList
        return new Customer(firstName,lastName,subDate,email,password,registrationAmount,dob,plan.toUpperCase());
    }

    // No Duplicate Customers
    public static void checkDuplicateCustomer(String newEmail, List<Customer> customerList) throws CustomerHandlingException{
        Customer newCustomer = new Customer(newEmail);

        // As Email is our primary key and using .contains() match Email Id
        if (customerList.contains(newCustomer))
            throw new CustomerHandlingException("An account with this email has is already registered");

    }

    // Registration amount must match with the plan and if the plan is valid or not
    public static ServicePlan checkPlanAndAmount(double newAmount, String plan) throws CustomerHandlingException{

        // Parsing the String to get the Plan and using .getCharges() method to get the corresponding charges
        // using If condition to check if the amount is matching with the corresponding amount
        if (newAmount != ServicePlan.valueOf(plan.toUpperCase()).getCharges())
            throw new CustomerHandlingException("The plan amount does not match");

        // returning the Parsed Service Plan value
        return ServicePlan.valueOf(plan);
    }

    // Validate if plan is valid or not
//    public static ServicePlan checkPlan(String plan) throws IllegalArgumentException {
//        return ServicePlan.valueOf(plan.toUpperCase());
//    }

    // Customer's age must be greater than 18 years
    public static LocalDate checkAge(String dob, List<Customer> customerList) throws CustomerHandlingException{

        // Parsing the String input to get a LocalDate Object
        LocalDate newDOB = LocalDate.parse(dob);

        // Using the .now() method to get the current date
        // Using the .minusYears() method to subtract the required years from the current to get a reference date
        LocalDate checkDate = LocalDate.now().minusYears(18);

        // If the reference date is before the DOB then the condition fails
        if (checkDate.isBefore(newDOB))
            throw new CustomerHandlingException("You need to be 18 years of age to register");

        return newDOB;
    }


    public static void checkSubscription(String subDate) throws CustomerHandlingException{
        LocalDate newSubDate = LocalDate.parse(subDate);

        if (!LocalDate.now().isAfter(newSubDate.plusMonths(3)))
            throw new CustomerHandlingException("Subscription Expired!");

        else
            System.out.println("Subscription Valid");
    }


}
