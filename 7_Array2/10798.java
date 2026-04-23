import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String[][] matrix = new String[5][];
            for ( int i = 0; i < 5; i++ ) {
                matrix[i] = br.readLine().split("");
            }

            String output = "";
            for ( int i = 0; i < 15; i++ ) {
                for ( int j = 0; j < 5; j++ ) {
                    if ( i < matrix[j].length ) {
                        output += matrix[j][i];
                    }
                }
            }
            
            bw.write( output );
        }
    }
}