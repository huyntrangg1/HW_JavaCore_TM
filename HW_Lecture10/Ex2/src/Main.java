import entity.Classroom;
import entity.Student;
import handle.ClassHandle;
import handle.StudentHandle;
import menu.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        ClassHandle classHandle = new ClassHandle();
        ArrayList<Classroom> classrooms = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Classroom classroom = new Classroom();
        classrooms.add(classHandle.creatClass(classroom, students, sc));
        menu.selectOption(classroom, classrooms, sc);
    }
}
