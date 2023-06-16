package utils;

import employee.Employee;
import exception.EMSException;

import java.io.*;
import java.util.Map;

public class IOUtils {

    // Add a Static method to store the product details from the map using Ser
    public static void storeEmployeeDetailsMap(String fileName, Map<Integer, Employee> employeeDataMap) throws IOException {
        // Java App -> OOS -> FOS -> bin file

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(employeeDataMap);
        }
    }

    // Add a Static method to restoring product details, using de-ser from bin
    public static Map<Integer, Employee> restoreEmployeeDetailsMap(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Map<Integer, Employee>) in.readObject();
        }

    }
}
