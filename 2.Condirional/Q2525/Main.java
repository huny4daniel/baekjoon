import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        b = b + c;

        while ( b >= 60 ) {
            if ( b >= 60 ) {
                a = a + 1;
                b = b - 60;
            }
        }

        if ( a > 23 ) {
            a = a - 24;
        }

        System.out.println( a + " " + b);
    }
}