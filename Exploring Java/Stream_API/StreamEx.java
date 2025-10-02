package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamEx {
    public static void main(String[] args) {
        int size = 10_0000;
        List<Integer> num = new ArrayList<>(size);

        Random ran = new Random();
        for (int i = 1; i <= size; i++) {
            num.add(ran.nextInt(100));
        }
        // System.out.println(num);
      /*   int sum1 = num.stream()
                .map(n -> n * 2)
                .reduce(0, (c, e) -> c + e);
        System.out.println("Sum1 using map and reduce: " + sum1); */

        long startSeq = System.currentTimeMillis();
        int sum2 = num.stream()
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e){
                        
                    }
                  return  i * 2;
                })
                .mapToInt(i -> i) // here mapToInt converts stream to int.
                .sum(); // sum internally use reduce method.
        System.out.println("Sum2 using mapToInt and sum : " + sum2);
        long endSeq = System.currentTimeMillis();
        System.out.println("Time Taken in Seq Stream : " + (endSeq - startSeq));
        // System.out.println("Time Taken in Seq Stream" + endSeq - startSeq); // we can't use this way.
        /*
         * Java evaluates this as:
         * ("Time Taken in Seq Stream" + endSeq) - startSeq
         * which causes unexpected results (and probably compilation error since it's
         * "String" - long).
         */
        long startParellel = System.currentTimeMillis();  //for Time Measurment.
        int sum3 = num.parallelStream()      //parallelStream creats multiple Thread and execute programs.
                // .map(i -> i * 2)
                .map(i -> {
                    try{
                        Thread.sleep(1);
                    }
                    catch(Exception e){
                        
                    }
                  return  i * 2;
                })
                .mapToInt(i -> i)
                .sum();
        System.out.println("Sum3 using parellelStream and sum : " + sum3);
        long endPrallel = System.currentTimeMillis();
        System.out.println("Time Taken by Prallel Stream : "+(endPrallel-startParellel));


        /* Speed of Prallel stream depends on various factor and System configration 
         * for small amount of data System can take more time for prallel stream as it has to create threads.
         */

    }
}
