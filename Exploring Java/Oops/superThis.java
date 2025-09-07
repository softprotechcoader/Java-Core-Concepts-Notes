class A{
    public A(){
        super(); // calls the constructor of object class
        // This is optional as Java automatically calls the super constructor if not explicitly called.
        //by default every class in Java extends the Object class, which is the root of the class hierarchy.
        // The super() call is used to invoke the constructor of the superclass.
        System.out.println("Constructor of class A");
    }
    public A(int x){
        // this(); // Calls the no-argument constructor of class A
        System.out.println("Constructor of class A with parameter: " + x);
    }
}

class B extends A{
    public B(){
        super(1); // when this constructor is called, it will call the parameterized constructor of class A
        // If you want to call the no-argument constructor of class A, you can use super();
        // this(); // This would call the no-argument constructor of class A, but it's not necessary here
        // If you want to call the no-argument constructor of class A, you can use super();
        // If you want to call the parameterized constructor of class A, you can use super(x);
        System.out.println("Constructor of class B");
    }
    public B(int x){
        super(); // Calls the parameterized constructor of class A
        System.out.println("Constructor of class B with parameter: " + x);
    }
}

class C extends B{
    public C(){
        super(); // Calls the constructor of class B, which in turn calls the constructor of class A
        System.out.println("Constructor of class C");
    }
    public C(int x){
        // super(x); // Calls the parameterized constructor of class B
        this(); // this function will execute the constructor of this class
        
        System.out.println("Constructor of class C with parameter: " + x);
    }
}
public class superThis {
    public static void main(String[] args) {
       // C obj1 = new C(6); // This will call the constructor of C, which calls B's constructor, which calls A's constructor
        

    }
}
