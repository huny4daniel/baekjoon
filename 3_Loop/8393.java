import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int result = 0;

        for ( int i = 0; i <= n; i++ ) {
            result = result + i;
        }

        System.out.println( result );

        scan.close();
    }
}