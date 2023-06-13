package Day7.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Thread t1=new Thread(new Emp("Kris", "17:32"));
        Thread t2=new Thread(new Emp("Erald", "18:32"));
        Thread t3=new Thread(new Emp("Ervin", "19:00"));
        Thread t4=new Thread(new Emp("Mek", "20:32"));
        Thread t5=new Thread(new Emp("Marko", "21:32"));

        List<Thread>threadList=new ArrayList<>();
        threadList.add(t1);
        threadList.add(t2);
        threadList.add(t3);
        threadList.add(t4);
        threadList.add(t5);


        System.out.println(threadList.toString());



    }
}
