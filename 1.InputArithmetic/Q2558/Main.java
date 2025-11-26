import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int b100, b10, b1;

        b100 = b / 100;
        b10 =  (b % 100) / 10;
        b1 = (b % 100) % 10;

        System.out.println(a * b1);
        System.out.println(a * b10);
        System.out.println(a * b100);
        System.out.println(a * b);
    }
}