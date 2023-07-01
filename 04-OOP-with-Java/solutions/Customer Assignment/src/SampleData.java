import java.util.ArrayList;
import java.util.List;

public class SampleData {

    // Declaration of populateSampleData method
    public static List<Customer> populateSampleData(){
        try{

            // Declaration of ArrayList
            ArrayList<Customer> sampleData = new ArrayList<>();

            // Passing Sample Data thought .validateCustomerData() method and adding it into the ArrayList
            sampleData.add(ValidationRules.validateCustomerData("Abdul Ahad", "Sheikh", "2023-03-15","abdulahadsheikh@xyz.com", "Abdul1234",5000,"1999-04-10","Diamond",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Bhushan", "Hippargi", "2023-04-17","bhushanhippargi@abc.com", "Bhushu2345",10000,"1997-07-04","Platinum",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Ganesh", "Sagare", "2023-03-21","ganeshsagare@abc.com", "Ganesh3456",2000,"1998-02-13","Gold",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Pranav", "Joshi", "2023-01-10","pranavjoshi@abc.com", "Pranav4567",10000,"1998-11-23","Platinum",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Komal", "Kolhe", "2023-05-03","komalkolhe@abc.com", "Komal5678",5000,"1997-10-27","Diamond",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Sakshi", "Palkar", "2023-02-11","sakshipalkar@abc.com", "Sakshi6789",1000,"1997-05-15","Silver",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Tushar", "Pawar", "2023-01-01","tusharpawar@abc.com", "Tushar7890",1000,"2001-01-19","Silver",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Mohan", "Talavar", "2023-05-01","mohantalavar@abc.com", "Mohan8901",5000,"1998-08-18","Diamond",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Pranay", "Patil", "2023-04-01","pranaypatil@abc.com", "Pranay9012",1000,"1996-09-09","Silver",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Rushikesh", "Mohite", "2022-02-10","rushikeshmohite@abc.com", "Rush0123",2000,"1999-04-10","Gold",sampleData));
            sampleData.add(ValidationRules.validateCustomerData("Mohit", "Bijwar", "2022-03-10","mohitbijwar@abc.com", "Mohit1234",10000,"2000-01-03","Platinum",sampleData));

            // Returning the ArrayList
            return sampleData;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
