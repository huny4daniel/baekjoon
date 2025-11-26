import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int num = n / 4;

        for ( int i = 0; i < num; i++ ) {
            System.out.print( "long " );
        }
        System.out.println( "int" );
    }
}