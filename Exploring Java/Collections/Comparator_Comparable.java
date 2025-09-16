// Way of sorting in Collection

import java.text.CompactNumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_Comparable {

    //sorting on the basis of last digit manual sorting.
    //Comparator
   
        
  

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>(){
        public int compare(Integer i, Integer j){
            if(i%10 > j%10)
            return 1;
            else
            return -1;
        }
    };

        List<Integer> nums = new ArrayList<>();
        nums.add(77);
        nums.add(90);
        nums.add(25);
        nums.add(43);
        // Collections.sort(nums);   //Collections is the class
        Collections.sort(nums , com);
        System.out.println(nums);

    }
}
