import entity.Student;
import handle.StudentHandle;
import view.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Student[] students = new Student[menu.inputNumber(sc)];
        StudentHandle studentHandle = new StudentHandle();

        for (int i = 0; i < students.length; i++) {
            Student student = studentHandle.creatStudent(sc);
            students[i] = student;
        }
        studentHandle.displayAllStudent(students);
        studentHandle.percentageEachGrade(students);
    }
}

