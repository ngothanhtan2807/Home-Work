package test;

import Week3_2606.Car;
import Week3_2606.SportCar;
import Week3_2706.Parent;

public class Test extends Parent {
    public void test() {
        System.out.println("this is child method");
        System.out.println("accessing proteced value from parent class: " + protectedValue);
        protectedMethod();
    }
}
