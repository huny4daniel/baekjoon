import java.io.*;
import java.util.Map;
import java.util.HashMap;

class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            String input = br.readLine();

            char[] inputArr = new char[ input.length() ];
            Map<Character, Integer> charCounter = new HashMap<>();
            
            for ( int i = 0; i < input.length(); i++ ) { 
                inputArr[i] = input.charAt(i);

                if ( inputArr[i] >= 97 && inputArr[i] <= 122 ) {
                    inputArr[i] -= 32;
                }
                
                charCounter.put( inputArr[i], 0 );
            }
            
            for ( int i = 0; i < input.length(); i++ ) {
                charCounter.put( inputArr[i], charCounter.get(inputArr[i]) + 1 );
            }
            
            char maxChar = 0;
            boolean draw = false;
            for ( char key : charCounter.keySet() ) {
                if ( maxChar == 0 || charCounter.get( maxChar ) < charCounter.get( key )) {
                    maxChar = key;
                    draw = false;
                }
                else if (charCounter.get( maxChar ).equals( charCounter.get( key ) )) {
                    draw = true;
                }
                else {
                    continue;
                }
            }

            if (draw == true) {
                maxChar = '?';
            }

            bw.write( maxChar );
        }
    }
}