import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int score, max;

        if ( a == b && b == c ) {
            score = 10000 + ( a * 1000 );
        }
        else if ( a == b || a == c ) {
            score = 1000 + ( a * 100 ); 
        }
        else if ( b == c ) {
            score = 1000 + ( b * 100 ); 
        }
        else {
            if ( a > b && a > c ) {
                max = a;
            }
            else if ( b > a && b > c ) {
                max = b;
            }
            else {
                max = c;
            }

            score = max * 100;
        }

        System.out.println( score );

        scan.close();
    }
}