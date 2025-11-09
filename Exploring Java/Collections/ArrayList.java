
import java.util.Collection;

public class ArrayList {
public static void main(String[] args) {
    Collection <Integer> num = new ArrayList <Integer> ();   //we don't have indexes for collection api 
    num.add(8);                     //  8,3,5 are objects here
    num.add(3);
    num.add(5);
    System.out.println(num);

    // for (int n : num) {
    //     System.out.println(n);
    // }
}
    
}