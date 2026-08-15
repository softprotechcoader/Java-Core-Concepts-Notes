import java.util.function.Consumer;

class DemoMethods{
    public void printSquare(int side){
        System.out.println(side*side);
    }

}

public class InstanceMethodReference {
    public static void main(String[] args) {
        DemoMethods demo = new DemoMethods();
        Consumer<Integer> consumer = demo :: printSquare; // Reference to an Instance Method
        // Consumer<Integer> consumer = x -> demo.printSquare(x); // Reference to an Instance Method using Lambda Expression
        consumer.accept(8);
        

    }
}
