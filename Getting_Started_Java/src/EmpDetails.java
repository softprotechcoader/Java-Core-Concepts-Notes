public class EmpDetails {
    public static void main(String[] args) {
        Employ cognizantEmploy = new Employ();
        cognizantEmploy.Name = "Rohit Jaswal";
        cognizantEmploy.Salary = 30000.98;

        System.out.println(cognizantEmploy.getName());
        System.out.println(cognizantEmploy.getSalary());

        cognizantEmploy.setDetails("Aryan Srivastava",30000.67);


    }
}
