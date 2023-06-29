package Week3_2606.bai6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPhone i1 = new IPhone(
                new ArrayList<Photo>(List.of(new Photo("cat.jpg"), new Photo("cat1.jpg"), new Photo("cat2.jpg"))));
        IPhone i2 = new IPhone();
        i2.getPhoto();

        i1.airdrop(i2, "cat.jpg");
        i2.getPhoto();
    }
}
