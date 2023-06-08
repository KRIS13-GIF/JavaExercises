package Day4.Dog;

public class main {
    public static void main(String[] args) {
        Dog dog=new Dog("Male", "Pitbull");
        Dog dog1=new Dog("Mike", 7, "Male", "Pitbull", 58);
        System.out.println(dog.toString());
        System.out.println(dog1.toString());

        dog1.setAge(757);
        System.out.println(dog1.getAge());

        dog1.setWeight(500);
        System.out.println(dog1.getWeight());
    }
}
