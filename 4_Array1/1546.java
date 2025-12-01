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
            double score[] = new double[n];
            for ( int i = 0; i < n; i++ ) {
                score[i] = Integer.parseInt( st.nextToken() );
            }

            double m = score[0];
            for ( int i = 1; i < score.length; i++ ) {
                if ( m < score[i] ) {
                    m = score[i];
                }
            }

            double sum = 0;
            for ( int i = 0; i < score.length; i++ ) {
                 sum += score[i] / m * 100;
            }

            bw.write( (sum / n) + "" );
        }
    }
}