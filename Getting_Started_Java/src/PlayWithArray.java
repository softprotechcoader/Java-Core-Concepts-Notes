public class PlayWithArray {
    public static void main(String[] args) {
        float[] arrSum ={9.0f,6.7f,2.6f,87.5f,34.086f};
        float result = 0.0F;
        float num = 6.7f;
        boolean isinArray = false;
        for(float sumarr : arrSum){
             result += sumarr;
             if(num ==sumarr)
                 isinArray = true;

        }
        System.out.println("Sum of Array : "+ result);
        System.out.println(isinArray ? "Num found" : "Not Found");

    }
}
