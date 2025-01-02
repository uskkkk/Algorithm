import java.util.Arrays;

class Solution {
    public int[] solution(String myString) {
        
        String[] cut = myString.split("x",-1);
        int[] answer = new int[cut.length];
        for (int i = 0 ; i < cut.length ; i++) {
            answer[i] = cut[i].length();
        }
        return answer;
    }
}