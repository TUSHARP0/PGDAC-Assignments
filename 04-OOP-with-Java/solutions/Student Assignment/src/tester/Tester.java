package tester;

import static utils.StudentCollectionUtils.populateList;
import static utils.StudentCollectionUtils.populateMap;

import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;

import javax.swing.text.html.Option;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       // Displaying Student details from List
        List<Student> studentList = populateList();
        studentList.forEach(student -> System.out.println(student));

        System.out.println();

        // Displaying Student details from Map
        Map<String, Student> studentMap = populateMap(studentList);
        studentMap.forEach((s, student) -> System.out.println(student));

        System.out.println();

        // Sorting based on GPA
        studentList.stream()
                .sorted((s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa()))
                .forEach(student -> System.out.println(student));

        System.out.println();

        // Printing average of each subject

        System.out.println("Enter your subject");
        String subject = in.next().toUpperCase();

        OptionalDouble average = studentMap.values().stream()
                .filter(student -> student.getSubject().equals(Subject.valueOf(subject)))
                .mapToDouble(student -> student.getGpa()).average();

        System.out.println(average);

        // Displaying the topper of the specified subject

        Optional<Student> top = studentList.stream()
                .filter(student -> student.getSubject().equals(Subject.valueOf(subject)))
                .max((s1,s2) -> ((Double)s1.getGpa()).compareTo(s2.getGpa()));

        System.out.println(top);

        // Displaying number of failures of the specified subject

        Long count = studentList.stream()
                .filter(student -> student.getSubject().equals(Subject.valueOf(subject)))
                .filter(student -> (student.getGpa()<5))
                .count();

        System.out.println(count);

        System.out.println();

        // Displaying student names from the specified city

        System.out.println("Enter City");
        String city = in.next();

        studentList.stream()
                .filter(student -> student.getAddress().getCity().equalsIgnoreCase(city))
                .forEach(student -> System.out.println(student.getName()));

    }
}