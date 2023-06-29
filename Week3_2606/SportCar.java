package Week3_2606;

public class SportCar extends Car {
    private int price;

    public SportCar(String brand, String color, int price) {
        super(brand, color);
        this.price = price;
    }

    public void start() {
        System.out.println("sport car is starting with a roar");
    }

    public int getPrice() {
        return price;
    }
}
