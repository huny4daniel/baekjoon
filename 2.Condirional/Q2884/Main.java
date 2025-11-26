import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int h = scan.nextInt();
        int m = scan.nextInt();

        if ( ( m - 45 ) < 0 ) {
            if ( ( h - 1 ) < 0 ) {
                h = 24 + ( h - 1 );
            }
            else {
                h = h -1;
            }

            m = 60 + ( m - 45 );
        }
        else {
            m = m - 45;
        }

        System.out.println( h + " " + m);
    }
}