import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static double scoreConverter(String grade) {
        double score;
        switch (grade) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
            
            default:
                return -1;
        }

        return score;
    }

    public static void main(String[] args) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) 
        ) {
            StringTokenizer[] st = new StringTokenizer[20];
            for ( int i = 0; i < st.length; i++ ) {
                st[i] = new StringTokenizer( br.readLine() );
            }

            double majorSum = 0;
            double creditSum = 0;

            String[] subjectArr = new String[st.length];
            double[] creditArr = new double[st.length];
            double[] scoreArr = new double[st.length];

            for ( int i = 0; i < st.length; i++ ) {
                subjectArr[i] = st[i].nextToken();
                creditArr[i] = Double.parseDouble( st[i].nextToken() );
                scoreArr[i] = scoreConverter( st[i].nextToken() );

                if ( scoreArr[i] != -1 ) {
                    majorSum += creditArr[i] * scoreArr[i];
                    creditSum += creditArr[i];
                }
            }            
            
            double majorAvg = majorSum / creditSum;

            bw.write( String.format("%.6f", majorAvg) );
        }
    }
}