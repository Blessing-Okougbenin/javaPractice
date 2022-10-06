package Chapter17.Lambdas.vehicle;

public class Main2 {
    public static void main(String[] args) {
        Vehicles car = ( speed, name)-> System.out.println("I am a " + name + " running at "+ speed +"m/s");
        car.move(60, "Toyota");
    }
}
