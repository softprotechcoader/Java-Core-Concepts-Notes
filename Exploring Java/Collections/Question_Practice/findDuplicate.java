package Question_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicate {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(List.of(7,7,8,8,1,3,5,9));
        // Method 1 : Brut Force Approcah
/*         for(int i = 0 ; i<num.size();i++){
            for(int j= i+1;j<num.size(); j++){
                if (num.get(i)== num.get(j)){
                    System.out.println("Duplicate:"+num.get(i));
                }
            }
        } */
            // Method 2 : using sets
        Set<Integer> seen = new HashSet<>();
        List<Integer> dups = new ArrayList<>();
        for (Integer x : num) {
            if (!seen.add(x))
                dups.add(x);
        }
        System.out.println(dups);
        System.out.println(seen);



    }
}
