package Day7.Ex3;

public class Trainer extends Person{
    private boolean isAuthorized;
    public Trainer(String fname, String lname, String dataOfBirth, boolean isAuthorized) {
        super(fname, lname, dataOfBirth);
        this.isAuthorized=isAuthorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        isAuthorized = authorized;
    }
}
