import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );

            int findPiece[] = { 1, 1, 2, 2, 2, 8 };

            for ( int i = 0; i < findPiece.length; i++ ){
                findPiece[i] = findPiece[i] - Integer.parseInt( st.nextToken() );
                bw.write( findPiece[i] + " " );
            }
        }
    }
}