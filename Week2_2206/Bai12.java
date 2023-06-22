package Week2_2206;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class Bai12 {
    public static TreeMap<String, Integer> countLoopString() {
        String input = "Everyone knows that paper is made from trees. But when one looks at trees, one cannot imagine that something so soft and fragile as the paper is made is so hard and strong. Plant materials such as wood are made of fibres known as cellulose.";
        String[] arrInput = input.replace(".", "").replace(",", "").split(" ");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arrInput));
        System.out.println("length of input" + arrInput.length);

        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println(hashSet);

        System.out.println("size hashset: " + hashSet.size());
        TreeMap<String, Integer> result = new TreeMap<>();
        int count = 0;
        for (String string : hashSet) {
            for (int j = 0; j < list.size(); j++) {
                if (string.equals(list.get(j))) {
                    count++;
                }
            }
            result.put(string, count);
            count = 0;
        }

        return result;
    }

    public static String print(TreeMap<String, Integer> input) {
        String res = "";
        int count = 0;
        for (Map.Entry<String, Integer> item : input.entrySet()) {
            res += item.getKey() + ": " + item.getValue() + "\n";
            count += item.getValue();
        }
        System.out.println("count: " + count);
        return res;
    }

    public static void main(String[] args) {
        // System.out.println(print(countLoopString()));
        // System.out.println("a" == "a");
        String a = " ";
        a.hashCode();
    }
}
