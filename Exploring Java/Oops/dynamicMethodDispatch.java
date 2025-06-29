 class a1{
        void display() {
            System.out.println("Display method in class A");
        }
    }


class b1 extends a1 {
        void display() {
            System.out.println("Display method in class B");
        }
    }

class c1 extends a1 {
        void display() {
            System.out.println("Display method in class C");
        }
    }
public class dynamicMethodDispatch {
    public static void main(String[] args) {

        // Dynamic Method Dispatch Example
        // Here, we create a reference of type 'a' and assign it objects of type 'b' and 'c'
        // The display method will be called based on the actual object type at runtime

        a1 obj1 = new a1(); // Object of type 'a'
        obj1.display(); // Calls display method in class A

        a1 obj2 = new b1(); // Object of type 'b'
        obj2.display(); // Calls display method in class B
    
        a1 obj; // Reference of type 'a'
        
        obj = new b1(); // Object of type 'b'
        obj.display(); // Calls display method in class B
        
        obj = new c1(); // Object of type 'c'
        obj.display(); // Calls display method in class C
        
        obj = new a1(); // Object of type 'a'
        obj.display(); // Calls display method in class A

// Dynamic method dispatch allows us to call overridden methods at runtime based on the actual object type
        // This is a key feature of polymorphism in Java
        // It allows for flexibility and extensibility in code design, enabling us to write more generic and reusable code.
        // This is a key feature of polymorphism in Java, allowing for flexibility and extensibility in code design.
        // It enables us to write more generic and reusable code.
        // This is a key feature of polymorphism in Java, allowing for flexibility and extensibility in code design.
        // It enables us to write more generic and reusable code.
        // Dynamic method dispatch is a powerful feature in Java that allows us to call overridden methods at runtime based on the actual object type.
       

     }
    }
