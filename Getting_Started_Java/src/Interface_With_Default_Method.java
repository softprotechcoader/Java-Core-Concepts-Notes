

interface Camera {
    void takeSnap();

    void recordVideo();
    private void greet(){
        System.out.println("Good Morining");
    }

    default void record4KVideo(){
        greet();
        System.out.println("Recording 4k Video");
    }
}

interface Torch {
    void torchOn();

    void torchOff();

}

interface Wifi {
    String[] getNetwork();

    void connectNetwork(String network);
}

class CellPhone {
    void callNumber(int number) {
        System.out.println("Calling Number: " + number);
    }

    void pickCall() {
        System.out.println("Connecting...");
    }
}

class iSmartPhone extends CellPhone implements Camera, Torch, Wifi {

    @Override
    public void record4KVideo(){
        System.out.println("Taking Snap and recording in 4K......");
    }

    @Override
    public void takeSnap() {
        System.out.println("Snaped");
    }

    @Override
    public void recordVideo() {
        System.out.println("Video recorded");
    }

    @Override
    public void torchOn() {
        System.out.println("Tourch ON");
    }

    @Override
    public void torchOff() {
        System.out.println("Tourch OFF");
    }

    @Override
    public String[] getNetwork() {
        System.out.println("Getting List of Network's");
        String[] network = {"Aryan", "Rohit", "Subhash", "Sambhoo"};
        return network;
    }

    @Override
    public void connectNetwork(String network) {
        System.out.println("Connected With " + network);
    }

}

public class Interface_With_Default_Method {

    public static void main(String[] args) {
        iSmartPhone apple = new iSmartPhone();

        String[] str = apple.getNetwork();
            for(String item:str){
                System.out.println(item);
            }

            apple.connectNetwork("Sanbhoo");
            apple.torchOn();
            apple.torchOff();
            apple.record4KVideo();

            Camera cam = new iSmartPhone();
            cam.record4KVideo();
    }

}

