 interface iI {
    final int num = 90;
    final String place = "Coimbatore";
    void show();
    void config();
} 
 interface  iI2{
        void run();
        
    }
 interface ii3 extends iI2 {

    
}
     class interfaceImpl implements iI,ii3 {

        @Override
        public void show() {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'show'");
            System.out.println("Implemented Show");
        }

        @Override
        public void config() {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'config'");
            System.out.println("Implemented Config");
        }

        @Override
        public void run() {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'run'");
            System.out.println("implemented run.....");
        }
    
        
    }
    

public class interfaceIntro {
    public static void main(String[] args) {
        
        interfaceImpl impl = new interfaceImpl();
        impl.config();
        impl.show();
        System.out.println(interfaceImpl.num + "\n"+ interfaceImpl.place);
        impl.run();
    }
}
