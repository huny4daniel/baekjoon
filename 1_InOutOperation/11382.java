import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Long a = scan.nextLong();
        Long b = scan.nextLong();
        Long c = scan.nextLong();
        
        System.out.println(a + b + c);

        scan.close();
    }
}