package CompositonExample;

public class Employee {
    private  String firstName;
    private String lastName;
    private  Date birthDate;
    private  Date hireDate;

    public Employee(String firstName,String lastName,Date birthDate,Date hireDate){
        this.firstName =  firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("%5s %5s%n Hired on:5%s%n Birthday: %5s",lastName,firstName,hireDate,birthDate);
    }
}
