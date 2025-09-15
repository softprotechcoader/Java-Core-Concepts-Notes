import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map <String,Integer> Students = new HashMap<>();
        Students.put("Amit",90 );
        Students.put("Ayush",100);
        Students.put("Aditya", 80);

        System.out.println("All Student Details: \n"+Students+"\n *************");
        System.out.print("******************Get keys**********************\n");
        System.out.println("Value for Amit "+Students.get("Amit"));
        // Students.clear();
        System.out.println(Students.keySet()); //its act as set.

        for(String name : Students.keySet()){
            System.out.println();
            System.out.println(name+" : "+Students.get(name)); //iteration of has map
        }


    }
}
