package Week2_2206;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Bai10 {
    public static ArrayList<String> removeString() {
        ArrayList<String> input = new ArrayList<>(List.of("a", "b", "a", "C", "d", "c"));
        System.out.println("Truoc khi xoa phan tu trung lap:");
        System.out.println(input);
        HashSet<String> convert = new HashSet<>(input);
        ArrayList<String> output = new ArrayList<>(convert);
        System.out.println("Sau khi xoa phan tu trung lap:");
        return output;

    }

    public static void main(String[] args) {
        System.out.println(removeString());
    }
}
