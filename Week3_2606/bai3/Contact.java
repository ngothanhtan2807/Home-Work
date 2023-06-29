package Week3_2606.bai3;

import java.util.ArrayList;
import java.util.List;

public interface Contact {
    List<Contact> list = new ArrayList<>();

    String getName();

    String getPhoneNumber();

    void displayContactInfo();
}
