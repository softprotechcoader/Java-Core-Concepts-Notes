class ThPriority extends Thread{
    public ThPriority(String name){
        super(name);
    }
    @Override
    public void run(){
//        System.out.println(" Thread Name : "+this.getName());
        int i=0;
        while (i<=7){
//            System.out.println("Thread is Running ");
            System.out.println(" Thread Name : "+this.getName());
            i++;
        }
    }

}

public class Thread_Priority {
    public static void main(String[] args) {
// Ready Queue : T1,T2,T3,T4,T5
        ThPriority t1 = new ThPriority("Ayush");
        ThPriority t2 = new ThPriority("Aryan");
        ThPriority t3 = new ThPriority("Rohit");
        ThPriority t4 = new ThPriority("Ravi "+" Most Important");
        ThPriority t5 = new ThPriority("Ashutosh");

        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
