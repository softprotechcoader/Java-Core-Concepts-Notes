abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Writting...");
    }

    @Override
    void refill() {
        System.out.println("Refield...");
    }
    void changeNib(){
        System.out.println("Nib has been changed.");
    }
}
public class Practice_Of_Abstract  {
    public static void main(String[] args) {
    FountainPen fountainPen = new FountainPen();
    fountainPen.changeNib();
    fountainPen.refill();
    fountainPen.write();
    }
}
