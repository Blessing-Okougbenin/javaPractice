package Chapter9;

public class CommissionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSales;
    private double commissionRate;

//    five-argument constructor
    public CommissionEmployee(String firstName,String lastName,String socialSecurityNumber,
                              double grossSales, double commissionRate){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales muxt be greater" +
                    ">= 0.0");
        }
        if(commissionRate <= 0.0 || commissionRate >= 1.0){
            throw new IllegalArgumentException("Commision" +
                    "rate must be > 0.0 and <1.0");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setGrossSales(double grossSales){
        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales " +
                    "must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate <= 0.0 || commissionRate >= 0.0){
            throw new IllegalArgumentException("Commission rate " +
                    "must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
                "commission employee",getFirstName(),getLastName()
               ,"social security number",getSocialSecurityNumber(),
                "gross sales",getGrossSales(),
                "commission rate",getCommissionRate());
        }
}
