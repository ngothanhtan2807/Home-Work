package Week2;

public class Bai10 {
    public static void pyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
