package Week2_2006;

// import Week2_2006.Exercise;
@FunctionalInterface
interface Sum {
    public void sum();

    default void add11() {
        System.out.println("default");
    };

    static void add2() {
        System.out.println("static");
    };
}

public class Main {
    public static void main(String[] args) {
        Exercise e1 = new Exercise();
        // System.out.println(e1.chia2So(10, 0));

        // System.out.println(e1.firstCharString("123456789"));
        // System.out.println(e1.isEven(8));
        // short a = 12, b = 12;
        // System.out.println(e1.sumShort(a, b));
        // System.out.println(e1.factorial(0));
        double[] arr = { 1, 3, 4, 5, 8 };
        System.out.println(e1.plusAverage(arr));
        // System.out.println(e1.findMax(111, 1111));
        // System.out.println(e1.triangle(0, 4));
        // System.out.println(e1.lastChartString("123456789"));
        // e1.pyramic(6);
        Sum s = () -> System.out.println("11111");
        s.sum();
        s.add11();
        Sum.add2();
    }
}
