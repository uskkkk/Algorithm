import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        for (int i = 0 ; i < num_list.length ; i++ ) {
            for (int j = 0 ; j < num_list.length ; j++ ) {
                if (num_list[i] < num_list[j]) {
                    int tmp = num_list[i];
                    num_list[i] = num_list[j];
                    num_list[j] = tmp;   
                }
            }
        }
        int[] answer = Arrays.copyOf(num_list,5);
        return answer;
    }
}