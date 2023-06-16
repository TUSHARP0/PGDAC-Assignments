import java.time.LocalDate;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String subDate;
    private String email;
    private String password;
    private double registrationAmount;
    private LocalDate dob;
    private ServicePlan plan;

    private static int id_counter;

    static {
        id_counter = 233000;
    }

    // Customer Constructor
    public Customer(String firstName, String lastName, String subDate, String email, String password, double registrationAmount, String dob, String plan) {

        id_counter++;
        this.id = id_counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subDate = subDate;
        this.email = email;
        this.password = password;
        this.registrationAmount = registrationAmount;
        this.dob = LocalDate.parse(dob);
        this.plan = ServicePlan.valueOf(plan.toUpperCase());
    }

    // Overloaded Customer Constructor to Wrap Customer email
    public Customer(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "\nCustomer " +
                "[Customer Id: " + id +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Email Id: " + email +
                ", Password: " + password +
                ", Registration Amount: " + registrationAmount +
                ", Date of Birth: " + dob +
                ", Plan: " + plan+ "]\n";
    }

    // Declaration of necessary getter-setter methods

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubDate(){
        return subDate;
    }

    public String getEmail(){
        return email;
    }

    //Overriding Object.equals method
    @Override
    public boolean equals(Object o){
        if (o instanceof Customer){
            return this.email.equals(((Customer) o).email);
        }
        return false;
    }
}
