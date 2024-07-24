import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        
        int count = 1;
        while ((n / count) != 1 ) {
            if (n % count == 0) {
                list.add(n / count);
            }
            count++;
        }
        
        list.add(1);
        answer = list.stream()
                .mapToInt(i -> i)
                .sorted()
                .toArray();
        
        return answer;
    }
}