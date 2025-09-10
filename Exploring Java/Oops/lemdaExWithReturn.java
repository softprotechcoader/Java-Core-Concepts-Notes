 @FunctionalInterface
 interface lebr {
    int add(int n, int i);
    
}
public class lemdaExWithReturn {
    public static void main(String[] args) {
        lebr le = (n,i) -> n+i;
        System.out.println(le.add(70, 70));
    }
}
