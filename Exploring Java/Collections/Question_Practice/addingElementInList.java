package Question_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class addingElementInList {
    public static void main(String[] args) {
        // List<String> programmingLanguage = new ArrayList<>(List.of("C","C++","Python","Java","JavaScript"));
        /*        
        List.of()
        List.of() is a static factory method (introduced in Java 9) that creates an immutable
        (unmodifiable) List:
        List<String> list = List.of("a", "b", "c");
        // Cannot modify - throws UnsupportedOperationException
        // list.add("d"); // ❌ Error

        Advantages:
        Concise syntax
        Thread-safe (immutable)
        Memory efficient
        Null elements not allowed
        */

        // System.out.println(programmingLanguage);

        List<String> progrmmingLanguage = new ArrayList<>();
        progrmmingLanguage.add(0, "C");
        progrmmingLanguage.add(1,   "Java");
        progrmmingLanguage.add(2, "Python");
        progrmmingLanguage.add(3, "C++");
        progrmmingLanguage.add("JavaScript");

        System.out.println("Original Sequence : "+progrmmingLanguage);
        // Adding elecent on particular intex
        progrmmingLanguage.add(1, "C#");
        // Updating element on particular Index
        progrmmingLanguage.set(1, "Python");
        progrmmingLanguage.set(2, "TypeScript");
        progrmmingLanguage.add("Python");
        System.out.print("Modified : ");

        for (String string : progrmmingLanguage) {

            System.out.print(string+" ");
        }
        // Searching
        /* 
        indexOf(Object o)
            Returns the first occurrence index
            Searches from left to right (beginning of list)
            lastIndexOf(Object o)
            Returns the last occurrence index
            Searches from right to left (end of list)
                    */
        System.out.println("\n Using indexOf : "+ progrmmingLanguage.indexOf("Python"));
        System.out.println("Using Last lastIntedOf : "+progrmmingLanguage.lastIndexOf("TypeScript"));
        
        
        

    }
    
}
