package Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class OptionalClass {
    public static void main(String[] args) {

        // Find first name containing char : y
        List<String> name = Arrays.asList("Ayush","Aryan","Rohit","Aman","Ravi","Ashutosh");
        Optional<String> nameContainY =  name.stream()
            .filter(n->n.contains("y"))
            .findFirst();


        // System.out.println(nameContainY.get());
        System.out.println(nameContainY.orElse("Not Found"));


        // *************Method 2*****************
         List<String> name2 = Arrays.asList("Ayush","Aryan","Rohit","Aman","Ravi","Ashutosh");
            String nameContainZ =  name2.stream()
            .filter(n->n.contains("z"))
            .findFirst()
            .orElse("Not Found");
            


        // System.out.println(nameContainY.get());
        System.out.println(nameContainZ);

    }
}
