package Day5.Interface;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle=new Rectangle(5,6,4);
        Circle circle=new Circle(3);


        circle.say();
        System.out.println(circle.getArea());

        System.out.println("--------------------------");
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.noEdges());
    }
}
