package Question_Practice;

import java.util.EnumSet;

enum Student  {Ayush,Subhash,Aryan,Rohit}

public class enumSet {
    public static void main(String[] args) {
        EnumSet<Student> e = EnumSet.of(Student.Aryan,Student.Ayush,Student.Rohit,Student.Subhash);
        System.out.println("Enum Set :"+e);
    }
    
}
