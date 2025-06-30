// This code demonstrates the use of an inner class in Java.

class A{
    void display() {
        System.out.println("Display method of class A");
    }

    class B{
        void show() {
            System.out.println("This is the show method of inner class B");
        }
    }
}
// InnerClass.java 
// This code demonstrates the use of an inner class in Java.

class InnerClass{
    public static void main(String[] args) {
        System.out.println(" Inner class example");

        A obj = new A();
        obj.display();

        // A.B b = a.new B();
        A.B b = obj.new B();
        b.show();
        System.out.println("End of Inner class example");
    }
}