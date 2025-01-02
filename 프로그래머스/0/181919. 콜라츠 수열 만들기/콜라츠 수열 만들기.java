import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        while(n > 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = (3 * n) + 1;
            }
        }
        list.add(n);
        
        return list.stream().mapToInt(Integer::new).toArray();
    }
}