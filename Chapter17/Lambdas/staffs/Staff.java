package Chapter17.Lambdas.staffs;
@FunctionalInterface
public interface Staff {
    void work(int hours);

    static void assist(){
        System.out.println("I am an assistant");
    }

    default int getAge(){
        return 5;
    }

}
