import java.util.function.Function;
// Static Method Reference: It is used to refer to a static method of a class. The syntax for static method reference is ClassName::methodName. It can be used in place of a lambda expression that calls a static method.
class Calculate {
    public static int printSquare(int side){
        return side*side;
    }
}

class StaticMethodReference {
    public static void main(String[] args) {
        // Function<Integer,Integer> func = Calculate :: printSquare; // Reference to a Static Method
        Function<Integer,Integer> func = x -> Calculate.printSquare(x); // Reference to a Static Method using Lambda Expression
        System.out.println(func.apply(8));
    }

}

