
 // Encapsulation in Java
// Encapsulation is a fundamental concept in object-oriented programming that restricts direct access to an object's data and methods.
// It allows the internal representation of an object to be hidden from the outside, exposing only what is necessary through public methods.
// This is achieved by declaring class variables as private and providing public getter and setter methods to access and modify them.
// Example of encapsulation in Java
 class Human {

   private int age;    //achieve encapsulation by making variables private
   private String name;

    // Constructor
    public Human() {
        this.age = 0; // default age
        this.name = ""; // default name
    }

    public Human(int age, String name) { // parameterized constructor
        this.age = age;
        this.name = name;
    }

    public Human(String name) { // constructor with only name
        this.age = 20; // default age
        this.name = name;
    }



   public void setAge(int age, Human h) {    // setter to set the age

    //    h.age = age;  // using the instance of Human to set age we can use this keyword as well
       //This reference (h) is used to set the age of the current instance.
       this.age = age; // This would also work, but using the instance is more explicit
       
   }
    public int getAge() {
         return age;
    }
    public void setName(String n) {
         name = n;
    }
    public String getName() {
         return name;
    }

}
public class Encapasulation {
  public static void main(String[] args) {
    Human h1 = new Human();
    h1.setAge(25,h1);
    h1.setName("John Doe");
    System.out.println("Age: " + h1.getAge());
    System.out.println("Name: " + h1.getName());
    // h1.age = 30; // This line would cause an error because age is private
    // h1.name = "Jane Doe"; // This line would cause an error because name is private
    System.out.println("-----------------------------Constructor Overloading-----------------------------");

    Human h2 = new Human(30, "Alice");
    System.out.println("Age: " + h2.getAge());  

    System.out.println("Name: " + h2.getName());

    Human h3 = new Human("Bob");
    System.out.println("Age: " + h3.getAge());  // Default age is 20
    System.out.println("Name: " + h3.getName());  // Name is set to "Bob"

  }  
  
}
