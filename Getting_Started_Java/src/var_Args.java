public class var_Args {

    static int sum(int...sum){
        int result=0;
        for(int s : sum)
            result+=s;
        return result;
    }

    public static void main(String[] args) {
        //int a=9,b=8;

        System.out.println("sum : "+sum(99,99987,987,4567));
    }
}
