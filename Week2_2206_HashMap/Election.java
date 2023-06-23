package Week2_2206_HashMap;

import java.util.HashMap;
import java.util.Map;

//Tạo class Election (cuộc bầu cử), cung cấp 2 method là vote và winner
public class Election {
    HashMap<String, Integer> candidates = new HashMap<>();

    public void vote(String name) {

        if (candidates.containsKey(name)) {
            for (Map.Entry<String, Integer> element : candidates.entrySet()) {
                if (element.getKey().equals(name)) {
                    element.setValue(element.getValue() + 1);
                }
            }
        } else {
            candidates.put(name, 1);
        }
    }

    public void winner() {
        int max = 0;
        String value = "";
        for (Map.Entry<String, Integer> element : candidates.entrySet()) {
            if (element.getValue() > max) {
                max = element.getValue();
                value = element.getKey();
            }
        }
        System.out.println("Winner is: " + value + " with " + max + " vote");
    }

    public static void main(String[] args) {
        Election e1 = new Election();
        e1.vote("Obama");
        e1.vote("nguyen van a");
        e1.vote("nguyen van a");
        e1.vote("nguyen van a");
        e1.vote("nguyen van b");
        e1.vote("nguyen van b");
        e1.vote("nguyen van b");
        e1.vote("nguyen van b");
        e1.vote("nguyen van b");
        System.out.println(e1.candidates);
        e1.winner();

    }
}
