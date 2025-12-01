import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int n = Integer.parseInt( br.readLine() );

            String num = br.readLine();
            String strNums[] = num.split( "" );
            int intNums[] = new int[ strNums.length ];

            for ( int i = 0; i < strNums.length; i++ ) {
                intNums[i] = Integer.parseInt( strNums[i] );
            }

            int sum = 0;
            for ( int i = 0; i < intNums.length; i++ ) {
                sum += intNums[i];
            }

            bw.write( sum + "" );
        }
    }
}