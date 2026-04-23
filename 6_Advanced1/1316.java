import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            int num = Integer.parseInt(br.readLine());

            String[] wordArr = new String[num];
            for ( int i = 0; i < num; i++ ) {
                wordArr[i] = br.readLine();
            }

            int counter = 0;
            for ( int i = 0; i < wordArr.length; i++ ) {
                String[] charArr = wordArr[i].split(""); 
                Set<String> history = new HashSet<>();
                boolean groupWord = true;

                for ( int j = 0; j < charArr.length; j++ ) {
                    if ( j == 0 ) {
                        history.add(charArr[j]);
                    }
                    else {
                        if ( !charArr[j].equals(charArr[j - 1])  ) {
                            if ( !history.contains( charArr[j] ) ) {
                                history.add(charArr[j]);
                            } 
                            else {
                                groupWord = false;
                                break;
                            }
                        }
                    }
                }

                if ( groupWord == true ) {
                    counter++;
                }
            }

            bw.write( counter + "" );
        }
    }
}