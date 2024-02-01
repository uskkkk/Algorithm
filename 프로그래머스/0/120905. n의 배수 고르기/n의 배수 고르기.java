import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < numlist.length ; i++ ) {
            if (numlist[i] % n == 0) {
                list.add(numlist[i]);
                cnt++;
            }
        }
        
        
        int[] answer = new int[cnt];
        
        for (int j = 0 ; j < list.size() ; j++ ) {
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}