class Calculater{

    int a; //This is the property of the class it knows something about itself.
            // here this in an instance variable, it is a property of the class.

    public int add(int n1 , int n2){   // This is a method of the class, it does something.
        System.out.println("This is a simple addition method.");
        return n1 + n2;  // This method returns the sum of two numbers.
    }
}

public class Demo {

    public static void main(String[] args) {
      int num1 = 5;   //premitive variable
      int num2 = 10;
      int sum;
        Calculater calc = new Calculater();     // here calc is reference variable, it refers to the object of the class Calculater.
        sum = calc.add(num1 , num2);
        
        System.out.println("The sum is: "+sum); // This will print the sum of num1 and num2.

        System.out.println("*********Experimenting with array of objects*********");

        Students s1 = new Students(); // Creating an instance of the Students class.
        s1.name = "John"; // Setting the name property of the Students instance.
        s1.age = 20; // Setting the age property of the Students instance.
        s1.grade = "A"; // Setting the grade property of the Students instance.
        
        Students s2 = new Students(); // Creating another instance of the Students class.
        s2.name = "Alice"; // Setting the name property of the second Students instance.
        s2.age = 22; // Setting the age property of the second Students instance.
        s2.grade = "B"; // Setting the grade property of the second Students instance.

        Students s3 = new Students(); // Creating a third instance of the Students class.
        s3.name = "Bob"; // Setting the name property of the third Students instance.
        s3.age = 21; // Setting the age property of the third Students instance.
        s3.grade = "C"; // Setting the grade property of the third Students instance.

        // Creating an array of Students objects to hold multiple students.

        Students[] studentArray = new Students[3]; // Array to hold 3 Students objects.
        studentArray[0] = s1; // Assigning the first Students object to the array.
        studentArray[1] = s2; // Assigning the second Students object to the array.
        studentArray[2] = s3; // Assigning the third Students object to the array.

        // Displaying the details of each student in the array.
        // for (int i = 0; i<studentArray.length; i++){
        //     System.out.println(studentArray[i].name + " is " + studentArray[i].age + " years old and has a grade of " + studentArray[i].grade + ".");
        // }
  
        for(Students student : studentArray) { // Using enhanced for loop to iterate through the array of Students objects.
            System.out.println(student.name + " is " + student.age + " years old and has a grade of " + student.grade + ".");
        }
    }

  
}