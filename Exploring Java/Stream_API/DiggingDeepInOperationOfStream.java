package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DiggingDeepInOperationOfStream {
     public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 4, 7, 8, 1, 3, 6, 16, 25);
       
        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                if(n%2==0)
                return true;
                else
                return false;
            }
            
        };
        
          int result =  nums.stream()
                .filter(p)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);


  
        System.out.println(result);
    }
}
