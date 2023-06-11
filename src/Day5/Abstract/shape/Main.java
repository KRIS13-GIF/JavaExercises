package Day5.Abstract.shape;

public class Main {
    public static void main(String[] args) {
        Shape rect=new Rectange(5,6);
        Shape circle=new Circle(3);

        System.out.println(circle.getArea());
        System.out.println(rect.getPerimeter());
    }
}
