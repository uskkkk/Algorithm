import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length ; i++ ) {
            if(flag[i]) {
                for (int j = 0 ; j < arr[i] * 2 ; j++ ) {
                    list.add(arr[i]);
                }
            } else {
                for (int k = arr[i] ; k > 0 ; k-- ) {
                    list.remove(list.size() - k);
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for (int p = 0 ; p < list.size() ; p++ ) {
            answer[p] = list.get(p);
        }
        
        return answer;
    }
}