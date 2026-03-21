package Question_Practice;

import java.util.ArrayList;

import java.util.List;

public class revArraList {
    public static void main(String[] args) {
        List<String> Names = new ArrayList<>();
        Names.add("Ayush");
        Names.add("Subhash");
        Names.add("Aryan");
        // System.out.println(Names.reversed()); //Method 1
        for(int i = Names.size()-1; i>=0; i--){
        System.out.println(Names.get(i));          // Method 2
        }


             
             
    }
    
}
