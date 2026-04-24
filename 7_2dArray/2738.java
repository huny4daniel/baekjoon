import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );

            int n = Integer.parseInt( st.nextToken() );
            int m = Integer.parseInt( st.nextToken() );

            int a[][] = new int[n][m]; 
            int b[][] = new int[n][m]; 
            int output[][] = new int[n][m]; 

            for ( int i = 0; i < (n * 2); i++ ) {
                st = new StringTokenizer( br.readLine() );

                if ( i < n ) {
                    for ( int j = 0; j < m; j++ ) {
                        a[i][j] = Integer.parseInt( st.nextToken() );
                        output[i][j] = a[i][j];
                    }
                }
                else {
                    for ( int j = 0; j < m; j++ ) {
                        b[i - n][j] = Integer.parseInt( st.nextToken() );
                        output[i - n][j] += b[i - n][j];
                    }
                }
            }

            for ( int i = 0; i < n; i++ ) {
                for ( int j = 0; j < m; j++ ) {
                    if ( j < m - 1 ) {
                        bw.write( output[i][j] + " ");
                    } 
                    else {
                        bw.write( output[i][j] + "");
                    }
                }

                if ( i < n - 1 ) {
                    bw.write( "\n" );
                }
            }
        }
    }
}