import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        for (int i = 0 ; i < a ; i++) {
            String[] nums = bf.readLine().split(" ");
            int b = Integer.parseInt(nums[0]);
            int c = Integer.parseInt(nums[1]);
            String sum = (b+c)+"";
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}