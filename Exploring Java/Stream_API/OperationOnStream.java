package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class OperationOnStream {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 4, 7, 8, 1, 3, 6, 16, 25);
        // System.out.println(nums);
      /*  Stream<Integer> S1 = nums.stream();

         S1.filter(n-> n%2 == 0); // can't be used again as it is already used Stream
        // objects can be used only once.

        Stream<Integer> S2 = S1.filter(n -> n % 2 == 0);
        Stream<Integer> S3 = S2.map(n -> n * 2);
        int reasult = S3.reduce(0,(c,e)->c+e); */

        // ********** All Above can be performed with single Stream
          int reasult =  nums.stream()
                .filter(n-> n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);


        // S1.forEach(n->System.out.print("\t"+n));
       /*  {
            System.out.print("Only Even Numbers: ");
            S2.forEach(n -> System.out.print("\t" + n));
        } */
        // System.out.println("Doubling the value of n using map and Stream");
        // S3.forEach(n->System.out.println(n));
        System.out.println(reasult);
    }

}
