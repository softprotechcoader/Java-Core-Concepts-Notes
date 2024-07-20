//Using To Pointer Algorithm

public class reverse_vovel {
    public static void main(String[] args) {
        String str = "SriRama";
        System.out.println("Reversed vovel :" + reverseVovels(str));
    }

    public static String reverseVovels(String inpStr) {
        char[] iChar = inpStr.toCharArray();
        int left = 0, right = iChar.length - 1;
        while (left < right) {
            if (!isvovel(iChar[left])) {
                left++;
                continue;

            }
            if (!isvovel(iChar[right])) {
                right--;
                continue;


            }
            // Swap vovels
            char temp = iChar[left];
            iChar[left] = iChar[right];
            iChar[right] = temp;
            left++;
            right--;

        }
        return new String(iChar);

    }

    public static boolean isvovel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
