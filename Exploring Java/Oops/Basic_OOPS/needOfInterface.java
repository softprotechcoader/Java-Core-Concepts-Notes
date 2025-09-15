// I one .java file we can't have multiple Public class
class Developer {
//    public void devApp(Laptop laptop){
public void devApp(Computer comp){
        // System.out.println("Coding.....");
        // laptop.code();
        comp.code();
    }

    
}

//  abstract class Computer{  // here as we can ovserve method is not been defined; so we can make it abstract and simply declear.
//     // public void code(){

//     // }
//     public abstract void code();
//  }

// Now we can also achive the same using interface
 interface Computer {
    void code();     // in interface internaly all method is abstracte and public
    
}
 class Laptop  /* extends */ implements Computer {

    public void code(){
        System.out.println("Coding on Laptop: Code , Compile , run");
    }
}
class Desktop /* extends */ implements Computer{
    public void code(){
        System.out.println("Coding on Desktop : Code , Compile, Run: Faster & Convinient");
    }
}
public class needOfInterface {
    public static void main(String[] args) {
        // Laptop lap = new Laptop();
        // Desktop desk = new Desktop();
        // Insted of creating obj of same class we can do reference of parent class and obj of child class (dynamic method despatch)
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer Ayush = new Developer();
        // System.out.println(Ayush.devApp());  // here we can't approact obj.Method() because method is void it will not return anything.
        // Ayush.devApp();
        Ayush.devApp(lap);
        // Ayush.devApp(desk);
    }
}
