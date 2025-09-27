import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = Integer.parseInt(bf.readLine());
        for (int i = 0 ; i < cnt; i++ ) {
            String[] nums = bf.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            String result = (a + b) + "";
            bw.write("Case #"+(i+1)+ ": " + result+"\n");
        }
        bw.flush();
        bw.close();
    }
}