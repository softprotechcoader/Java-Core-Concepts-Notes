/* Reverse words in a sentence
Input: "Java Developer Role"
Output: "Role Developer Java" */

package StringPractice;

import java.util.Scanner;

public class Reverse_words_in_a_sentence {
    public static void main(String[] args) {
        String[] input = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int a =0 ; a<3;a++){
            
            input[a] = sc.nextLine();
        }
            sc.close();
        // System.out.println(input.);
        for (int i = input.length-1; i>=0; i--){
            System.out.print(input[i]+" ");
        }

    }
}
