import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int number = Integer.parseInt(sc.nextLine());
        SinhVienTechmaster[] sinhVien = new SinhVienTechmaster[number];

        // nhập phần tử của mạng:
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println("Enter your fullname: ");
            String fullname = sc.nextLine();
            System.out.println("Enter your major: ");
            String major = sc.nextLine();

            // kiem tra major người dùng nhập vào
            while (!major.equalsIgnoreCase("it") && !major.equalsIgnoreCase("biz")) {
                System.out.println("Chuyên ngành không tồn tại. Xin hãy nhập lại");
                System.out.println("Enter again your major: ");
                major = sc.nextLine();
            }
            //major check: "it" or "biz"
            if (major.equalsIgnoreCase("it")) {
                System.out.println("Enter your score of Java: ");
                double scoreJava = Double.parseDouble(sc.nextLine());
                System.out.println("Enter your score of Html: ");
                double scoreHtml = Double.parseDouble(sc.nextLine());
                System.out.println("Enter your score of Css: ");
                double scoreCss = Double.parseDouble(sc.nextLine());
                SinhVienIT svIt = new SinhVienIT(fullname, major, scoreJava, scoreHtml, scoreCss);
                sinhVien[i] = svIt;

            } else if (major.equalsIgnoreCase("biz")) {
                System.out.println("Enter your score of Marketting: ");
                double scoreMarketing = Double.parseDouble(sc.nextLine());
                System.out.println("Enter your score of Sales: ");
                double scoreSales = Double.parseDouble(sc.nextLine());
                SinhVienBiz svB = new SinhVienBiz(fullname, major, scoreMarketing, scoreSales);
                sinhVien[i] = svB;
            }
        }

        //in ra phan tu trong mang
        for (SinhVienTechmaster i : sinhVien) {
            System.out.println(i);
        }

    }
}

