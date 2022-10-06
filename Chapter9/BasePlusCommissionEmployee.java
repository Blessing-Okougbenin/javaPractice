package Chapter9;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

//    six argument constructor
    public BasePlusCommissionEmployee(String firstName,String lastName,
                                      String socialSecurityNumber, double grossSales,
                                      double commissionRate, double baseSalary){
//        //explicit call to superclass commissionEmployee constructor
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be greater than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("Base salary must be greater than 0.0");
        }
        this.baseSalary = baseSalary;
    }
    // calculate earnings
    @Override
    public double earnings(){
        return  baseSalary + (getCommissionRate() * getGrossSales());
    }

    @Override
    public String toString(){
        return String.format(
                "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
                "base-salaried commission employee", getFirstName(), getLastName(),
                "social security number", getSocialSecurityNumber(),
                "gross sales", getGrossSales(), "commission rate", getCommissionRate(),
                "base salary", baseSalary
        );
    }

}
