
 class A{
    public void show1() {
        System.out.println("Show1 method from class A");
    }
 }

    class B extends A {
        public void show2() {
            System.out.println("Show2 method from class B");
        }
    }

 class typeCastingOOps {

    public static void main(String[] args) {
        // Typecasting 
        System.out.println("Typecasting in Java");
        double d = 10.5;
       // int i = (int) d; // Explicit typecasting from double to int
        System.out.println("Double value: " + d);

        // Implicit typecasting
        int j = 100;
        long l = j; // Implicit typecasting from int to long
        System.out.println("Int value: " + j);
        System.out.println("Long value: " + l);
        System.out.println("***************************");


        // Object typecasting
        System.out.println("Object Typecasting in Java");
        A a = new A();
        B b = new B();
        a.show1(); // Calling method from class A
        b.show1(); // Calling method from class A through class B
        b.show2(); // Calling method from class B
        System.out.println("***************************");
        // Upcasting
        A a1 = b; // Upcasting B to A
        a1.show1(); // Calling method from class A
        // Downcasting
        B b1 = (B) a1; // Downcasting A back to B
        b1.show1(); // Calling method from class A
        b1.show2(); // Calling method from class B
        System.out.println("***************************");
        // Invalid Downcasting
        try {
            A a2 = new A();
            B b2 = (B) a2; // This will throw ClassCastException
            b2.show1();
        } catch (ClassCastException e) {
            System.out.println("Invalid Downcasting: " + e.getMessage());
        }
        System.out.println("***************************");
        // Instanceof operator
        // System.out.println("Using instanceof operator");
        // if (a1 instanceof B) {
        //     System.out.println("a1 is an instance of B");
        // } else {
        //     System.out.println("a1 is not an instance of B");
        // }
        // if (b1 instanceof A) {
        //     System.out.println("b1 is an instance of A");
        // } else {
        //     System.out.println("b1 is not an instance of A");
        // }
        // if (a2 instanceof B) {
        //     System.out.println("a2 is an instance of B");
        // } else {
        //     System.out.println("a2 is not an instance of B");
        // }
        // System.out.println("***************************");
        

    }
}