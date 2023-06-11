package Day5.Abstract.shape;

public class Rectange extends Shape {

    private int width;
    private int length;

    public Rectange(int width, int length) {
        this.width = width;
        this.length = length;
    }


    @Override
    public int getPerimeter() {

        return  2*(width+length);

    }
    @Override
    public int getArea() {
        return width*length;
    }
}
