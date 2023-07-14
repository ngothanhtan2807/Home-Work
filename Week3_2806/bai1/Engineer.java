package Week3_2806.bai1;

public class Engineer extends Persion {

    public Engineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void getJob() {
        System.out.println("this is a engineer");
    }

}
