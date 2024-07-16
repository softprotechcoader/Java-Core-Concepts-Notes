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
/*
Time Complexity:The time complexity of the given code is O(n),
where n is the length of the input string. This is because the
for loop iterates through each character in the string once to
create the reverse string.

Space Complexity: The space complexity of the code is O(n),
where n is the length of the input string. This is because
the reverse string is created and stored in a separate string
variable, which takes up space in memory proportional to the
length of the input string. In addition, the other variables
used in the code (i, str, and ans) take up a constant amount
of space that is independent of the input size.*/