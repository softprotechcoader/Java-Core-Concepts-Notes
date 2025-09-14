// Collection API : Consept of Collection API
// Collection API is a unified architecture for representing and manipulating collections, enabling collections to be manipulated independently of the details of their representation.
// It includes interfaces, implementations, and algorithms.
// Collection : Interface -> Set, List, Queue, Deque, Map 
// Collections : Class -> It consists exclusively of static methods that operate on or return collections. It contains polymorphic algorithms that operate on collections, "wrappers", which return a new collection backed by a specified collection, and a few other odds and ends.

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collection_API_T_1 {
   public static void main(String[] args) {
     /* Collection<Integer> num = new ArrayList<Integer>(); { // here, Collection is the interface and num is referance of interface and object of ArrayList;
        num.add(9); // here the value which is added is not integer its an Object Type for resolving this we need to specify type in <Integer>;
        num.add(8);
        num.add(7);

    System.out.println(num);   // we can directly print the Collection as of array no need to iterate and print.
// we can also use enhanced for loop to iterate. as here we don't have index
        for(Object i : num)
        System.out.print(i+"\n");
    }  */// in collection we don't have index property to deal with index propery we have list so instead of collection we can use list.
    
// ******************************* Using List*****************
List<Integer> num = new ArrayList<Integer>(); { // here, Collection is the interface and num is referance of interface and object of ArrayList;
        num.add(9); // here the value which is added is not integer its an Object Type for resolving this we need to specify type in <Integer>;
        num.add(8);
        num.add(7);

    System.out.println(num);   // we can directly print the Collection as of array no need to iterate and print.
// we can also use enhanced for loop to iterate. as here we don't have index
        // for(Object i : num)
        // System.out.print(i+"\n");
        System.out.println(num.size());
        System.out.println(num.indexOf(7));
        System.out.println("Number at index : "+num.get(0));
    } 

   }
}
