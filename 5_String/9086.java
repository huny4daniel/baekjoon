import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int t = Integer.parseInt( br.readLine() );

            for ( int i = 0; i < t; i++ ) {
                String str = br.readLine();
                String strs[] = str.split( "" );
                bw.write( strs[0] + strs[ strs.length - 1 ] + "\n" );
            }
        }
    }
}