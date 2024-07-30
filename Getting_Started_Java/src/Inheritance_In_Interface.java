
interface pastKarma{
   void storedKarma();
}

interface karma extends pastKarma {
    boolean karmaisbitch();

        }

class work implements karma{
    @Override
    public void storedKarma() {
        System.out.println("Karma is a bitch");
    }
    @Override
    public boolean karmaisbitch(){
        return true;
    }
}

public class Inheritance_In_Interface {
    public static void main(String[] args) {
        work karma = new work();
        System.out.println(karma.karmaisbitch());
        karma.storedKarma();
    }
}
