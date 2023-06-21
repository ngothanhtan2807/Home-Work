package Week2_1906;

public class Bai4 {
    public static void main(String[] args) {
        String s1 = "abcdef";
        char[] arrS1 = s1.toCharArray();
        String s = String.copyValueOf(arrS1);
        for (char c : arrS1) {
            System.out.print(c + " ");
        }

        // for (char c : arrS1) {
        // s += c;
        // }
        System.out.println(s);
    }
}
