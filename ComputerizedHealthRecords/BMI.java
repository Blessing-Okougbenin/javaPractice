 package ComputerizedHealthRecords;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BMI {
    private String fullName;
    private int age;
    private double height;
    private double weight;
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private final Scanner scanner = new Scanner(System.in);

    public void calculateBmi(){

        try{
            display("In order to check your body mass index, ");
            display("Please input your full name: ");
            fullName = scanner.nextLine();
            display(fullName + " Please enter your age: ");
            age = scanner.nextInt();
            display("Please state your gender: ");
            gender = scanner.next();
            display("Please enter your height in centimeters (cm): ");
            height = scanner.nextInt();
            display("Please enter your weight in kilograms (kg): ");
            weight = scanner.nextInt();

            double bmi = weight / ((height/100) * (height/100));
            double roundOff = (double) Math.round(bmi * 10) / 10;

            display("Full name: "+ fullName +"\n"+
                    "Age:" + age + "\n"+
                    "Height: " +  height + "\n" +
                    "Weight: " +  weight + "\n" +
                    "Gender: " + gender);
            display("Your Body Mass Index is : " + bmi + "-->" + roundOff+"kg/m^2");

        }catch (InputMismatchException err){
            System.out.println(err.getMessage());
        }
    }

    public static  void display(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.calculateBmi();
    }
}
