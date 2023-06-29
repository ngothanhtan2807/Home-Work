package Week3_2606.bai2;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(2, 4);
        System.out.println("Area: " + r1.caculateArea());
        System.out.println("Perimeter: " + r1.caculatePerimeter());

        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println("Area: " + t1.caculateArea());
        System.out.println("Perimeter: " + t1.caculatePerimeter());
    }
}