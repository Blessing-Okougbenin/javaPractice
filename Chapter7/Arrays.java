package Chapter7;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 33, 6, 7, 55};
        int sum = 0;
        int average = 0;
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            sum += number;
            average = sum / numbers.length;
        }
        int indexOfMax = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
                indexOfMax = i;
            }
            if (min > numbers[i])
                min = numbers[i];
        }
        // random shuffling
        int temporary = 0;
        for (int i = numbers.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            temporary = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temporary;
        }
        System.out.println(temporary);
        System.out.println("The sum of the items is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The largest is " + max);
        System.out.println("The index of the largest number is " + indexOfMax);
        System.out.println("The smallest is " + min);

    }



//        creating and initializing an array
//        int[] myArray = new int[10];
//        int[] myArray2 = {1,2,4,5,6,7};

//        String[] stringArray = new String[5];
//        String[] stringArray2 = {"Hello", "World", "How"};

//        read operations
//        for (int i = 0; i < myArray2.length; i++) {
//            System.out.println(myArray2[i]);
//        }
//        for (int i = 0; i < stringArray2.length; i++) {
//            System.out.println(stringArray2[i]);
//        }
//        // we use the index of array elements for write operations
//        for (int i = 0; i < myArray2.length; i++) {
//            myArray2[1] = myArray2[i] * 20;
//        }



//        System.out.println("my array length is " +  myArray.length);
//        System.out.println("my array length is " +  myArray2.length);
//        System.out.println("my array length is " +  stringArray.length);
//        System.out.println("my array length is " +  stringArray2.length);
//        System.out.println("my array at index 0 " +  stringArray2[0]);
//        System.out.println("my stringArray2 at last index is " +  stringArray2[stringArray2.length - 1]);
//        System.out.println("my stringArray at last index  is " +  stringArray[stringArray.length - 1]);
//        System.out.println("my array at 0 is " + myArray[0]);
//        myArray[0] = 25;
//        System.out.println("my array at 0 is " + myArray[0]);
//        System.out.println("my array2 at 2 is " + myArray2[2]);
//        myArray2[2] = 50;
//        System.out.println("my array2 at 2 is " + myArray2[2]);


    }
