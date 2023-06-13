package Day7.Ex2;

import java.util.Date;

public class Emp implements Runnable {
    private String name;
    private String time;
    private boolean stop = false;

    public Emp(String name, String time) {
        this.name = name;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setDate(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println(this.getTime() + " come at work");

        try {
            while (!stop) {
                Thread.sleep(5000);
                System.out.println(this.getName() + " is still at work");
                Thread.sleep(6000);
                stop();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void stop(){
        stop=true;
    }

    public void resumeThread(){
        stop=true;
    }


}
