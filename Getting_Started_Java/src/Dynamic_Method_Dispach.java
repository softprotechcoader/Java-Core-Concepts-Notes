class Phone{
    void PowerOn(){
        System.out.println("Turning On your Mobile Phone");
    }
    void Torch(){
        System.out.println("Flash On");
    }
}

class SmartPhone extends Phone{
    @Override
    void PowerOn(){
        System.out.println("Turning On Your Smart Phone");
    }

    void Music(){
        System.out.println("Playing Music");
    }
}
public class Dynamic_Method_Dispach {
    public static void main(String[] args) {
        Phone Nokiya = new SmartPhone();
        Nokiya.PowerOn();

//        Nokiya.Music();

        SmartPhone Poko_F1 = new SmartPhone();
        Poko_F1.Music();
    }
}
