package StringPractice;

public class ReverseWordUsingStringArray {
    public static void main(String[] args) {
        String input = "Java Developer Role";
        // System.out.println(input.charAt(1));
        String words[] = input.split(" ");
        // for (String word : words)
        // System.out.println(word);
        System.out.println(words);
        for (int i= words.length-1; i>=0; i-- ){
            System.out.print(words[i]+" ");
        }
    }
}
