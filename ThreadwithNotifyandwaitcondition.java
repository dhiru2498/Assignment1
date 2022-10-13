public class Newclass {
    public synchronized void odd() throws InterruptedException {
        for(int i=0;i<=10;i++){
            if(i%2!=0)
            {
                System.out.println("odd"+i);
                notify();
            }
            else
            {
                wait();
            }
        }

    }

    public synchronized void even() throws InterruptedException {
        for (int j = 0; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println("even"+j);
                notify();
            }
            else
            {
                wait();
            }
        }
    }

    public static void main(String[] args) {
        Newclass obj = new Newclass();


        class Thread1 extends Thread {
            @Override
            public void run() {
                try {
                    obj.odd();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

            class Thread2 extends Thread {
                @Override
                public void run() {
                    try {
                        obj.even();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        Thread1 t1=new Thread1();
        t1.setName("OT");
        Thread2 t2=new Thread2();
        t1.setName("ET");
        t1.start();
        t2.start();

        }

}

