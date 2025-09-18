import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{   // implemented comparable to achieve natural sorting. 
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
   
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    

    @Override
    public int compareTo(Student that) {
         if(this.age  > that.age )
            return 1;
            else
            return -1;
    }

}

public class Comparator_and_Comprable_Students {
     public static void main(String[] args) {

        Comparator<Student> com = (i,j)-> i.age > j.age ? 1 : -1;
        
    

        List<Student> student = new ArrayList<>();
        student.add(new Student(25, "Ayush"));
        student.add(new Student(24, "Amit"));
        student.add(new Student(23, "Aditya"));
        student.add(new Student(23, "Hrishikesh"));

        // Collections.sort(student);   //Collections is the class
        // now, we can simply pass student in Collection.short.
        Collections.sort(student , com);

        System.out.println(student);

    }
}
