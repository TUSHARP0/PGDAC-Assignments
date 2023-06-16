package utils;

import employee.Dept;
import employee.Employee;
import exception.EMSException;

import java.time.LocalDate;

public class ValidationRules {

    public static Employee validateEmployee(int id, String firstName, String lastName, String dept, String joiningDate, double salary) throws EMSException {
        LocalDate newJoiningDate = validateJoiningDate(joiningDate);
        Dept newDept = validateDept(dept);
        return new Employee(id, firstName, lastName, newDept, newJoiningDate, salary);
    }

    public static LocalDate validateJoiningDate(String joiningDate) throws EMSException {
        LocalDate refDate = LocalDate.now().minusYears(3);
        LocalDate newJoiningDate = LocalDate.parse(joiningDate);

        if (newJoiningDate.isAfter(refDate))
            return newJoiningDate;
        throw new EMSException("Invalid Joining Date.\nJoining Date can not be any older than " + refDate + "\nPlease Enter a Valid Joining Date.");
    }

    public static employee.Dept validateDept(String dept) {
        return Dept.valueOf(dept.toUpperCase());
    }

}
