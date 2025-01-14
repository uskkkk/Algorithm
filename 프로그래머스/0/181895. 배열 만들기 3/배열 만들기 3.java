import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < intervals.length ; i++) {
            for (int j = 0 ; j < intervals[i].length ; j++ ) {
                if (j == 0) {
                    for (int k = intervals[i][j] ; k <= intervals[i][j+1] ; k++) {
                       list.add(arr[k]);
                    }    
                }
                
            }
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}