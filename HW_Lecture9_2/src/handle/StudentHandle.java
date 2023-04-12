package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student creatStudent(Scanner sc) {
        Student student = new Student();
        System.out.print("Nhập tên: ");
        student.setName(sc.nextLine());
        System.out.print("Nhập tuổi: ");
        student.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập địa chỉ: ");
        student.setAddress(sc.nextLine());
        System.out.print("Nhập điểm: ");
        student.setPoint(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập lớp: ");
        student.setClassroom(sc.nextLine());
        return student;
    }
    
    //1.xem ds hs
    public void displayAllProduct(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    //2.Thêm học sinh mới
    //3.Cập nhập điểm học sinh



    //4.Xóa học sinh



    //5.Xem danh sách học sinh



    //6.Sắp xếp theo tuổi



    //7.Sắp xếp theo điểm
}
