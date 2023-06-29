package Week3_2606.bai7;

public class Main {
    public static void main(String[] args) {
        Library l1 = new Library();
        l1.print();
        l1.addBook(new Book("Harry Potter", "J. K. Rowling"), new Book("Theory of Everything", "Steven Howking"));
        l1.print();
        l1.addBook(new Book("Harry Potter11", "J. K. Rowling"));
        l1.print();
        System.out.println(l1.removeByAuthor("J. K. Rowling"));
        l1.print();
        l1.removeByTitle("Theory of Everything");

        l1.print();
    }
}
