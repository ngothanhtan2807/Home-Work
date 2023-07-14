package Week3_2806.bai6;

public class Transaction {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account acc1 = new Account(1, "nguyen van a");
        Account acc2 = new Account(2, "nguyen van a");
        atm.dangKyTaiKhoan(acc1);
        atm.dangKyTaiKhoan(acc2);
        System.out.println(ATM.listAccount);
        acc1.napTien(100000d);
        acc1.rutTien(100000);
        System.out.println(ATM.listAccount);
        acc1.kiemTraSoDu();
    }
}
