package Week3_2606;

public abstract class Car {
    public String brand;
    private String color;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start();

    public void stop() {
        System.out.println("car stopped");
    }

    public void displayInfo() {
        System.out.println("brand: " + brand);
        System.out.println("color: " + color);
    }
}
