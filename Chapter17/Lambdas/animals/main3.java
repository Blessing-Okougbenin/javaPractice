package Chapter17.Lambdas.animals;

public class main3 {
    public static void main(String[] args) {
//        method reference
        Animal cat = System.out::println;
//        Animal cat = (sound)-> System.out.println("This is my sound: " + sound);
        cat.speak("meow");
    }
}
