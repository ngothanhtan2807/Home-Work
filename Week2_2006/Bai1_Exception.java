package Week2_2006;

import java.util.Arrays;

public class Bai1_Exception {
    public static int[] convert(String[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = convertString(numbers[i]);
        }
        return result;
    }

    public static int convertString(String s) {
        int res = 0;
        try {
            res = Integer.parseInt(s);
        } catch (Exception e) {
            System.out.println("cant parse");
            System.out.println(e.getMessage());
            char[] s1 = s.toCharArray();
            for (int i = 0; i < s1.length; i++) {
                res += Integer.parseInt(Integer.toOctalString(s1[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(convert(new String[] { "ab", "a", "b", "19" })));
    }
}
