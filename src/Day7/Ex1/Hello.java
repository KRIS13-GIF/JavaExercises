package Day7.Ex1;


import java.util.Random;

public class Hello implements Runnable {

    Random random = new Random();
    private volatile boolean exit = true;
    private int nr;

    public Hello(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        int count=0;
        while (exit) {
            try {
                if (count==3){
                   stopThread();
                }
                else {
                    Thread.sleep(5000);
                    this.setValue(random.nextInt(10));
                    System.out.println(Thread.currentThread().getId() + " Hello " + nr);
                    count++;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void stopThread() {
        this.exit = false;
    }


    public void setValue(int value) {
        this.nr = value;
    }
}
