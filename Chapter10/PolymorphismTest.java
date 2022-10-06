package Chapter10;

import Chapter9.BasePlusCommissionEmployee;
import Chapter9.CommissionEmployee;

public class PolymorphismTest {
    //Assign superclass reference to superclass variable
    CommissionEmployee commissionEmployee = new CommissionEmployee(
            "Sue","Jones","333",10000,.06);
    //assign subclass reference to subclass variable
    BasePlusCommissionEmployee basePlusCommissionEmployee = new
            BasePlusCommissionEmployee("Bob","Lewis","333444",5000,.04,300);


}
