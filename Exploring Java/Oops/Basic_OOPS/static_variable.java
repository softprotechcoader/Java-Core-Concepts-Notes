
class Mobile{
    // These variables are instance variables
    String brand;
    int price;
    // String name;
    static String name;

    static{
        System.out.println("In statick block");
        name = "iPhone 15+";
    }

    Mobile() { // Constructor
        System.out.println("In Constructor");
        brand = "Apple";
        price = 200;
    }

    public void show(){     //This type of method called instance method
        // if we put any variable here, it will be considered as a local variable
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);

    }
    // static method
    public static void showStatic(Mobile m) {
        System.out.println("This is a static method.");
        System.out.println("Brand: " + m.brand);
        System.out.println("Price: " + m.price);
        System.out.println("Name: " + name);
    }
}

public class static_variable {
public static void main(String[] args) {
    Mobile m1 = new Mobile();
    m1.brand = "Samsung";
    m1.price = 30000;
    // m1.name = "Galaxy S21";  // Static variable is shared across all instances, so we don't set it here

    Mobile m2 = new Mobile();
    m2.brand = "Apple";
    m2.price = 80000;
    // m2.name = "iPhone 13";  // Static variable is shared across all instances, so we don't set it here

    // m1.name = "Phone"; // Changing the static variable will affect all instances of Mobile

    m1.show();
    m2.show();
    Mobile.showStatic(m1); // Calling the static method with an instance of Mobile providing reference to the instance
}

}
