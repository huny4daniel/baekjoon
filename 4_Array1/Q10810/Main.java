import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );
            int n = Integer.parseInt( st.nextToken() );
            int m = Integer.parseInt( st.nextToken() );

            int box[] = new int[n];
            for ( int t = 0; t < m; t++ ) {
                st = new StringTokenizer( br.readLine() );
                int i = Integer.parseInt( st.nextToken() );
                int j = Integer.parseInt( st.nextToken() );
                int k = Integer.parseInt( st.nextToken() );

                for ( int p = i - 1; p < j; p++ ) {
                    box[p] = k;
                }
            }

            for ( int t = 0; t < n; t++ ) {
                bw.write( box[t] + " " );
            }
        }
    }
}