class A{
    public A(){
        System.out.println("Constructor of class A");
    }
    public void display(){
        System.out.println("Display method of class A");
    }
}

public class anonymousObj {
    public static void main(String[] args) {
        new A();
        new A().display(); // This creates an anonymous object of class A and calls its display method
        // The object created by new A() is not stored in any variable, so it cannot be reused later.
    }
}
