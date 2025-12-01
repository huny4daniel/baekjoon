import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String s = br.readLine();
            int i = Integer.parseInt( br.readLine() );

            String c[] = s.split("");

            bw.write( c[ i-1 ] );
        }
    }
}