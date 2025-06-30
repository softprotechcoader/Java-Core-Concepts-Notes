

class staticBlock {
    public static void main(String[] args) throws ClassNotFoundException {
        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Samsung";
        // mobile1.price = 30000;  

        // Mobile mobile2 = new Mobile();
        // mobile2.brand = "Apple";
        // mobile2.price = 80000;

//********************** */ Loading class without creating object  ******************************
       Class.forName("Mobile");  // class will get loaded and static block will be executed

    }
}