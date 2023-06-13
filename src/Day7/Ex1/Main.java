package Day7.Ex1;

public class Main {
    public static void main(String[] args) {

        Thread t1=new Thread(new Hello(5));
        Thread t2=new Thread(new Hello(4));
        Thread t3=new Thread(new Hello(8));


        t1.start();
        t2.start();
        t3.start();










    }
}
