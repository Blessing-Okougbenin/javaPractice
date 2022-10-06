package CompositonExample;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(12,23,2019);
        Date hire = new Date(4,1,2024);
        Employee emp = new Employee("Sili","Ochuko",birth,hire);
        System.out.println(emp);
        //Class EmployeeTest creates two Date objects to represent
        // an Employee’s birthday and hire date.
    }
}
