package Chapter17.Lambdas.staffs;

public class main4 {
    public static void main(String[] args) {
//       Method referencing-overTime(hours);
        Staff moji = main4::overTime;
        moji.work(3);
    }

    private static void overTime(int hours){
        int doubleWorkingHours = hours*2;
        System.out.println("I work here for "+ doubleWorkingHours + "hours.");
    }
}
