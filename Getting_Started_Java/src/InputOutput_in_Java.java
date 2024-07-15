import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_in_Java {
    public static void main(String[] args) throws IOException {

        // Creating BufferedReader Object
        // InputStreamReader converts bytes to
        // stream of character

        System.out.println("Enter you Name and a Number");
        BufferedReader inpobj = new BufferedReader(new InputStreamReader(System.in));

        // String reading internally
        String name = inpobj.readLine();

        // Integer reading internally
        int num = Integer.parseInt(inpobj.readLine());

        System.out.println("Your Name "+name +"\n Your Number "+ num );

        //**********************************************************************

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String lastname;
        try{
            System.out.println("Enter your Last Name");
            lastname = reader.readLine();
            System.out.println("You Last Name is "+ lastname);
        }
        catch (Exception e){

        }

    }
}
