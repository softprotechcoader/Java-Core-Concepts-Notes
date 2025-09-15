// This code demonstrates the use of the Object class in Java, including methods like toString(), equals(), and hashCode().
// It defines a Laptop class with attributes and overrides the Object class methods to provide custom behavior.
//// The main method creates instances of Laptop, sets their attributes, and demonstrates the behavior of the overridden methods.
/// // The output will show how the instances compare to each other and how the methods behave when called.
/// 
// 
class Laptop {    //
    public String brand;
    public String model;
    public int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((brand == null) ? 0 : brand.hashCode());
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    @Override
    public String toString() {
        System.out.println("toString() method called");
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public boolean compare (Laptop other) {
        if (this.brand.equals(other.brand) && this.model.equals(other.model) && this.price == other.price) {
            return true;
        }
        return false;
    }


}

public class objectClass {
    public static void main(String[] args) {
        Laptop lp1 = new Laptop();
        System.out.println(lp1);

        Laptop lp2 = new Laptop();
        System.out.println(lp2);

        Laptop lp3 = new Laptop();
        System.out.println(lp3);
         lp3.brand = "Dell";
         lp3.model = "XPS 13";
         lp3.price = 1200;

        

      System.out.println("lp1 == lp2: " + (lp1 == lp2));
        lp1.brand = "Dell";
        lp1.model = "XPS 13";
        lp1.price = 1200;

        lp2.brand = "Apple";
        lp2.model = "MacBook Pro";
        lp2.price = 1500;



        System.out.println("lp1 brand: " + lp1.brand);
        System.out.println("lp2 brand: " + lp2.brand);
        
        System.out.println("lp1 == lp2 after assignment: " + (lp1 == lp2));

        System.out.println("Compared lp1 and lp2: \n" + lp1.equals(lp2) );

        System.out.println("Hashcode of lp1: " + lp1.hashCode());
        System.out.println("Hashcode of lp2: " + lp2.hashCode());
        System.out.println("lp1: " + lp1);
        System.out.println("lp2: " + lp2);
        System.out.println("lp1 == lp2 after toString: " + (lp1 == lp2));
        System.out.println("lp1.equals(lp2): " + lp1.equals(lp2));
        System.out.println("lp1.hashCode() == lp2.hashCode(): " + (lp1.hashCode() == lp2.hashCode()));
        System.out.println("lp1.toString() == lp2.toString(): " + (lp1.toString().equals(lp2.toString())));
        System.out.println("lp1.toString() == lp2.toString(): " + (lp1.toString() == lp2.toString()));
        System.out.println("lp1.toString() == lp2.toString(): " + (lp1.toString() == lp2.toString()));
        System.out.println("lp1.toString() == lp2.toString(): " + (lp1.toString() == lp2.toString()));
        
        System.out.println("********************************************************************");
        
    
        System.out.println("Object Comparison Result: " + lp1.compare(lp2));
        System.out.println("Object Comparison Result: " + lp1.compare(lp3));
      
    }
}
