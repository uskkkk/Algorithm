import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String T = br.readLine();
        int length = T.length();
        String result = "1";
        for (int i = 0; i < length; i++) {
            char a = T.charAt(i);
            char b = T.charAt(T.length() - 1 - i);
            if (a != b) {
                result = "0";
                break;
            }
        }
        bw.write(result);
        bw.flush();
        bw.close();
    }
}
