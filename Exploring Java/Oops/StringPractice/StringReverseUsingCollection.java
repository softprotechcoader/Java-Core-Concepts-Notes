package StringPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StringReverseUsingCollection {
    public static void main(String[] args) {
        String str = "Role Java Developer";
        List<String> strList = Arrays.asList(str.split(" "));
        // Collection.reverse(strList);
        // String nstr = strList.toString();
        // String revString = strList.get(0).join( " ", strList);
        // System.out.println(revString);
        for (int i = strList.size() - 1; i >= 0; i--) {
            System.out.print(strList.get(i) + " ");
        }

    }
}
