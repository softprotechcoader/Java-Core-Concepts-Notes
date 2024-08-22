public class MultiThreading_Using_Runable_Interface {
    static class Thread1 implements Runnable {

        @Override
        public void run() {
            while (true)
                System.out.println("This is Thread 1");

        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            while (true)
                System.out.println("This is Thread 2");

        }
    }

    public static void main(String[] args) {
    Thread1 b1 = new Thread1();
    Thread g1 = new Thread(b1);

    Thread2 b2 = new Thread2();
    Thread g2 = new Thread(b2);

    g1.start();
    g2.start();
    }
}
