package Week2_2006;

public class Bai2 {
    public static String findChar(String str, int index) {
        // char result;
        try {
            System.out.println(str.length());
            return "result: " + str.toCharArray()[index - 1];
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return "null";

        }
    }

    public static void main(String[] args) {
        System.out.println(findChar("Devera KITs", 7));
    }
}
