public class Demosync {
    int count = 0;

    public int increment() {
        System.out.println("I am not synchronized"+ Thread.currentThread().getName());
        synchronized (this)
        {
            count++;
       }


        return count;
    }

    public static void main(String[] args) throws InterruptedException {

        Demosync obj = new Demosync();
        for (int i = 0; i <= 1000; i++) {
            obj.increment();

        class T1 extends Thread {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    obj.increment();
                    //System.out.println(i + Thread.currentThread().getName());
                }
                //System.out.println(obj.increment());
                // super.run();
            }
        }
        class T2 extends Thread {

            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    obj.increment();
                    //System.out.println(i + Thread.currentThread().getName());
                }
               // System.out.println(obj.increment());
                super.run();
            }
        }

        T1 t=new T1();


        T2 t2=new T2();
        t.start();
        t2.start();

        Thread.sleep(1000);
            System.out.println(obj.count);

        }
    }
}

