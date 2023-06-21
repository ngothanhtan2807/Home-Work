package Week2_2106;

import java.util.ArrayList;
import java.util.List;

public class Bai3_Collection {
    public static void insertHead(List<String> arr, String content) {
        arr.add(0, content);
        System.out.println(arr);
    }

    public static void insertTail(List<String> arr, String content) {
        arr.add(content);
        System.out.println(arr);
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>(List.of("mid"));
        insertHead(arr, "head"); // ["head", "mid"]
        insertTail(arr, "tail"); // ["head", "mid", "tail"]
    }
}
