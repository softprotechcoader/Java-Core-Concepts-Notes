class wrapperClass{
    public static void main(String a[]){
        int x = 10;
        // Integer y = new Integer(x); // deprected 
                   // Boxing: converting primitive to wrapper
        // Using the valueOf method instead of the constructor is recommended
        Integer y = Integer.valueOf(x); // Boxing using valueOf method

        int z = y.intValue(); // Unboxing: converting wrapper to primitive

        System.out.println("Boxed value: " + y);
        System.out.println("Unboxed value: " + z);
        // Autoboxing: automatic conversion from primitive to wrapper
        Integer autoBoxed = x; // Autoboxing
        // Auto-unboxing: automatic conversion from wrapper to primitive
        int autoUnboxed = autoBoxed; // Auto-unboxing
        System.out.println("Auto-boxed value: " + autoBoxed);
        System.out.println("Auto-unboxed value: " + autoUnboxed);

        String str = "123";
        // Converting String to Integer
        int parsedValue = Integer.parseInt(str);
        System.out.println("Parsed value from String: " + parsedValue);


        
    }
}