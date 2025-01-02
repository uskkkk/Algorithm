import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<String>();
        String[] bucket = my_string.split(" ");
        
        for (int i = 0 ; i < bucket.length ; i++ ) {
            if (!bucket[i].isEmpty()) {
                list.add(bucket[i]);    
            }
        }
        
        System.out.print(list);
        
        return list.toArray(new String[list.size()]);
    }
}