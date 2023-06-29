package Week3_2606.bai2;

public class Triangle extends Shape {
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double caculateArea() {
        double haftPerimeter = caculatePerimeter() / 2;
        return Math.sqrt(haftPerimeter * (haftPerimeter - edge1) * (haftPerimeter - edge2) * (haftPerimeter - edge3));
    }

    @Override
    public double caculatePerimeter() {
        return this.edge1 + this.edge2 + this.edge3;
    }

}
