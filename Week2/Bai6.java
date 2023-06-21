package Week2;

public class Bai6 {
    public static void evaluate(int score) {
        if (score >= 0 && score <= 100) {
            if (score <= 19) {
                System.out.println("E");
            } else if (score <= 39) {
                System.out.println("D");
            } else if (score <= 59) {
                System.out.println("C");
            } else if (score <= 79) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        } else {
            System.out.println("score invalid");
        }
    }

    public static void main(String[] args) {
        evaluate(80);
    }
}
