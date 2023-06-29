package Week3_2606.bai1;

public class CollegeStudent extends Student {

    public CollegeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "name: " + name + " age: " + age;
    }
}
