 class Employ {
    String Name;
    double Salary;

    public double getSalary(){
        return Salary;
    }
    public String getName(){
        return Name;
    }
    public void setDetails(String newName,double newSalary){
        this.Name=newName;
        this.Salary=newSalary;
        System.out.println("Employ Details \n"+ "Name: "+Name+"\nSalary: "+Salary);
    }
}


