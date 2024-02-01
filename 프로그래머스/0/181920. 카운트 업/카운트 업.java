class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int loop = end_num - start_num + 1;
        for (int i = 0 ; i < loop ; i++) {
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}