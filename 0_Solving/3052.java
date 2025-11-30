import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int b = 42;

            int remain[] = new int[10];
            for ( int i = 0; i < 10; i++ ) {
                int a = Integer.parseInt( br.readLine() );
                remain[i] = a % b;
            }

            int count = 10 * 2;
            for ( int i = 0; i < 10; i++ ) {
                for ( int j = 0; j < 10; j++ ) {
                    if ( i == j ) {
                        continue;
                    }
                    if ( remain[i] == remain[j] ) {
                        count --;
                    }
                }
            }

            bw.write( count / 2 + "" );
        }
    }
}