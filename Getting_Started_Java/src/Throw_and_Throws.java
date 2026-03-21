public class Throw_and_Throws {

    public static int divide(int a,int b) throws ArithmeticException{
    return a/b;
    }

    public static void main(String[] args) {
       try{
           int result = divide(4,0);
           System.out.println("Result : "+ result);
       }
       catch (Exception e){
           System.out.println("Exception can't divide by Zero");
       }
    }
}
