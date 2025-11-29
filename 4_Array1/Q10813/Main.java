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
            for ( int b = 1; b <= n; b++ ) {
                box[b-1] = b;
            }

            for ( int t = 0; t < m; t++ ) {
                st = new StringTokenizer( br.readLine() );
                int i = Integer.parseInt( st.nextToken() );
                int j = Integer.parseInt( st.nextToken() );

                int a = box[i-1];
                int b = box[j-1];
                box[i-1] = b;
                box [j-1] = a;
            }

            for ( int t = 0; t < n; t++ ) {
                bw.write( box[t] + " " );
            }
        }
    }
}