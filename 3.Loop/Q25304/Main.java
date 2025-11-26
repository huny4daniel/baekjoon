import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int n = scan.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        int total = 0;

        for ( int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        for ( int i = 0; i < n; i++) {
            total += a[i] * b[i];
        }        

        if (total == x) {
            System.out.println( "Yes" );
        }
        else {
            System.out.println( "No" );
        }
    }
}