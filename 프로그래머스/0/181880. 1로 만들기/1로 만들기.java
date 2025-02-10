class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i : num_list) {
            int num = i;
            while(num != 1) {
                if (num % 2 == 0) {
                    num = num / 2;
                    answer++;
                } else {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}