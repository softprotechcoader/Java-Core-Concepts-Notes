// 1. Create an `ArrayList` and add 10 integers to it.
// 2. Remove an element at a specific index from an `ArrayList`.

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CLE1 {
    public static void main(String[] args){
        List<Integer> numList = new ArrayList<>();
        Random rand = new Random();
        for (int i =0 ; i<10; i++){
            numList.add(rand.nextInt(50));
        }
        System.out.println(numList);
        System.out.println("Element Removal");
        System.out.println("removed at index 7 : "+ numList.get(7));
        numList.remove(7);
        System.out.println(numList);
    }
}
