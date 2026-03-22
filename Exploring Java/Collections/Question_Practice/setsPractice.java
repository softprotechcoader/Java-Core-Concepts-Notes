package Question_Practice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setsPractice {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Subhash");
        names.addAll(List.of("Ayush","Aryan","Rohit","Subhash"));
        Set<String> name2 = Set.of("Ayush","Rohit","Aryan");
        System.out.println(names);
        
        for (String string : names) 
            {
                System.out.print(string+" ");
                System.out.println(names.contains("Subhash"));
                System.out.println("ContensAll : "+names.containsAll(name2));
                System.out.println(name2.hashCode());
                System.out.println(name2.toArray());
            
        }
        // String[] nameArr = name2.toArray(new String[0]); // here , [0] is the array length
        String[] nameArr = name2.toArray(new String[name2.size()]);
        
        for (String name : nameArr) 
            {
                System.out.println(name);
            
        }
        

    }
    
}
