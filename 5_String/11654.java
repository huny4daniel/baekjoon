import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String ch = br.readLine();
            int ascii = ch.charAt(0);

            bw.write( ascii + "" );
        }
    }
}