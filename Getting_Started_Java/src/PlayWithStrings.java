import java.sql.SQLOutput;

public class PlayWithStrings {
    public static void main(String[] args) {
        char []ch={'h','e','l','o'};
         String s = new String(ch);   //Char array to string
        System.out.println(ch);
//        **************************String Methods***************************

        String str = "Welocme! To Java String";
        System.out.println(str.charAt(3));
        /*
         char charAt(int index)	It returns char value for the particular index
         */
        System.out.println(str.length());
        System.out.println(str.concat(" & learn string."));
        //*********String Comparesion*************

        /*
        There are three ways to compare String in Java:

           1: By Using equals() Method
           2:By Using == Operator
           3: By compareTo() Method    */

//        Method 1:
        String str1 = "Ravi";
        String str2 = "Ashutosh";
        String str4 = "RAVI";
        String str5 = "Ravi";
        String str3 = new String("Ravi");

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));

        if(str1.equals(str3)){
        System.out.println("strings are equal");

        }
        System.out.println("Ignore Case "+str1.equalsIgnoreCase(str4));

        //Method: 2

        //The == operator compares references not values.
        System.out.println(str1==str5); //true (because both refer to same instance)
        System.out.println(str1==str3); //false(because s3 refers to instance created in nonpool)

//        Method 3:

        System.out.println("Comparision by using compareTo method\n"+str1.compareTo(str2)); //+ve when str1>str2
        System.out.println(str1.compareTo(str5));  //0 when equals
        System.out.println(str2.compareTo(str1));//-ve when str1<str2

        String nontreamed = "        Sri  Krishna       ";
        System.out.println(nontreamed.trim());

        String name ="SriKrishna";
        String name2 ="SriRam";
        System.out.println(name.substring(3));
        System.out.println(name.substring(3,9));

        //System.out.println(name.replace('i','e'));
        System.out.println(name.replace("Krishna", "Ram"));
        System.out.println(name.startsWith("Sri"));
        System.out.println(name.endsWith("Ram"));

        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("Krishna"));

        System.out.println(name.lastIndexOf('i'));
        System.out.println(name.indexOf('s',4));

        System.out.println(name.lastIndexOf("sri",5));
        System.out.println(name.equals(name2));



    }

}
