import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(br.readLine());
        int front = 0;
        int result = cnt;
        for (int i = 0; i < cnt; i++) {
            String T = br.readLine();
            for (int j = 0; j < T.length(); j++) {
                int b = T.indexOf(T.charAt(j));
                if (front > b && j != 0) {
                    result--;
                    break;
                }
                front = b;
            }
        }
        bw.write(result+"");
        bw.flush();
        bw.close();
    }
}
