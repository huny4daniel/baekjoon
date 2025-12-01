import java.io.*;
import java.util.Arrays;

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

            int remain2[] = Arrays.stream( remain ).distinct().toArray();

            bw.write( remain2.length + "" );
        }
    }
}