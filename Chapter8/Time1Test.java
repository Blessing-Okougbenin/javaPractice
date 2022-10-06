package Chapter8;

public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();
       // OverloadedConstructors time2 = new OverloadedConstructors(13,14,57);
        displayTime("After time object was created",time);
        System.out.println();
        time.setTime(13,27,16);
        displayTime("After time object was created",time);
        System.out.println();
        try {
            time.setTime(25,67,67);
        }
        catch (IllegalArgumentException e) {
            System.out.printf("Exception : %s%n", e.getMessage());
        }
        displayTime("After an invalid time was set : ", time);
        //time.hour = 17 // cannot access it because hour has private access in the class Time1
        // An attempt by a method that’s not a member of a class to access a private member of that
        //class generates a compilation error.When an instance method is called for a particular object, the method’s body
        //implicitly uses keyword this to refer to the object’s instance variables and other methods.
    }

     static void displayTime(String header, Time1 time) {
        System.out.printf("%s%nUniversal time:%s%nStandard time:%s%n", header, time.toUniversalString(), time);
    }


}
