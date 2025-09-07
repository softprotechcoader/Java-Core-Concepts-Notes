 interface iI {
    final int num = 90;
    final String place = "Coimbatore";
    void show();
    void config();
} 

     class interfaceImpl implements iI {

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
    
        
    }

public class interfaceIntro {
    public static void main(String[] args) {
        
        interfaceImpl impl = new interfaceImpl();
        impl.config();
        impl.show();
        System.out.println(interfaceImpl.num + "\n"+ interfaceImpl.place);
    }
}
