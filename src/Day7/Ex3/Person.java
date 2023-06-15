package Day7.Ex3;

import java.util.Date;

public class Person {
    private String fname;
    private String lname;
    private String dataOfBirth;


    public Person(String fname, String lname, String dataOfBirth) {
        this.fname = fname;
        this.lname = lname;
        this.dataOfBirth = dataOfBirth;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDataOfBirth() {
        return dataOfBirth;
    }

    public void setDataOfBirth(String dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }
}
