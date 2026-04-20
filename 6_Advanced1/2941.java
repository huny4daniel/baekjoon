import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String input = br.readLine();
            
            String[] alphabet = input.split("");

            int count = 0;
            boolean isCro = false;
            for ( int i = 0; i < alphabet.length; i++ ) {
                if ( i + 1 < alphabet.length ) {
                    switch (alphabet[ i ] + alphabet[ i + 1 ]) {
                        case "c=":
                        case "c-":
                        case "d-":
                        case "lj":
                        case "nj":
                        case "s=":
                        case "z=":
                            count++;
                            i++;
                            isCro = true;
                            break;
                    }
                }

                if ( i + 2 < alphabet.length && isCro == false ) {
                    switch (alphabet[ i ] + alphabet[ i + 1 ] + alphabet[ i + 2 ]) {
                    case "dz=":
                        count++;
                        i = i + 2;
                        isCro = true;
                        break;
                    }
                }

                if (isCro == false) {
                    count++;
                }

                isCro = false;
            }

            bw.write( count + "" );
        }
    }
}