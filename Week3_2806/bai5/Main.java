package Week3_2806.bai5;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("st1", "nguyen van a");
        Student s2 = new Student("st2", "nguyen van b");
        Student s3 = new Student("st3", "nguyen van c");
        Student s4 = new Student("st4", "nguyen van d");

        Course c1 = new Course("course1", "toan");
        Course c2 = new Course("course2", "ly");
        Course c3 = new Course("course3", "hoa");

        Enrollment e = new Enrollment();
        e.addCourse(c1);
        e.addCourse(c2);
        e.addCourse(c3);

        e.addStudent(s1);
        e.addStudent(s2);
        e.addStudent(s3);

        System.out.println(e.listCourse);
        System.out.println(e.listStudent);
        s1.dangKyHocPhan(c3);
        s1.dangKyHocPhan(c2);
        s2.dangKyHocPhan(c2);
        s4.dangKyHocPhan(c2);
        // s1.dangKyHocPhan(c3);
        System.out.println(e.dsDangKyHocPhan);
        // e.removeStudent(s1);
        e.removeCourse(c2);
        System.out.println(e.listCourse);
        System.out.println(e.dsDangKyHocPhan);
        e.addCourse(c2);
        s1.dangKyHocPhan(c2);
        System.out.println(e.listCourse);
        System.out.println(e.dsDangKyHocPhan);
    }
}
