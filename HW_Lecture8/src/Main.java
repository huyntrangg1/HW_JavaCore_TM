import entity.Student;
import handle.StudentHandle;
import view.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Mời bạn nhập số lượng student muốn tạo: ");
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];
        StudentHandle studentHandle = new StudentHandle();

        for (int i = 0; i < n; i++) {
            Student student = studentHandle.creatStudent(sc);
            students[i] = student;
        }
        studentHandle.displayAllStudent(students);
        studentHandle.percentageEachGrade(students);
    }
}
