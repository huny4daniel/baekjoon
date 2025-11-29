import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int n = Integer.parseInt( br.readLine() );

            StringTokenizer st = new StringTokenizer( br.readLine() );
            int first = Integer.parseInt(st.nextToken());
            int max = first;
            int min = first;
            for ( int i = 1; i < n; i++ ){
                int a = Integer.parseInt(st.nextToken());

                if ( a > max ) {
                    max = a;
                }
                if ( a < min ) {
                    min = a;
                }
            }

            bw.write( min + " " + max );
        }
    }
}
