import java.net.SocketOption;

public class WrapperClass {
    public static void main(String[] args)
    {
    int num = 25;
      Integer numobjboxing = Integer.valueOf(num);   //Boxing
        System.out.println("Boxed "+ numobjboxing);


        int unboxNum = numobjboxing.intValue();     //UnBoxing

        System.out.println("Unboxed "+ unboxNum);

        char c_autoBoxing ='A';
        Character car_autoBoxing = c_autoBoxing;

        System.out.println("Character Boxing "+ c_autoBoxing);

        char c_artoUnboxing = car_autoBoxing;
        System.out.println("Character AutoUnboxing "+ c_artoUnboxing);


        // Boxing
        float value = 5.5f;
//        Float boxedValue = Float.valueOf(value);
        Float boxedValue = value;

        System.out.println("Boxing of Float Value "+ boxedValue);

        // Unboxing
        Float anotherBoxedValue = 10.0f;
        float unboxedValue = anotherBoxedValue.floatValue();
        System.out.println("Unboxing Of Float Value "+ unboxedValue);


    }
}
