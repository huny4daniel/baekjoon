import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();

        if (score < 60) {
            System.out.println("F");
        }
        else if (score < 70) {
            System.out.println("D");
        }
        else if (score < 80) {
            System.out.println("C");
        }
        else if (score < 90) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
        
        scan.close();
    }
}