class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for (int i = 0 ; i < myString.length() ; i++ ) {
            if ('l' < myString.charAt(i) ) {
                answer += myString.charAt(i);
            } else {
                answer += 'l';
            }
        }
        
        return answer;
    }
}