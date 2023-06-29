package Week3_2606.bai2;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double caculateArea() {
        return this.width * this.height;
    }

    @Override
    public double caculatePerimeter() {
        return (this.width + this.height) * 2;
    }

}
