import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Mời bạn nhập tên hàng nhập kho: ");
                String name = sc.nextLine();

                System.out.println("Mời bạn nhập ngày tháng năm sinh: ");
                String dateBirth = sc.nextLine();
                LocalDate birthDate = LocalDate.parse(dateBirth, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

                System.out.println("Mời bạn nhập thời gian nhập hàng: ");
                String timeImport = sc.nextLine();
                LocalDateTime importTime = LocalDateTime.parse(timeImport, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

                System.out.println("Mời bạn nhập thời gian: ");
                String time = sc.nextLine();
                LocalTime timeS = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println("Tên hàng nhập là: " + name);
                System.out.println("Ngày tháng năm sinh là: " + birthDate);
                System.out.println("Thời gian ngày nhập hàng là: " + importTime);
                System.out.println("Thời gian nhập hàng là: " + timeS);
            }
        }
