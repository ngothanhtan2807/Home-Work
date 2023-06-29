package Week3_2606.bai3;

public class Main {
    public static void main(String[] args) {
        FriendContact f1 = new FriendContact("Nguyen Van A", "0123456789");
        System.out.println(f1.getName());
        System.out.println(f1.getPhoneNumber());
        f1.displayContactInfo();

        WorkContact w1 = new WorkContact("Tran Van D", "0123456789");
        System.out.println(w1.getName());
        System.out.println(w1.getPhoneNumber());
        w1.displayContactInfo();
        // f1.addContact(w1);
        // System.out.println(f1.list);
    }
}
