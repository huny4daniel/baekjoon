import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int max = -1;
            int[] maxAddr = new int[2];
            
            int[][] matrix = new int[9][9];
            for ( int i = 0; i < 9; i++ ) {
                StringTokenizer st = new StringTokenizer( br.readLine() );

                for ( int j = 0; j < 9; j++ ) {
                    matrix[i][j] = Integer.parseInt( st.nextToken() );
                }
            }

            for ( int i = 0; i < 9; i++ ) {
                for ( int j = 0; j < 9; j++ ) {
                    if ( max < matrix[i][j] ) {
                        max = matrix[i][j];
                        maxAddr[0] = i + 1;
                        maxAddr[1] = j + 1;
                    }
                }
            }

            bw.write( max + "\n" );
            bw.write( maxAddr[0] + " " + maxAddr[1] );
        }
    }
}