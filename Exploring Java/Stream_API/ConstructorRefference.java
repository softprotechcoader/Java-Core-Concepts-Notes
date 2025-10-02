package Stream_API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + " age=" + age + "\n";
    }
}

public class ConstructorRefference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ayush", "Ravi", "Ashutosh");
        List<Student> students = new ArrayList<>();
        /* for(String name : names){
            students.add(new Student(name));

        }
        System.out.println(students); */
        // ********using Streams************
     /*    students = names.stream()
                .map(name -> new Student(name))
                .toList();
        System.out.println(students); */

        //instead of using lemda we can use constructor refference
        students = names.stream()
                        .map(Student::new) // Everytime there is new name it will create and object of type Student. its constructor refference;
                        .toList();
        System.out.println(students);

    }
}
