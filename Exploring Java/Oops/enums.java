/*   enum is a special kind of class
In Java, enum is a keyword that tells the compiler:
“Create a class that extends java.lang.Enum automatically.” */
/* What the compiler does internally

When you compile this, the Java compiler actually generates a final class that:
Extends java.lang.Enum<Status>.
That’s why you can’t extend another class in an enum.
Creates objects for each constant (Running, Failed, Pending, Success) as public static final fields.
Provides private constructors to prevent outside instantiation.
Automatically generates the static methods values() and valueOf(String) */

  enum Status {
   Running, Failed, Pending, Success;
    
}
public class enums {
    public static void main(String[] args) {
        Status s = Status.Running;
        System.out.println(s);
        Status[] ss = Status.values();
        for (Status status : ss) {
            System.out.println(status+":"+status.ordinal());
        }
    }
}

// Roughly Equivalent Class (what compiler generates)

// The compiler will transform your enum into something like this:

/* public final class Status extends Enum<Status> {
    // enum constants (public, static, final)
    public static final Status Running  = new Status("Running", 0);
    public static final Status Failed   = new Status("Failed", 1);
    public static final Status Pending  = new Status("Pending", 2);
    public static final Status Success  = new Status("Success", 3);

    // array holding all values (for values() method)
    private static final Status[] ENUM_VALUES = { Running, Failed, Pending, Success };

    // private constructor
    private Status(String name, int ordinal) {
        super(name, ordinal);
    }

    // compiler-generated methods:
    public static Status[] values() {
        return ENUM_VALUES.clone(); // defensive copy
    }

    public static Status valueOf(String name) {
        for (Status s : ENUM_VALUES) {
            if (s.name().equals(name)) {
                return s;
            }
        }
        throw new IllegalArgumentException("No enum constant " + name);
    }
}
 */