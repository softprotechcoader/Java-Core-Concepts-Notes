public class ExceptionHandaing {
    public static void main(String[] args) {
        int a =9000000 , b=7;
//        System.out.println(a/0);
        try {
            System.out.println("Reasult of a/0 is: "+a/0);
        }
        catch (Exception e){
            System.out.println("Failed to Devide Reason: "+e);
        }
        System.out.println("End of the Programme");

    }
}
