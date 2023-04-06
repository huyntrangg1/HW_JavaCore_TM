import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int number = Integer.parseInt(sc.nextLine());
        while (number <= 0) {
            System.out.print("Invalid! Enter again: ");
            number = Integer.parseInt(sc.nextLine());
        }
        SinhVienTechmaster[] sinhVien = new SinhVienTechmaster[number];

        // nhập phần tử của mạng:
        for (int i = 0; i < sinhVien.length; i++) {
            System.out.println("Enter your fullname: ");
            String fullname = sc.nextLine();
            System.out.println("Enter your major (IT or BIZ): ");
            String major = sc.nextLine();

            // kiem tra major người dùng nhập vào
            while (!major.equalsIgnoreCase("it") && !major.equalsIgnoreCase("biz")) {
                System.out.print("Major does not exist. Enter again: ");
                major = sc.nextLine();
            }
            //major check: "it" or "biz"
            if (major.equalsIgnoreCase("it")) {
                SinhVienIT svIt = new SinhVienIT(fullname, major, inputScore(sc, "Java"),
                        inputScore(sc, "Html"), inputScore(sc, "Css"));
                sinhVien[i] = svIt;
            } else if (major.equalsIgnoreCase("biz")) {
                SinhVienBiz svB = new SinhVienBiz(fullname, major, inputScore(sc, "Marketting"),
                        inputScore(sc, "Sales"));
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

    public static double inputScore(Scanner sc, String subject) {
        double score = -1;
        while (score < 0 || score > 10) {
            System.out.println("Enter your score of " + subject + ": ");
            score = Double.parseDouble(sc.nextLine());
            if (score < 0 || score > 10) {
                System.out.print("Score must be between 0 and 10. Please try again! ");
            }
        }
        return score;
    }
}

