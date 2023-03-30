import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //bai 1
        System.out.println("Excercise 1: ");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String[] arrName = name.split("\t");
        System.out.print("→ ");
        for (String word : arrName) {
            System.out.print(word.toUpperCase());
        }

        //bai2
        //nhap so phan tu
        System.out.println("\nExcercise 2: ");
        System.out.println("Nhập số phần tử của mảng: ");
        int numberArray = sc.nextInt();

        //kiem tra so am hay duong
        while (numberArray <= 0) {
            System.out.println("Số phần tử của mạng không được nhỏ hơn hoặc bằng 0. \nHãy nhập lại số phần tử: ");
            numberArray = sc.nextInt();
        }
        int[] array = new int[numberArray];

        //nhap mang
        for (int i = 0; i < numberArray; i++) {
            System.out.println("Mời bạn nhập số thứ " + (i + 1) + " trong mảng: ");
            array[i] = sc.nextInt();
        }

        //in mang
        System.out.print("array = [");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.print("\b]");

        //in lai mang sau khi tang 1dvi cho phan tu so chan
        System.out.print("\nCác phần tử là số chẵn trong mảng tăng lên 1 đơn vị: array = [");
        for (int i : array) {
            if (i % 2 == 0) {
                i++;
            }
            System.out.print(i + " ");
        }
        System.out.print("\b]");


        //bai3
        System.out.println("\nExcercise 3: ");
        System.out.print("Nhập số phần tử của mảng: ");
        int numberOfEle = sc.nextInt();

        //kiem tra so am hay duong
        while (numberOfEle <= 0) {
            System.out.println("Số phần tử của mạng không được nhỏ hơn hoặc bằng 0. \nHãy nhập lại số phần tử: ");
            numberOfEle = sc.nextInt();
        }

        int[] arr = new int[numberOfEle];

        //nhap mang
        for (int i = 0; i < numberOfEle; i++) {
            System.out.print("Mời bạn nhập số thứ " + (i + 1) + " trong mảng: ");
            arr[i] = sc.nextInt();
        }

        // tim min-max
        //dung for-each
        int max = arr[0];
        int min = arr[0];
        for (int i : arr) {
            if (i > max)
                max = i;

            if (i < min)
                min = i;
        }
        System.out.println("→ max = " + max + ", min = " + min);


        //dung for-i
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) { //max=1;
//            if (arr[i] > max) max = arr[i];
//            if (arr[i] < min) min = arr[i];
//        }
//        System.out.println("max = " + max);
//        System.out.println("min = " + min);
//        min = array[0];
//        for (int j : array) {
//            if (j < min) {
//                min = j;
//            }
//        }
//        System.out.print("min = " + min);


        //Ex2: dung for-i
//        System.out.println("\nExcercise 2: ");
//        System.out.println("Nhập số phần tử của mảng: ");
//        int numberArray = sc.nextInt();
//        int[] array = new int[numberArray];
//
//        //nhap mang
//        for (int i = 0; i < numberArray; i++) {
//            System.out.println("Mời bạn nhập số thứ " + (i + 1) + " trong mảng: ");
//            array[i] = sc.nextInt();
//        }
//
//        System.out.print("array = [");
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.print("\b]");

//        System.out.print("\nCác phần tử là số chẵn trong mảng tăng lên 1 đơn vị: array = [");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                array[i]++;
//            }
//            System.out.print(array[i] + " ");
//        }
//    System.out.print("\b]");
    }
}
