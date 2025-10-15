import java.io.*;

public class Main {

    private final static double[] MAJOR_SCORE = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double score = 0;
        double credit = 0;
        String temp;
        while ((temp = br.readLine()) != null) {
            String[] subs = temp.split(" ");
            if (subs[2].equals("P")) {
                continue;
            }
            credit += Double.parseDouble(subs[1]);
            score += Double.parseDouble(subs[1]) * selectScore(subs[2]);
        }
        bw.write((score / credit) + "");
        bw.flush();
        bw.close();
    }

    private static double selectScore(String c) {
        switch (c) {
            case "A+" : return MAJOR_SCORE[0];
            case "A0" : return MAJOR_SCORE[1];
            case "B+" : return MAJOR_SCORE[2];
            case "B0" : return MAJOR_SCORE[3];
            case "C+" : return MAJOR_SCORE[4];
            case "C0" : return MAJOR_SCORE[5];
            case "D+" : return MAJOR_SCORE[6];
            case "D0" : return MAJOR_SCORE[7];
            case "F" : return MAJOR_SCORE[8];
        }
        return 0.0;
    }
}
