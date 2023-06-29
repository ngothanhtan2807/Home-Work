package Week3_2606.bai3;

public class FriendContact implements Contact {
    private String name;
    private String phoneNumber;

    public FriendContact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    // public void addContact(Contact c) {
    // this.list.add(c);

    // }

    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + name + " ---- Phone number: " + phoneNumber);
    }

}
