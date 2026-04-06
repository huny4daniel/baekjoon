import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String input = br.readLine();
            String[] charArr = input.split("");
            
            int check = 1;
            for ( int i = 0; i < ( charArr.length / 2); i++ ) {
                if ( !charArr[i].equals( charArr[ charArr.length - 1 - i ] ) ) {
                    check = 0;

                    break;
                }
            }

            bw.write( check + "" );
        }
    }
}