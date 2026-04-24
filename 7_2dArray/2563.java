import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer st = new StringTokenizer( br.readLine() );
            
            int qty = Integer.parseInt( st.nextToken() );
            int[][] whitePaper = new int[100][100];
            int[][] colorPaperArr = new int[qty][2];

            for ( int i = 0; i < qty; i++ ) {
                st = new StringTokenizer( br.readLine() );

                for ( int j = 0; j < 2; j++ ) {
                    colorPaperArr[i][j] = Integer.parseInt( st.nextToken() );
                }
            }

            
            for ( int i = 0; i < qty; i++ ) {
                for ( int j = 0; j < 10; j++ ) {
                    for ( int k = 0; k < 10; k++ ) {
                        whitePaper[ colorPaperArr[i][0] + j ][ colorPaperArr[i][1] + k ]++;
                    }
                }
            }
            
            int counter = 0;
            for ( int i = 0; i < 100; i++ ) {
                for ( int j = 0; j < 100; j++ ) {
                    if ( whitePaper[i][j] > 0 ) {
                        counter++;
                    }
                }
            }

            bw.write( counter + "" );
        }
    }
}