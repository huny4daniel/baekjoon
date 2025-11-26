import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();

        int q;
        
        if (x > 0 && y > 0) {
            q = 1;
        }
        else if (x < 0 && y > 0) {
            q = 2;
        }
        else if (x < 0 && y < 0) {
            q = 3;
        }
        else {
            q = 4;
        }

        System.out.println(q);
    }
}