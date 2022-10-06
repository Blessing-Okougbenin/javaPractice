package Chapter17.Lambdas.human;

public class Main {
    public static void main(String[] args) {
//        Human h = new Man();
//        h.speak();
        Human h = ()-> System.out.println("I am still a man");
        h.speak();
//        Concept of polymorphism
        Human woman = ()-> System.out.println("I am a woman");
        woman.speak();
        Human boy = ()-> System.out.println("I am a boy");
        boy.speak();
        Human girl = ()-> System.out.println("I am a girl");
        girl.speak();
    }
}
