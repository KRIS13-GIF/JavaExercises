package Learn.Thread;


public class Main {
    public static void main(String[] args) {

        Thread t1=new Thread(new Threads()); // object inside thread
        Thread t2=new Thread(new Threads()); // object inside thread
        t1.start();
        t2.start();
    }

}
