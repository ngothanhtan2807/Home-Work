package Week3_2606.bai6;

import java.util.ArrayList;
import java.util.List;

public class IPhone {
    List<Photo> list = new ArrayList<>();

    public IPhone(List<Photo> list1) {
        this.list.addAll(list1);
    }

    public IPhone() {
    }

    public void airdrop(IPhone other, String id) {
        other.list.add(new Photo(id));
    }

    public void getPhoto() {
        System.out.println(list);
    }
}
