package Week2_2206;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static List<String> sorList() {
        List<String> input = new ArrayList<>(List.of("ab", "sa", "d", "c", "e", "q", "aa", "1111111", "111"));
        System.out.println("Danh sach chua sap sep dau vao: ");
        System.out.println(input);
        String temp;
        for (int i = 0; i < input.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (input.get(i).compareTo(input.get(j)) < 0) {
                    temp = input.get(i);
                    input.set(i, input.get(j));
                    input.set(j, temp);

                }
            }
        }
        System.out.println("Danh sach sau khi sap sep la: ");
        return input;
    }

    public static void main(String[] args) {
        System.out.println(sorList());
    }
}
