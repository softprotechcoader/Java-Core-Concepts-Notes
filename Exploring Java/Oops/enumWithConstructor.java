enum Laptop{
    HP(2000) , Lenovo(3000) , Dell , Apple(7000);

    private Laptop(int price) {
        this.price = price;
        System.out.println("Parameterize Constructor : "+ this.name());
    }

    Laptop() {
        price = 200;
        System.out.println("Default constructor : "+this.name());
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class enumWithConstructor {
    public static void main(String[] args) {
    //   Laptop laptop = Laptop.Apple;
    //   System.out.println(laptop+" : "+laptop.getPrice());

        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop +":"+laptop.getPrice());
        }
    }
}
