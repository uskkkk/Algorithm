import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {}; 
        List<Integer> result = new ArrayList();
        List<Integer> left = new ArrayList();
        List<Integer> right = new ArrayList();
        for (int i = 0 ; i < num_list.length ; i++ ) {
            if (n > i) {
                right.add(num_list[i]);
            } else {
                left.add(num_list[i]);
            }
        }
        for (int num : left) {
            result.add(num);
        }
        for (int num : right) {
            result.add(num);
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}