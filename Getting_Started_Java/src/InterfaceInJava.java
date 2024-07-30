interface Bycycle{
    int inp = 90;
    void applyBreaks(int decrement);
    void Acclerate(int increment);


}
interface Bike{
    void horn();
    void gearUp();
    void geraDown();
}
class Atlas implements Bycycle , Bike{
    @Override
    public void applyBreaks(int decrement) {
        decrement --;
        System.out.println("Speed Dereasing : "+decrement);
    }

    @Override
    public void Acclerate(int increment) {
        increment++;
        System.out.println("Speed increasing: "+increment);
    }
    @Override
    public void horn(){
        System.out.println("Pe pe pe");
    }
    @Override
    public void gearUp(){
        System.out.println("gear up");
    }

    public void geraDown(){
        System.out.println("Gear Down");
    }

}

public class InterfaceInJava  {
    public static void main(String[] args) {
        Atlas mycycle = new Atlas();
        mycycle.Acclerate(1);
        mycycle.applyBreaks(1);
        System.out.println("Print Input :"+mycycle.inp);

        mycycle.gearUp();
        mycycle.geraDown();
        mycycle.horn();
    }


}
