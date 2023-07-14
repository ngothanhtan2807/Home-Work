package Week3_2806.bai1;

public class Main {
    public static void main(String[] args) {
        Persion p1 = new Employee("Employee1", 19);
        Persion p2 = new Engineer("Engineer1", 19);
        Persion p3 = new Manager("Manager1", 19);

        p1.getJob();
        p2.getJob();
        p3.getJob();
    }
}
