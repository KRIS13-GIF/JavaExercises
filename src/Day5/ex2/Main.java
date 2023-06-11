package Day5.ex2;

public class Main {
    public static void main(String[] args) {
        Animal animals[]=new Animal[2];
        Dog dog=new Dog("kris", 5, "white");
        Cat cat=new Cat("Mia", 3, "pink");

        animals[0]=dog;
        animals[1]=cat;

        for(Animal a:animals){
            a.yieldVoice(); // taken from the child
            a.animal(); // taken from the parent
        }




    }
}
