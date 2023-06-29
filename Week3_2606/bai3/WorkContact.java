package Week3_2606.bai3;

public class WorkContact implements Contact {
    private String name;
    private String phoneNumber;

    public WorkContact(String name, String phoneNumber) {
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

    @Override
    public void displayContactInfo() {
        System.out.println("Name: " + name + " ---- Phone number: " + phoneNumber);
    }

}
