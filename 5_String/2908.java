import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );

            String a = st.nextToken();
            String aa[] = a.split( "" );
            
            String b = st.nextToken();
            String bb[] = b.split( "" );
            
            String reversedA[] = new String[3];
            String reversedB[] = new String[3];
            for ( int i = 0; i < 3; i++ ) {
                reversedA[i] = aa[ aa.length - 1 - i];
                reversedB[i] = bb[ bb.length - 1 - i];
            }

            a = b = "";
            for ( int i = 0; i < 3; i++ ) {
                a += reversedA[i];
                b += reversedB[i];
            }

            int intA = Integer.parseInt(a);
            int intB = Integer.parseInt(b);

            if ( intA > intB ) {
                bw.write( a + "\n" );
            } else {
                bw.write( b + "\n" );
            }
        }
    }
}