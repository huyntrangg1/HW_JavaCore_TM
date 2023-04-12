package handle;

import entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentHandle {
    public Student creatStudent(Scanner sc) {
        Student student = new Student();
        System.out.println("Nhập số lượng sinh viên muốn tạo: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n <=0 ) {
            System.out.print("Số lượng không hợp lễ. Hãy nhập lại: ");
            n = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin học sinh thứ " +(i+1) +": ");
            System.out.println("Nhập tên sinh viên: ");
            student.setName(sc.nextLine());
            System.out.println("Nhập tuổi sinh viên: ");
            student.setAge(Integer.parseInt(sc.nextLine()));
            System.out.println("Nhập học lực sinh viên: " );
            student.setGrade(sc.nextLine());
        }
       return student;
    }


    public Student inputStudent(Scanner sc) {
        Student student = new Student();
        System.out.println("Nhập tên sinh viên: ");
        student.setName(sc.nextLine());
        System.out.println("Nhập tuổi sinh viên: ");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhập học lực sinh viên: " );
        student.setGrade(sc.nextLine());
        return student;
    }

}
