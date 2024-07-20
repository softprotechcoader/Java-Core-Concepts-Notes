public class factorialUsingRecursion {
    public static int factorial(int i){
        if(i==0||i==1)
            return 1;
        else{
            return i*factorial(i-1);
        }
    }


    public static void main(String[] args) {
        int x = 5;
        System.out.println(x*factorial(x-1));
    }
}
