import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String s = br.readLine();

            int count[] = new int[26];
            Arrays.fill( count, -1 );

            for ( int i = 0; i < s.length(); i++ ) {
                int index = s.charAt( i ) - 'a';
                if ( count[index] == -1 ) {
                    count[index] = i;
                }
            }

            for ( int i = 0; i < count.length; i++ ){
                bw.write( count[i] + " " );
            }
        }
    }
}