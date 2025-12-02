import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String str = br.readLine().trim();

            if ( str.isEmpty() ) {
                bw.write("0");
            } else {
                String words[] = str.split( " " );
    
                bw.write( words.length +  "" );
            }
        }
    }
}