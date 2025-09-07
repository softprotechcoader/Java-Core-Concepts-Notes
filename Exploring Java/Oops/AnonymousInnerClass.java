class ANC{
    public void show (){
        System.out.println("Demo of Anonymous Inneer Class");
    }
}

public class AnonymousInnerClass {
    public static void main(String args[])
    {
        ANC anc = new ANC()
        // anc.show(); // Now we want to change the behaviour of this class 
        {
            public void show (){ // this change in behaviour called Anonymous Inner Class.
                System.out.println(" change in behaviour of  Anonymous Inner Class without Overriding.");
            }
        };
        anc.show();
    }
}
