import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
//        return super.toString();
        return "toString() Method is called";
    }

    @Override
    public String getMessage() {
//        return super.getMessage();
        return "getMessage() method is called";
    }
}
public class Exception_Class {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a Number");
        Scanner sc = new Scanner(System.in);
                a= sc.nextInt();

        if(a<80){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e); //e always calls the toString() Method;
                e.printStackTrace();  // this method is not throw error message
            }
            System.out.println( "Yes Finished"); // Program runs completely.
        }


    }
}
