import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static char converter(char input) {
        int result = 0;

        if ( input >= 65 && input <= 90 ) {
            result = input - 55;
        } 
        else if ( input >= 48 && input <= 57 ) {
            result = input - 48;
        }
        
        return (char)result;
    }

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );

            char[] n = st.nextToken().toCharArray();
            int b = Integer.parseInt( st.nextToken() );

            int output = 0;

            for ( int i = 0; i < n.length; i++ ) {
                n[i] = converter( n[i] );
            }

            int p = 0;
            for ( int i = n.length - 1; i >= 0; i-- ) {
                output += (int)n[i] * (int)Math.pow(b, p++);
            }

            bw.write( output + "" );
        }
    }
}