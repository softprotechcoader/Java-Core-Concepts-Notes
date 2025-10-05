package ExceptionHandling;

public class ThrowExceptionDemo {
    public static void main(String[] args) {
          int i = 9;
        int j = 0;
      
        
        try{
            i /= j;
            if (j == 0 )
            throw new ArithmeticException();
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Devide by 0 : "+ e);
            System.out.println("Default value of j =0 ");
            System.out.println(i);
        }
       
    }
}
