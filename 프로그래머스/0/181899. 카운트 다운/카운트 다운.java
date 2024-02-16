class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int cnt = 0;
        for (int i = start ; start >= end_num ; start--) {
            answer[cnt] = start;
            cnt++;
        }
        return answer;
    }
}