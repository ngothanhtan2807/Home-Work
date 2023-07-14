package Week3_2806.bai5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class Enrollment {
    public static HashSet<Course> listCourse = new HashSet<>();
    public static HashSet<Student> listStudent = new HashSet<>();
    public static HashMap<String, List<String>> dsDangKyHocPhan = new HashMap<>();

    public static HashMap<String, List<String>> getDsDangKyHocPhan() {
        return dsDangKyHocPhan;
    }

    public static HashSet<Course> getListCourse() {
        return listCourse;
    }

    public static HashSet<Student> getListStudent() {
        return listStudent;
    }

    public boolean addStudent(Student st) {
        boolean res = false;
        if (getListStudent().contains(st)) {
            res = false;
        } else {
            getListStudent().add(st);
            res = true;
        }
        return res;
    }

    public boolean removeStudent(Student st) {
        boolean res = false;
        if (listStudent.contains(st)) {
            dsDangKyHocPhan.remove(st.getStudentID());
            res = listStudent.remove(st);

            System.out.println(res
                    ? ("xoa thanh cong student " + st.getStudentName() + " khoi danh sach cho phep dang ky hoc phan")
                    : "co loi xay ra");
        }

        else {
            System.out.println("Xoa khong thanh cong vi student " + st.getStudentName() + " khong ton tai");
            res = false;
        }
        return res;
    }

    public boolean removeCourse(Course course) {
        boolean res = false;
        if (!listCourse.contains(course)) {
            System.out.println("mon hoc can xoa khong ton tai");
            res = false;
        } else {
            for (Map.Entry<String, List<String>> element : dsDangKyHocPhan.entrySet()) {
                for (int i = 0; i < element.getValue().size(); i++) {
                    if (element.getValue().get(i).equalsIgnoreCase(course.getCourseId())) {
                        dsDangKyHocPhan.get(element.getKey()).remove(element.getValue().get(i));
                    }
                }
                // if (element.getValue().size() == 0) {
                // dsDangKyH
                // }
            }

            System.out.println("da xoa mon " + course.getCourseName());
            listCourse.remove(course);

            res = true;
        }
        return res;
    }

    public boolean addCourse(Course course) {
        boolean res = false;
        if (getListCourse().contains(course)) {
            res = false;
        } else {
            getListCourse().add(course);
            res = true;
        }
        return res;
    }

}
