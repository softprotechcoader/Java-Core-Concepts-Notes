class Base{
    String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

public class InHeritance extends Base {
     String str2;

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public static void main(String[] args) {
        InHeritance inhr = new InHeritance();

        inhr.setStr2("This is my Inheritance Class");
        System.out.println(inhr.getStr2());

        //Accessing Base Class from Inheritance class that is derived class

        inhr.setStr("This is the Base Class");
        System.out.println(inhr.getStr());
    }
}
