class NegativeAreaException extends Exception{
    @Override
    public String toString() {
        return "Radius Cannot Be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot Be Negative";
    }
}
public class customExceptionNegativeRadius {
    public static double area(double rad) throws NegativeAreaException{
        if(rad<0){
            throw new NegativeAreaException();

        }
        return Math.PI*Math.pow(rad,2);
    }
    public static void main(String[] args) {
        double getarea = 0;
        try {
            getarea = area(6);
        } catch (NegativeAreaException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getarea);
    }
}
