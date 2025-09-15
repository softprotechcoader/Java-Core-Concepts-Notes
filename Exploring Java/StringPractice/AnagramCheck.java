/* Check if two strings are anagrams
Input: "listen", "silent" → true
Input: "hello", "world" → false */
package StringPractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        String input1 = "listen", input2 = "silent";
        char[] arrinput1 = input1.toCharArray();
        char[] arrinput2 = input2.toCharArray();
        if (arrinput1.length != arrinput2.length) {
            System.out.println("Not an Anagram");
        } else {
            Arrays.sort(arrinput1);
            Arrays.sort(arrinput2);
            if (Arrays.equals(arrinput1, arrinput2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not an Anagram");
            }

        }

    }
}
