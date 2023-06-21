package Week2_2006;

public class Demo {
    public static void main(String[] args) {

        int[] numbers = { 10, 2, 3, 4 };
        double result = devide(numbers, 0);
        System.out.println("result: " + result);

    }

    public static double devide(int[] arr, int divisor) {
        double result = 0;
        try {
            result = arr[6] / divisor;
        } catch (Exception e) {
            System.out.println("message: " + e.getMessage());
            result = 0;
        }
        return result;
    }
}
