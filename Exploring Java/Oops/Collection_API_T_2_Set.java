import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_API_T_2_Set {
    public static void main(String[] args) {
        // Set<Integer> num = new HashSet<Integer>();
        // Set<Integer> num = new TreeSet<Integer>(); // use TreeSet for Storing values in shorted format
        Collection<Integer> num = new TreeSet<Integer>(); // we can also use Collection.

        
        num.add(25);  // It always stores unique values in unsorted formate for .
        num.add(77);
        num.add(12);
        num.add(16);
        num.add(25);
        // System.out.println(num);

        Iterator<Integer> values = num.iterator();
        while (values.hasNext()) {
                   System.out.println(values.next());
 
        }
            
        }


    }

