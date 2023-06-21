package Week2;

public class Bai7 {
    public static int compare(int a, int b) {
        // if (a < b) {
        // return -1;
        // }
        // if (a > b) {
        // return 1;
        // }
        return (a == b ? 0 : a > b ? 1 : -1);
    }

    public static void main(String[] args) {
        System.out.println(compare(1, 4));
    }
}
