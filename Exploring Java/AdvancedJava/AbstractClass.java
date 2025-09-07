package AdvancedJava; // Ensure this file is part of a project

abstract class Car{
    // Abstract class Car with an abstract method and a concrete method
    public void drive(){
        System.out.println("Driving the car");
    };
    // Abstract method that must be implemented by subclasses
    public void music(){
        System.out.println("Playing music in the car");
    }
    // Abstract method that must be implemented by subclasses
    public abstract void fly();       // This method is not applicable for a car, but included for demonstration
}

// Concrete class that extends the abstract class Car
class SupperCar extends Car {
    // Concrete implementation of the abstract method
    @Override
    public void fly() {
        System.out.println("Flying the super car");
    }
}


// Main class to demonstrate the use of abstract classes in Java
class AbstractClass {    // Class names should start with an uppercase letter
    public static void main(String[] args) {
        System.out.println("Exploring Abstract Classes in Java");

        // Creating an instance of the concrete class SupperCar
        SupperCar myCar = new SupperCar();
        // Calling the concrete method from the abstract class
        myCar.drive();
        // Calling the abstract method implemented in the concrete class
        myCar.music();
        // Calling the concrete method implemented in the concrete class
        myCar.fly();
        // Note: You cannot create an instance of the abstract class Car directly
        // Car myCar2 = new Car(); // This line would cause a compilation error
        // Instead, you must create an instance of a subclass that implements the abstract methods
        System.out.println("Abstract class demonstration completed successfully.");

    }
}

