abstract class aai{
    abstract void show();
}
public class T_73_abstractAnonymousInner {
    public static void main(String[] args) {
        aai  objaai = new aai() { // here it seems like obj is of abstract class but it's not . this obj is of inner class.
            void show(){
                System.out.println("Implementation of Abstract Inner Class");
            }
        };
        objaai.show();
    }
}
