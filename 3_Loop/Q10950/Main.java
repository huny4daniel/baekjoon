import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int a[] = new int[t];
        int b[] = new int[t];
        
        for ( int i = 0; i < t; i++) {
            a[i] = scan.nextInt();
            b[i] = scan.nextInt();
        }

        for ( int i = 0; i < t; i++) {
            System.out.println(a[i] * b[i]);
        }

        scan.close();
    }
}