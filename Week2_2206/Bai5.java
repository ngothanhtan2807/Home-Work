package Week2_2206;

import java.util.HashMap;
import java.util.Map;

public class Bai5 {
    public static HashMap<String, Double> storeStudents() {
        HashMap<String, Double> student = new HashMap<>();
        student.put("Nguyen Van A", 9.0);
        student.put("Nguyen Van B", 7.0);
        student.put("Nguyen Van C", 5.7);
        student.put("Nguyen Van D", 9.5);
        student.put("Nguyen Van E", 6.9);
        student.put("Nguyen Van F", 9.3);

        return student;

    }

    public static String printHashMap(HashMap<String, Double> input) {
        String result = "";
        for (Map.Entry<String, Double> entry : input.entrySet()) {
            result += "Name: " + entry.getKey() + " Score: " + entry.getValue() + "\n";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(printHashMap(storeStudents()));
    }
}
