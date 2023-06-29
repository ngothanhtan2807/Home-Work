package Week3_2806.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member: " + name + " ----Age: " + age;

    }

    public boolean muonSach(Book book) {
        boolean res = false;
        List<Book> listBook = Library.listBook;
        for (int i = 0; i < Library.listBook.size(); i++) {
            if (Library.listBook.get(i).getName().equalsIgnoreCase(book.getName())) {
                if (Library.listBook.get(i).getQuantity() < book.getQuantity()) {
                    System.out.println("so luong sach con lai khong du");
                    res = false;
                } else {

                    if (Library.listMember.size() == 0 || !Library.listMember.containsKey(this)) {
                        Library.listMember.put(this, new ArrayList<>(List.of(book)));
                    } else {
                        // size > 0
                        for (Map.Entry<Member, List<Book>> member : Library.listMember.entrySet()) {
                            if (this.getName().equalsIgnoreCase(member.getKey().getName())) {// ton tai mem
                                for (int j = 0; j < member.getValue().size(); j++) {
                                    if (member.getValue().get(j).getName().equalsIgnoreCase(book.getName())) {
                                        member.getValue().get(i).setQuantity(
                                                member.getValue().get(i).getQuantity() + book.getQuantity());
                                    } else {

                                        member.getValue().add(book);
                                    }
                                }
                            }
                        }

                    }
                    listBook.get(i).setQuantity(listBook.get(i).getQuantity() - book.getQuantity());
                    res = true;
                }
            }

        }
        return res;
    }

    public boolean traSach(Book book) {
        boolean res = false;
        if (!Library.listMember.containsKey(this) || Library.listMember.get(this).size() == 0) {
            System.out.println("ban chua muon sach");
            res = false;
        } else {

        }
        return res;
    }
}
