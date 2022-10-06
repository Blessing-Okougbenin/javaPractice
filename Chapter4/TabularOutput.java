package Chapter4;

public class TabularOutput {
        public static void main(String[] args) {
            System.out.printf("%s%10s%10s%10s","number","square","triple","quadruple");
            System.out.println();
            tableOfValues();
        }


    private static void tableOfValues() {
            int i;
        for ( i = 1; i <= 5; i++) {
            int square = i * i;
            int triple = i * i * i;
            int quadruple = i * i * i * i;
            System.out.printf("%4d%10d%10d%10d%n",i, square, triple, quadruple);
        }
    }


}
