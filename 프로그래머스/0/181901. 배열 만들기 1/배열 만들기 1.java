class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int loop = n / k;
        int origin = k;
        for (int i = 0 ; i < loop ; i++) {
            answer[i] = k;
            k = origin + k;
        }
        return answer;
    }
}