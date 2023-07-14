package Week3_2806.bai6;

import java.util.HashMap;

public class ATM {
    public static HashMap<Integer, Double> listAccount = new HashMap<>();

    public boolean dangKyTaiKhoan(Account acc) {
        if (listAccount.containsKey(acc.getId())) {
            System.out.println("user ID da ton tai");
            return false;
        } else {
            System.out.println("dang ky tai khoan thanh cong");
            listAccount.put(acc.getId(), 0.0);
            return true;
        }
    }
}
