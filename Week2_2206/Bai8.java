package Week2_2206;


import java.util.List;
import java.util.TreeSet;

public class Bai8 {
public static void createAndSortTreeSet() {
    List<Integer> list = Bai1.createRandomArray();
    TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
    TreeSet<Integer> res = (TreeSet<Integer>)(treeSet.descendingSet());
    
    System.out.println(treeSet);
    System.out.println(res);
}
public static void main(String[] args) {
    createAndSortTreeSet();
}
}
