class Solution {
    public String solution(String n_str) {
        String answer = "";
        Boolean isStop = false;
        
        for (int i = 0 ; i < n_str.length() ; i++) {
            if (n_str.charAt(i) != '0' || isStop) {
                answer += n_str.charAt(i);
                isStop = true;
            }
        }
        return answer;
    }
}