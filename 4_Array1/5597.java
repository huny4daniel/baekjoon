import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int student[] = new int[30];

            for ( int i = 0; i < 28; i++ ) {
                int check = Integer.parseInt( br.readLine() ); 
                student[check-1] = 1;
            }
            for ( int i = 0; i < 30; i++ ) {
                if ( student[i] == 0 ) {
                    bw.write( i+1 + "\n" );
                }
            }
        }
    }
}