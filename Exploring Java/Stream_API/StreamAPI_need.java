package Stream_API;

import java.util.Arrays;
import java.util.List;

public class StreamAPI_need {
    public static void main(String[] args) {
        int sum =0;
        List<Integer>nums = Arrays.asList(2,4,5,7,9,6); //by using asList we can directly initilize the list value;
        for(int n : nums){
            if (n %2 ==0){
                n *= 2;
                sum += n;
            }
        }
        System.out.println("Sum of even number in list : "+sum);
        // we have various methods for printing list's using loops but ...
        nums.forEach(n->System.out.println("List Data: "+n));
    }
}
