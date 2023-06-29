package Week3_2606;

public class Main {
    public static void main(String[] args) {
        // Main m1 = new Main();
        SportCar c1 = new SportCar("car1", "red", 1111);
        c1.start();
        c1.stop();
        System.out.println(c1.brand);
        System.out.println(c1.getPrice());
    }

}
