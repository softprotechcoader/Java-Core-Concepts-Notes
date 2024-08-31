class MyThread extends Thread{
    public MyThread (String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        while (i<=7){
            System.out.println("Thread is Running ");
            i++;
        }


    }
}

public class Thread_Constructors {
    public static void main(String[] args) {
    MyThread t1 = new MyThread("Ayush");
    t1.start();
        System.out.println("Id of Thread t1 : "+ t1.getId());
        System.out.println("Name of Thread t1 : "+ t1.getName());

    }
}
