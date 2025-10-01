package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class DiggingDeepInOperationOfStream {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 4, 7, 8, 1, 3, 6, 16, 25);

        Predicate<Integer> p = new Predicate<Integer>() {

            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0)
                    return true;
                else
                    return false;
            }

        };

        Function<Integer, Integer> f = new Function<Integer, Integer>() {

            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }

        };

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {

            @Override
            public Integer apply(Integer c, Integer e) {
                return c + e;
            }

        };

        int result = nums.stream()
                .filter(p)
                .map(f)
                .reduce(0, b); // here identity is needed as it takes 2 arguments
        /*
         * T reduce(T identity, BinaryOperator<T> accumulator)
         * identity is a starting value for the reduction.
         * 
         * It must satisfy two rules:
         * 
         * It is a neutral element — adding it to any other element does not change the
         * result.
         * 
         * Example: 0 for addition, 1 for multiplication.
         * 
         * It is returned if the stream is empty.
         * 
         * accumulator is the operation that combines elements (your BinaryOperator).
         * 
         */

        System.out.println(result);
    }
}
