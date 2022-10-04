public class MyThread extends Thread {
        public void run() {
            for(int i=0;i<=10;i++)
            {
                System.out.println(i +Thread.currentThread().getName());
            }
            System.out.println("I am custom thread: "+Thread.currentThread().getName());
        }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        System.out.println("I am main thread: "+Thread.currentThread().getName());
        t1.setName("My name thread");
        t1.start();
        t1.join();
        for(int i=0;i<=10;i++)
        {
            System.out.println(i +Thread.currentThread().getName());
        }


    }

    }
