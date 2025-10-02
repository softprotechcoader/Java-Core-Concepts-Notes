package Stream_API;

import java.util.Arrays;
import java.util.List;

public class MethodRefference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ayush","Ravi","Ashutosh");
        List<String> uNames = names.stream()
                            // .map(n->n.toUpperCase())
                            .map(String::toUpperCase)   // This case is called Method Reference 
                            /* Here, we have to provide Class name from which method belongs to and for reference :: */
                            .toList();
        // System.out.println(uNames);
        // uNames.forEach(n->System.out.println(n));
         uNames.forEach(System.out::println); //this also works fine.


    }
}
