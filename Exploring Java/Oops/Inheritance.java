class Calculator {
    public int Addition(int a, int b) {
        return a + b;   
    }
    public int Subtraction(int a, int b) {
        return a - b;   
    }

    
}

 class AdvancedCalculator extends Calculator {
    public int Multiplication(int a, int b) {
        return a * b;   
    }
    public int Division(int a, int b) {
        if (b != 0) {
            return a / b;   
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0; // or throw an exception
        }
    }

    
}

class veryAdvancedCalculator extends AdvancedCalculator {
    public int Modulus(int a, int b) {
        return a % b;   
    }
    
    public int Power(int base, int exponent) {
        return (int) Math.pow(base, exponent);   
    }
    
    public double SquareRoot(double number) {
        return Math.sqrt(number);   
    }
}

public class Inheritance {
    public static void main(String[] args) {
        veryAdvancedCalculator vac = new veryAdvancedCalculator();
        System.out.println("Addition: " + vac.Addition(5, 3));
        System.out.println("Subtraction: " + vac.Subtraction(5, 3));
        System.out.println("Multiplication: " + vac.Multiplication(5, 3));
        System.out.println("Division: " + vac.Division(5, 3));
        System.out.println("Modulus: " + vac.Modulus(5, 3));
        System.out.println("Power: " + vac.Power(5, 3));
        System.out.println("Square Root: " + vac.SquareRoot(25));
    }

}
