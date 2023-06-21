package Week2_1906;

public class Bai9 {
    public static void printEven(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printEven(10);
    }
}
