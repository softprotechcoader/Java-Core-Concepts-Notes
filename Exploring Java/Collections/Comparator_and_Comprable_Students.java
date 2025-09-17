import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
   
    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }
    String name;

}

public class Comparator_and_Comprable_Students {
     public static void main(String[] args) {

        Comparator<Student> com = new Comparator<Student>(){
        public int compare(Student i, Student j){
            if(i.age %10 > j.age %10)
            return 1;
            else
            return -1;
        }
    };

        List<Student> student = new ArrayList<>();
        student.add(new Student(25, "Ayush"));
        student.add(new Student(24, "Amit"));
        student.add(new Student(23, "Aditya"));
        student.add(new Student(23, "Hrishikesh"));
        // Collections.sort(students);   //Collections is the class
        Collections.sort(student , com);
        System.out.println(student);

    }
}
