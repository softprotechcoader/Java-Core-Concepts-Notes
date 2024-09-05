//Program to print Good Morning and Welcome using Thread add Sleep Method Demonstrate Priorities, Get State and Reference

class ThPractice_gm extends Thread{
    @Override
    public void run(){
        while (true){
            System.out.println("Good! Morning "+getPriority());
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThPractic_w extends Thread{
    @Override
    public void run(){
        while (true){

            System.out.println("Welcome! to Thread "+getPriority());
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Thread_Practice {
    public static void main(String[] args) {
        ThPractice_gm gm = new ThPractice_gm();
        gm.setPriority(1);

        ThPractic_w w = new ThPractic_w();
        w.setPriority(10);
        gm.start();
        w.start();
        System.out.println(gm.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
