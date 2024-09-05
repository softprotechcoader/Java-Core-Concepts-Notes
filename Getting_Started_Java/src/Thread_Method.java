class ThreadMethod extends Thread {
//    public ThreadMethod(String name) {
//        super(name);
//    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 7) {
//            System.out.println("Thread is Running ");
            System.out.println(" Thread 1 is Running Name : " + this.getName());
            try {
                Thread.sleep(1625);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}


class ThreadMethod2 extends Thread {
//    public ThreadMethod2(String name) {
//        super(name);
//    }

    @Override
    public void run() {
        int i = 0;
        while (i <= 7) {
//            System.out.println("Thread is Running ");
            System.out.println(" Thread 2 is Running Name : " + this.getName());
            i++;
        }
    }
}

public class Thread_Method {
    public static void main(String[] args) {
      ThreadMethod t1 = new ThreadMethod();
      ThreadMethod2 t2 = new ThreadMethod2();
      t1.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
////            throw new RuntimeException(e);
//            System.out.println(e);
//        }
        t2.start();
    }
}
