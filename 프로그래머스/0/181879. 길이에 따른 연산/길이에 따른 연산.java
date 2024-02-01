class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int times = 1;
        for (int i = 0 ; i < num_list.length ; i++ ) {
            if (num_list.length >= 11) {
                answer += num_list[i];
            } else {
                times *= num_list[i] * 1;
            }
        }
        answer = times == 1 ? answer : times;
        return answer;
    }
}