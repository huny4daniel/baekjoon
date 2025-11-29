import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int max = Integer.parseInt( br.readLine() );
            int num = 1;
            for ( int i = 2; i <= 9; i++ ) {
                int a = Integer.parseInt( br.readLine() );

                if ( a > max ) {
                    max = a;
                    num = i;
                }
            }

            bw.write( max + "\n" + num );
        }
    }
}