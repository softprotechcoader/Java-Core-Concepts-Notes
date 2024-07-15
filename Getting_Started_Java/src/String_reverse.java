//Reverse a String
//
//Problem: Write a function to reverse a given string.
//Example: Input: "hello", Output: "olleh"
import java.util.Scanner;

public class String_reverse {
    public static void main(String[] args) {
        String revword = "";
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = userInput.nextLine();

        for (int i = word.length()-1 ; i>=0 ; i--){
            revword = revword + word.charAt(i);

        }
        System.out.println(revword);
    }
}
