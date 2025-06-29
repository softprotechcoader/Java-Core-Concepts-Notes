public class finalKeyword {
    // The 'final' keyword in Java is used to declare constants, prevent method overriding, and prevent inheritance.
    // It can be applied to variables, methods, and classes.

    // Example of final variable
    final int CONSTANT_VALUE = 100;

    // Example of final method
    final void display() {
        System.out.println("This is a final method.");
    }

    // Example of final class
    final class FinalClass {
        void show() {
            System.out.println("This is a final class.");
        }
    }

    public static void main(String[] args) {
        finalKeyword example = new finalKeyword();
        System.out.println("Constant Value: " + example.CONSTANT_VALUE);
        example.display();

        FinalClass finalClassInstance = example.new FinalClass();
        finalClassInstance.show();
    }
    
}
