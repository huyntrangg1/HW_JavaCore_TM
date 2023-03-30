import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continues = "";
        //dung do-while
        do {
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your address: ");
            String address = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            while (age <= 0) {
                System.out.println("Không hợp lệ! Hãy nhập lại tuổi của bạn: ");
                age = sc.nextInt();
            }
            sc.nextLine();

            System.out.println("Your name: " + name);
            System.out.println("Your address: " + address);
            System.out.println("Your age: " + age);
            System.out.println("Do you want to continues?(Y/N)");
            continues = sc.nextLine();
        } while (continues.equalsIgnoreCase("y"));

        //dung while
//        char ans = 'y';
//        while (ans == 'y') {
//            System.out.println("Enter your name: ");
//            String urName = sc.nextLine();
//            System.out.println("Enter your address: ");
//            String urAddress = sc.nextLine();
//            System.out.println("Enter your age: ");
//            int urAge = sc.nextInt();
//            System.out.println("Your name: " + urName);
//            System.out.println("Your address: " +urAddress);
//            System.out.println("Your age: " + urAge);
//            System.out.println("Do you want to continues?(Y/N)");
//            ans = sc.next().charAt(0);
//            sc.nextLine();
//        }
    }
}
