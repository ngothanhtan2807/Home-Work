package Week3_2806.bai5;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String studentName;

    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student: \n ID:" + this.studentID + "\t Name: " + this.studentName;
    }

    public boolean dangKyHocPhan(Course course) {
        boolean res = false;
        if (!Enrollment.listCourse.contains(course) || !Enrollment.listStudent.contains(this)) {
            System.out.println(
                    "Student " + this.getStudentName() + " hoac Course " + course.getCourseName() + " khong ton tai");
            res = false;
        } else {
            if (Enrollment.dsDangKyHocPhan.containsKey(this.getStudentID())) {
                if (Enrollment.dsDangKyHocPhan.get(this.getStudentID()).contains(course.getCourseId())) {
                    res = false;
                    System.out.println("Student " + this.getStudentName() + " da dang ky mon " + course.getCourseName()
                            + " truoc do");
                } else {
                    Enrollment.dsDangKyHocPhan.get(this.getStudentID()).add(course.getCourseId());
                }
                res = true;
            } else {
                Enrollment.dsDangKyHocPhan.put(this.getStudentID(), new ArrayList<>(List.of(course.getCourseId())));
                System.out.println(
                        "Student " + this.getStudentName() + " dang ki thanh cong mon hoc " + course.getCourseName());
                res = true;
            }
        }
        return res;
    }

}
