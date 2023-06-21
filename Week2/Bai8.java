package Week2;

public class Bai8 {
    public static int isLeapYear(int year) {
        if (year % 4 == 0) {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2021));
    }
}
