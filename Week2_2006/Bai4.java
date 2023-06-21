package Week2_2006;

public class Bai4 {
    public static String joinStr(String delimiter, String... strs) {
        String result = "";
        for (int i = 0; i < strs.length; i++) {
            if (i != strs.length - 1) {
                result += strs[i] + delimiter;
            } else {
                result += strs[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(joinStr(",", "a", "b", "c"));
    }
}
