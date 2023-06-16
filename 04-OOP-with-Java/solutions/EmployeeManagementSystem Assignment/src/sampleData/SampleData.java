package sampleData;

import employee.Employee;
import exception.EMSException;
import utils.ValidationRules;

import java.util.HashMap;
import java.util.Map;

public class SampleData {
    public static Map<Integer, Employee> populateSampleDataMap() throws EMSException {
        Map<Integer, Employee> sampleDataMap = new HashMap<>();
        sampleDataMap.put(1, ValidationRules.validateEmployee(1, "Abdul Ahad", "Sheikh", "Finance", "2021-03-04", 55000));
        sampleDataMap.put(3, ValidationRules.validateEmployee(3, "Tushar", "Pawar", "HR", "2021-04-03", 45000));
        sampleDataMap.put(4, ValidationRules.validateEmployee(4, "Mohan", "Talavar", "Sales", "2022-04-03", 35000));
        sampleDataMap.put(5, ValidationRules.validateEmployee(5, "Pranay", "Patil", "RnD", "2022-11-11", 46500));
        sampleDataMap.put(6, ValidationRules.validateEmployee(6, "Mohit", "Bijwar", "Production", "2023-03-02", 46500));
        sampleDataMap.put(7, ValidationRules.validateEmployee(7, "Rushikesh", "Mohite", "Finance", "2022-05-01", 56000));
        sampleDataMap.put(8, ValidationRules.validateEmployee(8, "Somesh", "Gandhi", "HR", "2020-12-10", 32500));
        sampleDataMap.put(9, ValidationRules.validateEmployee(9, "Bhushan", "Hippargi", "Sales", "2022-09-10", 47600));
        sampleDataMap.put(10, ValidationRules.validateEmployee(10, "Sakshi", "Palkar", "Rnd", "2022-04-12", 53900));
        sampleDataMap.put(11, ValidationRules.validateEmployee(11, "Ganesh", "Sagare", "Production", "2022-06-07", 45500));
        sampleDataMap.put(12, ValidationRules.validateEmployee(12, "Shrikant", "Badgujar", "Sales", "2021-04-03", 35500));
        sampleDataMap.put(13, ValidationRules.validateEmployee(13, "Mayur", "Patel", "Sales", "2022-07-08", 75000));
        sampleDataMap.put(14, ValidationRules.validateEmployee(14, "Sahil", "Patil", "Production", "2021-08-23", 98000));
        sampleDataMap.put(15, ValidationRules.validateEmployee(15, "Ojas", "Prajapne", "Sales", "2021-03-03", 105000));
        sampleDataMap.put(2, ValidationRules.validateEmployee(2, "Komal", "Kolhe", "Finance", "2020-10-27", 67000));

        return sampleDataMap;
    }
}
