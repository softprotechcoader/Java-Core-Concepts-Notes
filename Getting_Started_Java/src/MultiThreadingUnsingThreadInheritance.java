public class MultiThreadingUnsingThreadInheritance {
    static class MyThread1 extends Thread {
        @Override
        public void run() {

            while (true) {
                System.out.println("Thread is running");
                System.out.println("I am happy ");
            }
        }
    }

    static class MyThread2 extends Thread {
        @Override
        public void run() {

            while (true) {
                System.out.println("Thread 2 is running");
                System.out.println("I am Learning MultiThreading ");
            }
        }
    }

    public static void main(String[] args) {
//    MyThread1 t1 = new MyThread1();
//    MyThread2 t2 = new MyThread2();
//    t1.start();
//    t2.start();

    }
}
