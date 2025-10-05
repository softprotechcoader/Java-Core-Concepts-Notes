package ExceptionHandling;

public class ExceptionDemo {
    /* 3 Types of Error
     * Compile Time Error
     * RunTime Error
     * Logical Error
     */
    public static void main(String[] args) {
        int i = 9;
        int j = 3;
        int[] arr = new int[7];
        String str = null;
        try{
            i /= j;
            System.out.println(arr[5]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Devide by 0 : "+ e);
            System.out.println(i);
        }
        catch(IndexOutOfBoundsException I){
            System.out.println("Out of Limit: "+I);
        }
        catch(NullPointerException n){
            System.out.println("it's null no length: "+ n);
        }
        catch(Exception e){
            System.out.println("Something went wrong.."+e);
        }
    }
    
}
