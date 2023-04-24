package menu;

import entity.Staff;
import handle.StaffHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void selectOption(Scanner sc) {
        StaffHandle staffHandle = new StaffHandle();
        ArrayList<Staff> listStaff = new ArrayList<>();
        while (true) {
            System.out.println("Bạn có thể thực hiện các công việc sau: ");
            System.out.println("1 - Nhập danh sách nhân viên");
            System.out.println("2 - Hiển thị danh sách nhân viên");
            System.out.println("3 - Xóa nhân viên");
            System.out.println("4 - Sửa thông tin nhân viên.");
            System.out.println("5 - Tìm kiếm nhân viên theo lương");
            System.out.println("6 - Sắp xếp nhân viên theo họ tên và thu nhập");
            System.out.println("7 - Xuất 5 nhân viên có thu nhập cao nhất công ty");
            System.out.println("8 - Thoát chương trình.");
            System.out.print("Nhập lựa chọn của bạn: ");
            int option;
            try {
                option = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chọn một số hợp lệ!");
                continue;
            }
            switch (option) {
                case 1:
                    staffHandle.createStaff(listStaff, sc);
                    break;
                case 2:
                    staffHandle.displayList(listStaff);
                    break;
                case 3:
                    staffHandle.removeStaff(listStaff, sc);
                    break;
                case 4:
                    staffHandle.updateInfor(listStaff, sc);
                    break;
                case 5:
                    staffHandle.findStaffBySalary(listStaff, sc);
                    break;
                case 6:
                    System.out.println("Chọn thông tin của nhân viên bạn cần nhập: ");
                    System.out.println("1. Sắp xếp nhân viên theo thu nhập.");
                    System.out.println("2. Sắp xếp nhân viên theo họ tên");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1:
                            staffHandle.sortByIncome(listStaff);
                            break;
                        case 2:
                            staffHandle.sortByName(listStaff);
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 7:
                    staffHandle.topFiveStaff(listStaff);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }
}