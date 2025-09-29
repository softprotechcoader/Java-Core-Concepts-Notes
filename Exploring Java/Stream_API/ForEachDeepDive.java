package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDeepDive {
     public static void main(String[] args) {

        List<Integer>nums = Arrays.asList(2,4,5,7,9,6); //by using asList we can directly initilize the list value;
        
        Consumer<Integer> consumer = n -> System.out.println(n);
            
        nums.forEach(consumer); //here we have to pass Object of consumer 

        // we have various methods for printing list's using loops but ...
        // nums.forEach(n->System.out.println("List Data: "+n));
    }
}
