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
        boolean isContain = false;
        int count = 0;
        List<Book> listBook = Library.listBook;
        if (!checkContain(book)) {
            System.out.println("thu vien khong co sach " + book.getName());
            res = false;
        } else {
            if (!Library.listMember.containsKey(this)) {
                System.out.println("list member chua ton tai " + this.getName());
                System.out.println("----------------------");
                Library.listMember.put(this, new ArrayList<>(List.of(book)));
                res = true;
                System.out.println("sau khi them " + this.getName());
                System.out.println(Library.listMember);
            } else {
                // if listmem contain this
                System.out.println("list da ton tai " + this.getName());
                Book b = null;
                for (int i = 0; i < Library.listMember.get(this).size(); i++) {
                    b = Library.listMember.get(this).get(i);
                    System.out.println("book: ");
                    System.out.println(b);
                    System.out.println("---------------");
                    if (b.getName().equalsIgnoreCase(book.getName())) {
                        // b.setQuantity(b.getQuantity() + book.getQuantity());
                        count++;

                        // } else {
                        // Library.listMember.get(this).add(book);
                    }
                }
                if (count < Library.listMember.get(this).size()) {
                    Library.listMember.get(this).add(book);

                } else {
                    b.setQuantity(b.getQuantity() + book.getQuantity());
                }
            }
            for (int i = 0; i < listBook.size(); i++) {
                if (listBook.get(i).getName().equalsIgnoreCase(book.getName())) {
                    listBook.get(i).setQuantity(listBook.get(i).getQuantity() - book.getQuantity());
                    break;
                }
            }
            res = true;
        }
        return res;
    }

    public boolean traSach(Book book) {
        boolean res = false;
        if (!Library.listMember.containsKey(this) || Library.listMember.get(this).size() == 0) {
            System.out.println("ban chua muon sach");
            res = false;
        } else {
            for (int i = 0; i < Library.listBook.size(); i++) {
                if (Library.listBook.get(i).getName().equalsIgnoreCase(book.getName())) {
                    System.out.println("xxxxxxxxxxxxxxxxxxx");
                    List<Book> element = Library.listMember.get(this);
                    for (int j = 0; j < element.size(); j++) {
                        if (book.getName().equalsIgnoreCase(element.get(j).getName())) {
                            element.get(j).setQuantity(element.get(j).getQuantity() - book.getQuantity());
                            Library.listBook.get(i)
                                    .setQuantity(Library.listBook.get(i).getQuantity() + book.getQuantity());
                        }
                    }
                    res = true;
                } else {
                    // System.out.println(book.getName() + " khong thuoc danh sach cua thu vien");
                    res = false;
                }
            }
        }
        return res;
    }

    public boolean checkContain(Book book) {
        boolean res = false;
        for (int i = 0; i < Library.listBook.size(); i++) {
            if (Library.listBook.get(i).getName().equalsIgnoreCase(book.getName())) {
                res = true;

                break;
            }
        }
        return res;
    }
    // public boolean checkContainInListMember(Member member, Book book) {
    // boolean res = false;
    // for (int i = 0; i < Library.listBook.size(); i++) {
    // if (Library.listBook.get(i).getName().equalsIgnoreCase(book.getName())) {
    // res = true;

    // break;
    // }
    // }
    // return res;
    // }
}
