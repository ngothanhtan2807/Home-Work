package Week3_2706;

public final class Child extends Parent {
    public void childMethod() {
        System.out.println("this is child method");
        System.out.println("accessing proteced value from parent class: " + protectedValue);
        protectedMethod();
    }
}
