import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int number = Integer.parseInt(sc.nextLine());
        while (number <= 0) {
            System.out.println("Invalid! Enter again");
        }
        SinhVienTechmaster[] sinhVien = new SinhVienTechmaster[number];

        // nhập phần tử của mạng:
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println("Enter your fullname: ");
            String fullname = sc.nextLine();
            System.out.println("Enter your major: ");
            String major = sc.nextLine();

            // kiem tra major người dùng nhập vào
            while (!major.equalsIgnoreCase("it") && !major.equalsIgnoreCase("biz")) {
                System.out.print("Major does not exist. Enter again: ");
                major = sc.nextLine();
            }
            //major check: "it" or "biz"
            if (major.equalsIgnoreCase("it")) {
                System.out.println("Enter your score of Java: ");
                double scoreJava = Double.parseDouble(sc.nextLine());
                while (scoreJava< 0 || scoreJava > 10) {
                    System.out.print("Score must be between 0 and 10. Please try again: ");
                    scoreJava = Double.parseDouble(sc.nextLine());
                }
                System.out.println("Enter your score of Html: ");
                double scoreHtml = Double.parseDouble(sc.nextLine());
                while (scoreHtml < 0 || scoreHtml > 10) {
                    System.out.print("Score must be between 0 and 10. Please try again: ");
                    scoreHtml = Double.parseDouble(sc.nextLine());
                }
                System.out.println("Enter your score of Css: ");
                double scoreCss = Double.parseDouble(sc.nextLine());
                while (scoreCss < 0 || scoreCss > 10) {
                    System.out.print("Score must be between 0 and 10. Please try again: ");
                    scoreCss = Double.parseDouble(sc.nextLine());
                }
                SinhVienIT svIt = new SinhVienIT(fullname, major, scoreJava, scoreHtml, scoreCss);
                sinhVien[i] = svIt;

            } else if (major.equalsIgnoreCase("biz")) {
                System.out.println("Enter your score of Marketting: ");
                double scoreMarketing = Double.parseDouble(sc.nextLine());
                while (scoreMarketing < 0 || scoreMarketing > 10) {
                    System.out.print("Score must be between 0 and 10. Please try again: ");
                    scoreMarketing = Double.parseDouble(sc.nextLine());
                }
                System.out.println("Enter your score of Sales: ");
                double scoreSales = Double.parseDouble(sc.nextLine());
                if (scoreSales < 0 || scoreSales > 10) {
                    System.out.print("Score must be between 0 and 10. Please try again: ");
                    scoreSales = Double.parseDouble(sc.nextLine());
                }
                SinhVienBiz svB = new SinhVienBiz(fullname, major, scoreMarketing, scoreSales);
                sinhVien[i] = svB;
            }
        }

        //in ra phan tu trong mang:
        System.out.print("Sinh viên Techmaster = {");
        for (SinhVienTechmaster i : sinhVien) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b}");
    }
}

