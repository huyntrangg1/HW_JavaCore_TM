import entity.Student;
import handle.StudentHandle;
import menu.Menu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Student[] sutdents = new Student[menu.inputNumber(sc)];
        StudentHandle studentHandle = new StudentHandle();
        for (int i = 0; i < sutdents.length; i++) {
            System.out.println("Mời bạn nhập tên student thứ " + (i + 1) + ":");
            Student product = studentHandle.creatStudent(sc);
            sutdents[i] = product;
        }
    }
}
