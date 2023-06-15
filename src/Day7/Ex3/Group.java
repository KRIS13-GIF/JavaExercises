package Day7.Ex3;

public class Group {
    Student student1;
    Student student2;
    Student student3;
    Student student4;
    Trainer trainer;


    public Group(Student student1, Student student2, Student student3, Student student4, Trainer trainer) {
        this.student1 = student1;
        this.student2 = student2;
        this.student3 = student3;
        this.student4 = student4;
        this.trainer = trainer;
    }

    public Group(Student student1, Student student2, Student student3, Trainer trainer){
        this.student1=student1;
        this.student2=student2;
        this.student3=student3;
    }


    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student student1) {
        this.student1 = student1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public Student getStudent3() {
        return student3;
    }

    public void setStudent3(Student student3) {
        this.student3 = student3;
    }

    public Student getStudent4() {
        return student4;
    }

    public void setStudent4(Student student4) {
        this.student4 = student4;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
