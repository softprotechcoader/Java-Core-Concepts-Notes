interface TVRemote{
    void On();
    void Off();
}
interface SmartTVRemote extends TVRemote{
    void displayYouTube();
    void playMovie();
}
class TV implements SmartTVRemote{

    @Override
    public void displayYouTube() {
        System.out.println("Plying youtube...");
    }

    @Override
    public void playMovie() {
        System.out.println("playing Movie");
    }

    @Override
    public void On() {
        System.out.println("Power On");
    }

    @Override
    public void Off() {
        System.out.println("Power Off");
    }
}
public class practic_of_interface {
    public static void main(String[] args) {
    TVRemote remote = new TV();
    remote.Off();
    remote.On();
    SmartTVRemote remote1 = new TV();
        remote1.displayYouTube();
        remote1.playMovie();
        remote1.Off();
        remote1.On();
    
    }
}
