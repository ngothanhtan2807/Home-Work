package Week3_2806.bai6;

import java.util.Map;

public class Account {
    private int id;
    private String name;

    public Account(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean rutTien(double money) {
        boolean res = false;
        if (ATM.listAccount.containsKey(this.getId())) {
            for (Map.Entry<Integer, Double> element : ATM.listAccount.entrySet()) {
                if (element.getKey() == this.getId()) {
                    if (element.getValue() < money) {
                        res = false;
                        System.out.println("tai khoan khong du, rut tien that bai");
                    } else {
                        element.setValue(element.getValue() - money);
                        System.out.println("rut thanh cong " + money + " tu account co id la " + this.getId());
                        res = true;
                    }
                }
            }
        } else {
            System.out.println("tai khoan chua dang ky");
            res = false;
        }
        return res;
    }

    public boolean napTien(double money) {
        boolean res = false;
        if (ATM.listAccount.containsKey(this.getId())) {
            for (Map.Entry<Integer, Double> element : ATM.listAccount.entrySet()) {
                if (element.getKey() == this.getId()) {
                    element.setValue(element.getValue() + money);
                    System.out.println("nap thanh cong " + money + " cho account co id la " + this.getId());
                    res = true;
                }
            }
        } else {
            System.out.println("Tai khoan chua dang ky");
            res = false;
        }
        res = true;

        return res;
    }

    public void kiemTraSoDu() {

        if (ATM.listAccount.containsKey(this.getId())) {
            for (Map.Entry<Integer, Double> element : ATM.listAccount.entrySet()) {
                if (element.getKey() == this.getId()) {
                    System.out.println("tai khoan con lai cua ban la " + element.getValue());
                }
            }
        } else {
            System.out.println("tai khoan chua dang ky");
        }
    }
}
