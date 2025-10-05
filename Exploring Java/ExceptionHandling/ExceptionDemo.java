package ExceptionHandling;

public class ExceptionDemo {
    /* 3 Types of Error
     * Compile Time Error
     * RunTime Error
     * Logical Error
     */
    public static void main(String[] args) {
        int i = 9;
        int j =0;
        try{
            i /= j;
        }
        catch(Exception e){
            System.out.println("Something went wrong: "+ e);
            System.out.println(i);
        }
    }
    
}
