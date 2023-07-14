package Week3_2806.bai1;

public class Manager extends Persion {

    public Manager(String name, int age) {
        super(name, age);
    }

    @Override
    public void getJob() {
        System.out.println("this is a manager");
    }

}
