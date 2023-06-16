public enum ServicePlan {

    // Declaring the Service Plan Enums
    SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

    // Declaring the charges variable to hold the corresponding charges of each plan
    private double charges;

    // Constructor declaration
    private ServicePlan(double charges){
        this.charges = charges;
    }

    // Declaring .getCharges() method
    public double getCharges() {
        return charges;
    }

    // (Optional) toString Override method to return Plan Name and Charges
    @Override
    public String toString(){
        return name() + " plan charges: " + charges;
    }
}
