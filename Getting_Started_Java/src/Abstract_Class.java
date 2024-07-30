abstract  class computer{
   void Welcome(){
       System.out.println("Welcome");
   }
   public abstract void TurnOn();
   public abstract void TurnOff();

}

class Laptop extends computer{
    @Override
    public void TurnOn() {
        System.out.println("Turning On your Pc");
    }
    @Override
    public void TurnOff(){
        System.out.println("Turning off Your PC");
    }
}
public class Abstract_Class {
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.TurnOff();
        hp.TurnOn();
    }
}
