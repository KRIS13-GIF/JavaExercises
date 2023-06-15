package Day7.Ex3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();

        studentList.add(new Student("Kris", "Beka", "2002", true));
        studentList.add(new Student("Erald", "Caka", "2002", true));
        studentList.add(new Student("Ervin", "Balla", "2002", true));
        studentList.add(new Student("Mek", "Skendo", "2002", false));
        studentList.add(new Student("Marko", "Kushta", "2002", true));
        studentList.add(new Student("Petro", "Gjergo", "2002", true));
        studentList.add(new Student("Omar", "Vorpsi", "2002", false));
        studentList.add(new Student("Denis", "Lekli", "1999", false));
        studentList.add(new Student("Daniel", "Mece", "2002", false));
        studentList.add(new Student("Endi", "Trico", "2001", true));
        studentList.add(new Student("Laura", "Buzi", "2002", true));
        studentList.add(new Student("Dior", "Hamja", "2002", false));
        studentList.add(new Student("Ersi", "Spahija", "2002", true));
        studentList.add(new Student("Besa", "Kaziu", "2001", false));
        studentList.add(new Student("Nelsi", "Nexhipi", "2000", true));

        List<Trainer>trainerList=new ArrayList<>();
        trainerList.add(new Trainer("Elton", "Ballhysa", "1975", true));
        trainerList.add(new Trainer("Miralda", "Cuka", "1990", false));
        trainerList.add(new Trainer("George", "Prokopakis", "1963", true));
        trainerList.add(new Trainer("Olta", "Sula","1980", false));



        


    }
}
