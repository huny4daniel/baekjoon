import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String dialChr = br.readLine();
            int dialNum;
            int time = 0;

            for ( int i = 0; i < dialChr.length(); i++ ) {
                switch ( dialChr.charAt(i) ) {
                    case 'S', 'V', 'Y', 'Z':
                        dialNum = ( dialChr.charAt(i) - 'A' ) / 3;
                        time += dialNum + 2;
                        break;
                
                    default:
                        dialNum = ( dialChr.charAt(i) - 'A' ) / 3;
                        time += dialNum + 3;
                        break;
                }
            }

            bw.write( time + "" );
        }
    }
}