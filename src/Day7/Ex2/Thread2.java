package Day7.Ex2;

public class Thread2  implements Runnable {

    private Emp emp;

    public Thread2(Emp emp) {
        this.emp=emp;

    }


    @Override
    public void run() {

        try {
            System.out.println(this.emp.getName()+ " is still inside the list");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
