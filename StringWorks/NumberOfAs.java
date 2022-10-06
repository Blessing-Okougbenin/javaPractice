package StringWorks;

public class NumberOfAs {
    static final char[] stringName = {'a','b','c','d','a','b','c','d','a','b','c','a'};
    //under the hood, a string is made up of characters
    static String s = new String(stringName);

    private static final char[] myName = {'B','L','E','S','S','I','N','G'};
    static String string = new String(myName);
    static int sum = 0;

    public static void main(String[] args) {
        int count = 0; // counter
        for (int i = 0; i <=  string.length() - 1; i++) {
            if (string.charAt(i) == 'S'){
                System.out.println(string.trim().toLowerCase());
                sum = ++count;
            }
        }

        System.out.printf("The number of S's is: %d",sum);


    }
}
