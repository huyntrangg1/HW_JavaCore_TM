package handle;

import entity.Classroom;
import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassHandle {
    public Classroom creatClass(Classroom classroom, ArrayList<Student> students, Scanner sc) {
        System.out.println("Thông tin lớp học: ");
        System.out.println("Nhập môn học: ");
        String subject = sc.nextLine();
        classroom.setSubject(subject);
        StudentHandle studentHandle = new StudentHandle();
        students = studentHandle.createStudent(sc);
        classroom.setStudents(students);
        return classroom;
    }

    public void displayClassroom(ArrayList<Classroom> classrooms) {
        System.out.println(classrooms);
    }

    public void addStudent(Classroom classroom, ArrayList<Student> students, Scanner sc) {
        StudentHandle studentHandle = new StudentHandle();
        students = classroom.getStudents();
        students.add(studentHandle.inputStudent(sc));
        classroom.setStudents(students);
        System.out.println("Thêm thành công!");
    }

    public void updateGrade(Classroom classroom, ArrayList<Student> students, Scanner sc) {
        System.out.println("Nhập id sinh viên cần cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        students = classroom.getStudents();
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                System.out.println("Nhập học lực mới của sinh viên: ");
                students.get(i).setGrade(sc.nextLine());
                classroom.setStudents(students);
                System.out.println("Cập nhật thành công!");
                flag = true;
                classroom.setStudents(students);
            }
        }
        if (flag == false) {
            System.out.println("Không tồn tại id bạn nhập!");
        }

    }

    public void removeStudent(Classroom classroom, ArrayList<Student> students, Scanner sc) {
        students = classroom.getStudents();
        boolean flag = false;
        System.out.println("Nhập id sinh viên xin nghỉ học: ");
        int id = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getId()) {
                flag = true;
                students.remove(i);
                System.out.println("Đã xóa thành công khỏi danh sách lớp");
            }
        }
        if (flag == false) {
            System.out.println("Không tồn tại id bạn nhập!");
        }
    }
}