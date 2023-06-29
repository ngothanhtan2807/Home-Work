package Week3_2606.bai7;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static List<Book> list = new ArrayList<>();

    public boolean addBook(Book... book) {
        boolean res = false;
        try {
            for (Book book2 : book) {
                list.add(book2);
            }
            res = true;
        } catch (Exception e) {
            System.out.println("xay ra loi " + e.getMessage());
            res = false;
        }
        return res;
    }

    public boolean removeByTitle(String title) {
        boolean res = false;
        if (list.size() == 0) {
            res = false;
        } else {

            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getTitle().equals(title)) {
                    list.remove(i);
                    res = true;
                    break;
                }
            }
        }

        return res;
    }

    public boolean removeByAuthor(String author) {
        boolean res = false;
        if (list.size() == 0) {
            res = false;
        } else {
            System.out.println(list.size());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getAuthor().equals(author)) {
                    list.remove(i);
                    res = true;
                    break;
                }
            }
        }

        return res;
    }

    public void print() {
        System.out.println(list);
    }
}
