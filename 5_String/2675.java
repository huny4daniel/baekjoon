import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int t = Integer.parseInt( br.readLine() );
            
            for ( int i = 0; i < t; i++ ) {
                StringTokenizer st = new StringTokenizer( br.readLine() );
                int r = Integer.parseInt( st.nextToken() );
                String s = st.nextToken();

                String str[] = s.split( "" );
                for ( int j = 0; j < s.length(); j++ ) {
                    for ( int k = 0; k < r; k++ ) {
                        bw.write( str[j] );
                    }
                }
                
                bw.write( "\n" );
            }
        }
    }
}