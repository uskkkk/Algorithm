import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        StringBuffer sb = new StringBuffer();
        for (int i = 1 ; i <= a; i++ ) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            bw.write(sb.toString()+"\n");
            sb.delete(0,sb.length());
        }
        bw.flush();
        bw.close();
    }
}