import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=9;
        arr[1]=98;
        arr[2]=76;

        System.out.println("Enter the array index to check its value");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        try {
            System.out.println("Welcome to Nested Try Catch");
            try {
                System.out.println(arr[input]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("This Index Does Not Exist");
                System.out.println("Exception in Level Two");
            }
        }
        catch (Exception e){
            System.out.println( "Exception in Level one" );
        }
    }
}
