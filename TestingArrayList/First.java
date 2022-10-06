package TestingArrayList;

import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Volvo");
        Cars.add("Ford");
        Cars.add("BMW");
        for (String i: Cars) {
            System.out.println(i);
        }
//        try {
//            Cars.set(3,"Mine");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Incorrect index number");
//
//        }
        Cars.set(0, "Mine");
        System.out.println(Cars);
       Cars.remove(1);
        System.out.println(Cars);

        Cars.clear();
        System.out.println(Cars);





    }

}
