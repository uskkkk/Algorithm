class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] split = my_string.split("");
        
        for (int i = c - 1 ; i < split.length ; i = i + m ) {
            answer += split[i];
        }
        
        return answer;
    }
}