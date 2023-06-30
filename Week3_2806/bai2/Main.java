package Week3_2806.bai2;

public class Main {
    public static void main(String[] args) {
        Member m1 = new Member("mem1", 18);
        Member m2 = new Member("mem2", 18);

        m1.muonSach(new Book("Nha gia kim", "Author1", 1));
        m1.muonSach(new Book("Nha gia kim", "Author1", 1));
        m1.muonSach(new Book("Dac nhan tam", "Author2", 10));

        m2.muonSach(new Book("Nha gia kim", "Author1", 40));

        System.out.println("library: " + Library.listBook);
        System.out.println("member: " + Library.listMember);
        System.out.println("--------------------------------------");

        m1.traSach(new Book("Dac nhan tam1", "Author2", 10));

        System.out.println("library: " + Library.listBook);
        System.out.println("member: " + Library.listMember);
    }
}
