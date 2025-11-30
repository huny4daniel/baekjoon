import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int n = Integer.parseInt( br.readLine() );
            StringTokenizer st = new StringTokenizer( br.readLine() );
            int v = Integer.parseInt( br.readLine() );

            int count = 0;

            for ( int i = 0; i < n; i++ ) {
                int a = Integer.parseInt( st.nextToken() );

                if ( a == v ) {
                    count++;
                }
            }

            bw.write( count + "\n" );
        }
    }
}