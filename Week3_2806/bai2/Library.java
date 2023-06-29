package Week3_2806.bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    public static List<Book> listBook = new ArrayList<>(
            List.of(new Book("Nha gia kim", "Author1", 50), new Book("Dac nhan tam", "Author2", 50)));
    public static HashMap<Member, List<Book>> listMember = new HashMap<>();
}
