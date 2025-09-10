interface lEE {
    void show(int n);
    
}
// class lE implements lEE {

//     @Override
//     public void show() {
//         // TODO Auto-generated method stub
//         // throw new UnsupportedOperationException("Unimplemented method 'show'");
//         System.out.println("In a Movie Show");
//     }

    
// }
public class lemdaExpression {
    public static void main(String[] args) {
    //     lEE gm = new lEE(){
    //         public void show(){
    //             System.out.println("In Anonymous Movie show ");
    //         }
    //     };
    //     gm.show();
    // }
      lEE gm = (int n)-> System.out.println("In Anonymous Movie show ");
            
        
        gm.show(7);
    }
}
