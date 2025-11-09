import java.util.*;
import java.util.ArrayList;

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.id == other.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class ListInMap_demo {

    public static void main(String[] args) {
        // Corrected declaration of studentMap
        Map<Integer, List<Student>> studentMap = new HashMap<>();

        List<Student> list1 = Arrays.asList(
                new Student(1, "Alice"),
                new Student(2, "Bob")
        );

        List<Student> list2 = Arrays.asList(
                new Student(3, "Charlie"),
                new Student(4, "David")
        );

        studentMap.put(101, list1);
        studentMap.put(102, list2);

        // Another list to compare
        List<Student> anotherList = new ArrayList<Student>(); // Fixed to specify generic type
        anotherList.add(new Student(1, "Alice")); // Already present
        anotherList.add(new Student(5, "Eve"));   // Missing in map

        checkAndDisplay(studentMap, anotherList);
    }

    public static void checkAndDisplay(Map<Integer, List<Student>> studentMap, List<Student> anotherList) {
        // Combine all students from the map into one set for easy lookup
        Set<Student> allStudents = new HashSet<>();
        for (List<Student> list : studentMap.values()) {
            allStudents.addAll(list);
        }

        // Check for missing students and add them to anotherList
        for (Student s : new ArrayList<>(anotherList)) { // Iterate over a copy to avoid ConcurrentModificationException
            if (!allStudents.contains(s)) {
                System.out.println("Adding missing student to anotherList: " + s);
                anotherList.add(s);
            }
        }

        // Display final anotherList
        System.out.println("\nFinal Another List:");
        for (Student s : anotherList) {
            System.out.println(s);
        }
    }
}