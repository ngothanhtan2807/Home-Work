package Week2_2206;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Bai18 {
    public static List<Integer> sortLinkedList() {
        List<Integer> list = Bai1.createRandomArray();
        LinkedList<Integer> linkedList  = new LinkedList<Integer>(list);
        // linkedList.stream().sorted(Comparator.reverseOrder());
        // int temp = linkedList.get(0);
        // for (int i = 0; i < linkedList.size(); i++) {
        //     for (int j = 1; j < linkedList.size(); j++) {
                
        //     }
        // }
        linkedList.sort(Comparator.reverseOrder());
        return linkedList;
    }
    public static void main(String[] args) {
        System.out.println(sortLinkedList());
    }
}
