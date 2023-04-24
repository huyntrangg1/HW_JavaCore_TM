package handle;

import entity.Administrative;
import entity.Manager;
import entity.MarketingStaff;
import entity.Staff;

import java.util.ArrayList;
import java.util.Scanner;

public class StaffHandle {

    //1. nhap thong tin nv
    //b1: chon loai nhan vien de tao
    public void createStaff(ArrayList<Staff> listStaff, Scanner sc) {
        int choice = -1;
        do {
            System.out.println("Chọn loại nhân viên bạn muốn thêm:");
            System.out.println("1. Nhân viên hành chính");
            System.out.println("2. Nhân viên tiếp thị");
            System.out.println("3. Trưởng phòng");
            System.out.println("0. Quay lại");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng chọn một số hợp lệ!");
                continue;
            }

            switch (choice) {
                case 0:
                    System.out.println("Quay lại menu chính");
                    break;
                case 1:
                    listStaff.add(addStaff("Administrative", sc));
                    break;
                case 2:
                    listStaff.add(addStaff("Marketing", sc));
                    break;
                case 3:
                    listStaff.add(addStaff("Manager", sc));
                    break;
                default:
                    System.out.println("Vui lòng chọn một lựa chọn hợp lệ!");
                    break;
            }
        } while (choice != 0);
    }

    //b2: nhap thong tin cua loai nv da chon
    private Staff addStaff(String staffType, Scanner sc) {
        System.out.println("Nhập tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        double salary = Double.parseDouble(sc.nextLine());

        switch (staffType) {
            case "Administrative":
                return new Administrative(name, salary);
            case "Marketing":
                System.out.println("Nhập doanh số bán hàng: ");
                double revenue = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập tỉ lệ hoa hồng (%): ");
                double commissionRate = Double.parseDouble(sc.nextLine());
                return new MarketingStaff(name, salary, revenue, commissionRate);
            case "Manager":
                System.out.println("Nhập lương trách nhiệm: ");
                double responsibilitySalary = Double.parseDouble(sc.nextLine());
                return new Manager(name, salary, responsibilitySalary);
            default:
                return null;
        }
    }

    //2. hien thi ds nhan vien
    public void displayList(ArrayList<Staff> listStaff) {
        System.out.println(listStaff);
    }

    //3. xoa nhan vien khoi ds
    public void removeStaff(ArrayList<Staff> listStaff, Scanner sc) {
        System.out.println("Nhập id nhân viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;
        for (int i = 0; i < listStaff.size(); ++i) {
            if (id == listStaff.get(i).getId()) {
                flag = true;
                listStaff.remove(i);
                System.out.println("Đã xóa thành công khỏi danh sách nhân viên.");
                break;
            }
        }

        if (!flag) {
            System.out.println("Không tồn tại id bạn nhập!");
        }
    }

    //4. sua thong tin nhan vien
    public void updateInfor(ArrayList<Staff> listStaff, Scanner sc) {
        System.out.println("Nhập id nhân viên cần sửa thông tin: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean flag = false;

        for (Staff staff : listStaff) {
            if (staff.getId() == id) {
                System.out.println("Thông tin cũ của nhân viên:");
                System.out.println(staff);
                System.out.println("Nhập thông tin mới:");
                System.out.print("Họ tên: ");
                staff.setName(sc.nextLine());
                System.out.print("Lương: ");
                staff.setSalary(Double.parseDouble(sc.nextLine()));
                sc.nextLine(); // Đọc bỏ dòng mới thừa
                if (staff instanceof MarketingStaff) {
                    System.out.print("Doanh số bán hàng: ");
                    ((MarketingStaff) staff).setRevenue(Double.parseDouble(sc.nextLine()));
                    System.out.print("Tỉ lệ hoa hồng (%): ");
                    ((MarketingStaff) staff).setComissions(Double.parseDouble(sc.nextLine()));
                } else if (staff instanceof Manager) {
                    System.out.print("Lương trách nhiệm: ");
                    ((Manager) staff).setResponsibilitySalary(Double.parseDouble(sc.nextLine()));
                }
                System.out.println("Cập nhật thông tin nhân viên thành công!");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Không tồn tại id bạn nhập!");
        }

    }

    //5. tim nhan vien theo luong
    public void findStaffBySalary(ArrayList<Staff> listStaff, Scanner sc) {
        System.out.print("Nhập lương cần tìm: ");
        double salary = Double.parseDouble(sc.nextLine());
        boolean flag = false;
        for (Staff staff : listStaff) {
            if (staff.getSalary() == salary) {
                System.out.println(staff);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy nhân viên có lương " + salary);
        }
    }

    //6. sap xep
    //6.1. sap xep nhan vien theo thu nhap
    public void sortByIncome(ArrayList<Staff> listStaff) {
        for (int i = 0; i < listStaff.size() - 1; i++) {
            for (int j = 0; j < listStaff.size() - i - 1; j++) {
                if (listStaff.get(j).calIncome() > listStaff.get(j + 1).calIncome()) {
                    Staff temp = listStaff.get(j);
                    listStaff.set(j, listStaff.get(j + 1));
                    listStaff.set(j + 1, temp);
                }
            }
        }
        System.out.println("After Sorting: ");
        for (Staff staff : listStaff) {
            System.out.println(staff);
        }
    }

    //6.2. sap xep nhan vien theo ten
    public void sortByName(ArrayList<Staff> listStaff) {
        for (int i = 0; i < listStaff.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < listStaff.size(); j++) {
                if (listStaff.get(j).getName().compareTo(listStaff.get(minIndex).getName()) < 0) {
                    minIndex = j;
                }
            }
            Staff temp = listStaff.get(i);
            listStaff.set(i, listStaff.get(minIndex));
            listStaff.set(minIndex, temp);
        }
        System.out.println("After Sorting: ");
        for (Staff staff : listStaff) {
            System.out.println(staff);
        }
    }

    //7. top5 nhan vien co thu nhap cao nhat
    public void topFiveStaff(ArrayList<Staff> listStaff) {
        for (int i = 0; i < listStaff.size() - 1; i++) {
            for (int j = i + 1; j < listStaff.size(); j++) {
                if (listStaff.get(i).calIncome() < listStaff.get(j).calIncome()) {
                    Staff temp = listStaff.get(i);
                    listStaff.set(i, listStaff.get(j));
                    listStaff.set(j, temp);
                }
            }
        }
        System.out.println("Danh sách 5 nhân viên có thu nhập cao nhất:");
        for (int i = 0; i < 5 && i < listStaff.size(); i++) {
            System.out.println((i + 1) + ". " + listStaff.get(i));
        }
    }
}