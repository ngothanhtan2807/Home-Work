package Week2_2006;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static List<Character> dedupe(String str) {
        List<Character> result = new ArrayList<>();
        char[] input = str.toCharArray();
        int i, j;
        char start;
        int count = 0;
        for (i = 0; i < input.length; i++) {
            start = input[i];
            for (j = i + 1; j < input.length; j++) {
                if (start == input[j]) {
                    count++;
                }
            }
            if (count >= 1) {
                System.out.println(input[i]);
                System.out.println("count: " + count);
                if (!result.contains(input[i])) {

                    result.add(input[i]);
                }
            }
            count = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("-------");
        System.out.println(dedupe("abCCdaCa").toString());
    }
}
