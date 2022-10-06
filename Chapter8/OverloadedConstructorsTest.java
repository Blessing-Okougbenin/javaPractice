package Chapter8;


public class OverloadedConstructorsTest {
    public static void main(String[] args) {
        OverloadedConstructors t1 = new OverloadedConstructors(); //00:00:00
        OverloadedConstructors t2 = new OverloadedConstructors(2); //02:00:00
        OverloadedConstructors t3 = new OverloadedConstructors(21, 34);
        OverloadedConstructors t4 = new OverloadedConstructors(12,25,42);
        OverloadedConstructors t5 = new OverloadedConstructors(t4);

        System.out.println("Constructed with:");
        displayTime("t1: all default arguments", t1);
        displayTime("t2: hour specified; default minute and second", t2);
        displayTime("t3: hour and minute specified; default second", t3);
        displayTime("t4: hour,minute and second specified ", t4);
        displayTime("t5: OverloadedConstructor object t4 specified ", t5);

        try {
            OverloadedConstructors t6 = new OverloadedConstructors(27,88,95);
        }
        catch (IllegalArgumentException precious) {
            System.out.printf("%nAn exception occurred: %s%n", precious.getMessage());
        }

    }

    static void displayTime(String header, OverloadedConstructors time2) {
        System.out.printf("%s%nUniversal time:%s%nStandard time:%s%n", header, time2.toUniversalString(), time2);
    }


}
