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

            int box[] = new int[n];
            for ( int t = 0; t < box.length; t++) {
                box[t] = t + 1;
            }

            for ( int t = 0; t < m; t++ ) {
                st = new StringTokenizer( br.readLine() );
                int i = Integer.parseInt( st.nextToken() );
                int j = Integer.parseInt( st.nextToken() );
                
                int reverse[] = new int[ box.length ];
                int ii = i;
                for ( int jj = j; jj >= i; jj-- ) {
                    reverse[ ii++ - 1 ] = box[ jj - 1 ];
                }

                for ( int k = 0; k < box.length; k++ ) {
                    if ( reverse[k] != 0 ) {
                        box[k] = reverse[k];
                    }
                }
            }

            for ( int t = 0; t < box.length; t++ ) {
                bw.write( box[t] + " " );
            }

        }
    }
}