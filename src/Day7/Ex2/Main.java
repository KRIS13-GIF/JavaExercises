package Day7.Ex2;

import java.nio.file.LinkPermission;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);

        // Firstly I have created the
        Thread t1=new Thread(new Emp("Kris", "17:32"));
        Thread t2=new Thread(new Emp("Erald", "18:32"));
        Thread t3=new Thread(new Emp("Ervin", "19:00"));
        Thread t4=new Thread(new Emp("Mek", "20:32"));
        Thread t5=new Thread(new Emp("Marko", "21:32"));

        List<Emp>empList=new ArrayList<>();
        empList.add(new Emp("Kris", "17:32"));
        empList.add(new Emp("Erald", "18:32"));
        empList.add(new Emp("Ervin", "19:00"));
        empList.add(new Emp("Mek", "20:32"));
        empList.add(new Emp("Marko", "21:32"));


        List<Thread>threadList=new ArrayList<>();
        threadList.add(t1);
        threadList.add(t2);
        threadList.add(t3);
        threadList.add(t4);
        threadList.add(t5);

        for (Thread thread:threadList){
            thread.start();
        }
        for (Thread thread:threadList){  // stop the threads
            thread.join();
        }
        System.out.println("Which do you want to release: ");
        String name=scanner.next();
        for (int i=0; i<empList.size(); i++){
            if (empList.get(i).getName().equals(name)){
                threadList.remove(i);
                empList.remove(i);
            }
        }
        List<Thread2>threadList2=new ArrayList<>();
        for (Emp emp: empList){
            Thread2 thread2=new Thread2(emp);
            threadList2.add(thread2);
        }

        for (Thread2 thread2: threadList2){
            thread2.run();
        }
































    }
}
