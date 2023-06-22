package Week2_2206;

import java.util.Scanner;

public class Main {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so cua bai tap can test tu 1 den 20");
        System.out.println("Nhap 0 de dung lai");
        int input;
        while (true) {
            input = sc.nextInt();
            if (input == 0) {
                sc.close();
                System.out.println("Done!!!");
                break;
            } else {

                switch (input) {
                    case 1:
                        System.out.println("bai 1:");
                        System.out.println(Bai1.sumArray());
                        break;

                    case 2:
                        System.out.println("bai 2: ");
                        System.out.println(Bai2.convertFromArrayList());
                        break;
                    case 3:
                        System.out.println("bai 3:");
                        System.out.println(Bai3.revertLinkedList());
                        break;
                    case 4:
                        System.out.println("bai 4:");
                        System.out.println(Bai4.findMax());
                        break;
                    case 5:
                        System.out.println("bai 5:");
                        System.out.println(Bai5.printHashMap(Bai5.storeStudents()));
                        break;
                    case 6:
                        System.out.println("bai 6:");
                        System.out.println(Bai6.isContainValue());
                        break;
                    case 7:
                        System.out.println("bai 7:");
                        System.out.println(Bai7.sorList());
                        break;
                    case 8:
                        System.out.println("bai 8:");

                        break;
                    case 9:
                        System.out.println("bai 9:");

                        break;
                    case 10:
                        System.out.println("bai 10:");
                        System.out.println(Bai10.removeString());
                        break;
                    case 11:
                        System.out.println("bai 11:");
                        System.out.println(Bai11.copyOfArrayList());
                        break;
                    case 12:
                        System.out.println("bai 12:");
                        System.out.println(Bai12.print(Bai12.countLoopString()));
                        break;
                    case 13:
                        System.out.println("bai 13:");

                        break;
                    case 14:
                        System.out.println("bai 14:");
                        System.out.println(Bai14.isEmptyList());
                        break;
                    case 15:
                        System.out.println("bai 15:");

                        break;
                    case 16:
                        System.out.println("bai 16:");

                        break;
                    case 17:
                        System.out.println("bai 17:");

                        break;
                    case 18:
                        System.out.println("bai 18:");

                        break;
                    case 19:
                        System.out.println("bai 19:");

                        break;
                    case 20:
                        System.out.println("bai 20:");

                        break;
                    default:
                        System.out.println("khong ton tai");
                        break;
                }
                System.out.println("-----------------");
                System.out.println("nhap bai tiep theo: ");
            }
        }
    }

    public static void main(String[] args) {
        run();
    }
}
