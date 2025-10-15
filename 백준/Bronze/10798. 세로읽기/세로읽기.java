import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] arr = new String[5][15];

        for (int i = 0; i < arr.length; i++) {
            String[] texts = br.readLine().split("");
            for (int j = 0; j < arr[i].length; j++) {
                if (j < texts.length) {
                    arr[i][j] = texts[j];
                } else {
                    arr[i][j] = "";
                }
            }
        }
        for (int k = 0; k < 15; k++) {
            for (int h = 0; h < 5; h++) {
                bw.write(arr[h][k] + "");
            }
        }

        bw.flush();
        bw.close();
    }
}
