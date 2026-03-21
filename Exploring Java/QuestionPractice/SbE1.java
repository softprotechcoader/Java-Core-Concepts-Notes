// 1. Write a program to find the length of a string without using the `length()` method.
class SbE1{
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = 0;
        for(char each : str.toCharArray()){
            length ++;

        }
        System.out.println(length);
       
}