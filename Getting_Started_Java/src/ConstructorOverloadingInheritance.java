import javax.lang.model.element.Name;

class BaseCO{
    String Name;
    int num;
    double marks;

    BaseCO(){

        System.out.println("This is Base Class");

    }
    BaseCO(String name, int num){

        this.Name = name;
        this.num =num;
        System.out.println("Values initialize for base Class: "+this.Name+"\n"+this.num);
    }
    BaseCO(double marks){
        this.marks = marks;
        System.out.println("Marks for Rohit Jaswal : "+this.marks);
    }
}
class Derived extends BaseCO{
    String name;
    int num;

    Derived(){
//        super(69.98);
        System.out.println("This is Derived Class");
    }
    Derived(String name,int num, double marks){
        super(69.98);
        this.Name = name;
        this.num = num;
        System.out.println("Values Initialize for Derived Class: "+this.Name+"\n"+this.num);
    }

}

public class ConstructorOverloadingInheritance extends Derived {
    public static void main(String[] args) {

        Derived derived = new Derived("Rohit",96,98.07);
//        BaseCO baseCO = new BaseCO("Rohit",69);
    }

}
