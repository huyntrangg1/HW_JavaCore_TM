package menu;

import entity.Classroom;
import entity.Student;
import handle.ClassHandle;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void selectOption(Classroom classroom, ArrayList<Classroom> classrooms, Scanner sc) {
        ClassHandle classHandle = new ClassHandle();
        ArrayList<Student> students = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("1. Hiển thị danh sách lớp.");
            System.out.println("2. Thêm sinh viên. ");
            System.out.println("3. Cập nhật học lực sinh viên.");
            System.out.println("4. Xoá sinh viên nghỉ học. ");
            System.out.println("5. Thoát.");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    classHandle.displayClassroom(classrooms);
                    break;
                case 2:
                    classHandle.addStudent(classroom,students, sc);
                    break;
                case 3:
                    classHandle.updateGrade(classroom,students,sc);
                    break;
                case 4:
                    classHandle.removeStudent(classroom,students,sc);
                    break;
                case 5:
                    System.out.println("Thoát khỏi chương trình...");
                    flag = false;
                    break;
            }
        }
    }
}
